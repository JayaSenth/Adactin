package com.Adactin;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class adactinproject {
	

		public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Seeleenium\\webdriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://adactinhotelapp.com/index.php");
			
			driver.manage().window().maximize();
		
			
			WebElement username = driver.findElement(By.name("username"));
			username.sendKeys("JayaSenthil");
			
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("436JR5");
			
			Thread.sleep(3000);
			WebElement login = driver.findElement(By.id("login"));
			login.click();
			
			WebElement location = driver.findElement(By.id("location"));
			Select s=new Select(location);
			s.selectByValue("New York");
			
			WebElement hotel = driver.findElement(By.id("hotels"));
			Select s1=new Select(hotel);
			s1.selectByVisibleText("Hotel Sunshine");
			Thread.sleep(3000);
			WebElement roomtype = driver.findElement(By.name("room_type"));
			Select s2=new Select(roomtype);
			s2.selectByValue("Super Deluxe");
			
			WebElement room_nos = driver.findElement(By.id("room_nos"));
			Select s3=new Select(room_nos);
			s3.selectByValue("3");
			Thread.sleep(3000);
			
			WebElement check_in = driver.findElement(By.id("datepick_in"));
			check_in.sendKeys("30/10/2023");
			
			WebElement check_out = driver.findElement(By.id("datepick_out"));
			check_out.sendKeys("01/11/2023");
			
			WebElement adults = driver.findElement(By.id("adult_room"));
			Select s4=new Select(adults);
			s4.selectByValue("2");
			
			WebElement children = driver.findElement(By.id("child_room"));
			Select s5=new Select(children);
			s5.selectByValue("2");
			
			WebElement submit = driver.findElement(By.id("Submit"));
			submit.click();
			Thread.sleep(3000);
			WebElement button = driver.findElement(By.id("radiobutton_0"));
			button.click();
			
			WebElement cont = driver.findElement(By.id("continue"));
			cont.click();
			
			WebElement firstname = driver.findElement(By.id("first_name"));
			firstname.sendKeys("Jaya");
			
			WebElement lastname = driver.findElement(By.id("last_name"));
			lastname.sendKeys("Senthil");
			
			WebElement addr = driver.findElement(By.id("address"));
			addr.sendKeys("chennai");
			
			WebElement card_num = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
			card_num.sendKeys("1111111111111111");
			
			WebElement card_type= driver.findElement(By.xpath("//option[text()='VISA']"));
			card_type.click();
			
			WebElement expiry_month= driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
			Select s6=new Select(expiry_month);
			s6.selectByValue("2");
			
			WebElement expiry_year= driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
			Select s7=new Select(expiry_year);
			s7.selectByValue("2024");
			
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("456");
		
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();
	
				
				
		WebElement logout=driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File Destination= new File("C:\\Users\\HP\\eclipse-workspace\\MavenProject\\Screenshot\\logout.png");
		FileUtils.copyFile(source, Destination);
	
		driver.close();
		
		}

}




