package com.facebookproject;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class facebookproject {
	public static void main(String[] args) throws Exception {
		String s = "Log in to Facebook";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Seeleenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);

		if (s.equalsIgnoreCase(title)) {

			driver.get("https://www.facebook.com/");

		} else {
			System.out.println("Page Not Found");
		}
		driver.findElement(By.id("email")).sendKeys("JayaSenthil");
		driver.findElement(By.id("pass")).sendKeys("saadfgf");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File dc = new File("C:\\Users\\HP\\eclipse-workspace\\Seeleenium\\screenshot\\facebook.png");
		FileHandler.copy(sc, dc);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		String s3 = "Sign Up";
		String s4 = "Sign Up";
		if (s3.equals(s4)) {
			System.out.println("ACCESS GRANTED");
		} else {
			System.out.println("ACCESS DENIED");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jaya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("senthil");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("mjaya.aass@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("katzcarthi@gmail.com");
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("dfghjhgfdfgh");
		WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select ss =new Select(date);
		ss.selectByValue("19");
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select ss1 = new Select(month);
		ss1.selectByValue("10");
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select ss2 = new Select(year);
		ss2.selectByValue("1990");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//div[@text()='Account Settings']")).click();
		driver.findElement(By.xpath("//li[@role='presentation']")).click();
		
			
		}
}




			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			


