package org.tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table1 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Seeleenium\\webdriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	WebElement syy = driver.findElement(By.xpath("//table/tbody/tr[3]/td[5]")); 	
	System.out.println(syy.getText());
}

}
