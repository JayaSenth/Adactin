package SampleProject.MavenProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunner {
	public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			List<String> l = new ArrayList<>();
			l.add("igcognito");
			l.add("start-maximized");
			options.addArguments(l);
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.amazon.in/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String exp = "books";
			WebElement drop = driver.findElement(By.id("searchDropdownBox"));
			Select s = new Select(drop);
			List<WebElement> all = s.getOptions();
			for (WebElement each : all) {
				String act = each.getText();
				if (act.equalsIgnoreCase(exp)) {
					s.selectByVisibleText(act);
					break;

				}

			}

			String search = "comics";
			WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));

			searchbox.sendKeys(search);
			Thread.sleep(3000);

			List<WebElement> mulSearch = driver
					.findElements(By.xpath("//div [@class='autocomplete-results-container']/div/div/div"));
			for (WebElement eachSearch : mulSearch) {
				String actSearch = eachSearch.getText();
				if (actSearch.equalsIgnoreCase(search)) {
					eachSearch.click();
					break;
				}
			} // to go to next page driver may change for that page so use window handles
			String title = driver.getTitle();
			System.out.println(title);
			String parent = driver.getWindowHandle();
			System.out.println(parent);// parent is current window
			// results element is stable in webpage so find xpath for results
			WebElement product = driver.findElement(
					By.xpath("//span [text()='Results']/ancestor::div[4]/following-sibling::div[1]/descendant::h2"));
			WebElement productLink = driver.findElement(
					By.xpath("//span [text()='Results']/ancestor::div[4]/following-sibling::div[1]/descendant::h2/a"));
			productLink.click();
			product.click();
			String productTitle = product.getText();
			System.out.println(productTitle);
			Set<String> allWindows = driver.getWindowHandles();
			for (String window : allWindows) {
				if (!window.equals(parent))
					driver.switchTo().window(window);

				{

				}
	String title2 = driver.getTitle();
	System.out.println(title2);
	if (title2.contains(productTitle)) {
		WebElement addTocart = driver.findElement(By.id("add-to-cart-button"));
		addTocart.click();
	}
			}
	}
}

