package org.tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableees {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Seeleenium\\webdriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	List<WebElement> tablelist = driver.findElements(By.xpath("//table/tbody/tr/td"));
	for (WebElement create : tablelist) {
		System.out.println(create.getText());
}
	
/*
 * String s ="Tegucigalpa"; if(s.equalsIgnoreCase("")) {
 * System.out.println("Tegucigalpa");
 * 
 * 
 * } else { System.out.println("NotFound"); }
 */
}
}