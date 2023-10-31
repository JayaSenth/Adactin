package org.Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinProgram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Seeleenium\\webdriver\\chromedriver.exe");
		WebDriver xyz = new ChromeDriver();
		xyz.get("https://adactinhotelapp.com/index.php");
		
		xyz.manage().window().maximize();
		
		WebElement username = xyz.findElement(By.name("username"));
		username.sendKeys("JayaSenthil");
		
		WebElement password = xyz.findElement(By.id("password"));
		password.sendKeys("saitwins@@18");
		
		Thread.sleep(3000);
		WebElement login = xyz.findElement(By.id("login"));
		login.click();
		
		WebElement location = xyz.findElement(By.id("location"));
		Thread.sleep(3000);
		Select s=new Select(location);
		s.selectByValue("New York");
		
		WebElement hotel = xyz.findElement(By.id("hotels"));
		Select s1=new Select(hotel);
		s1.selectByVisibleText("Hotel Sunshine");
		Thread.sleep(3000);
		WebElement roomtype = xyz.findElement(By.name("room_type"));
		Select s2=new Select(roomtype);
		s2.selectByValue("Super Deluxe");
		
		WebElement room_nos = xyz.findElement(By.id("room_nos"));
		Select s3=new Select(room_nos);
		s3.selectByValue("3");
		Thread.sleep(3000);
		
		WebElement check_in = xyz.findElement(By.id("datepick_in"));
		check_in.sendKeys("15/10/2023");
		
		WebElement check_out = xyz.findElement(By.id("datepick_out"));
		check_out.sendKeys("17/10/2023");
		
		WebElement adults = xyz.findElement(By.id("adult_room"));
		Select s4=new Select(adults);
		s4.selectByValue("2");
		
		WebElement children = xyz.findElement(By.id("child_room"));
		Select s5=new Select(children);
		s5.selectByValue("2");
		
		WebElement submit = xyz.findElement(By.id("Submit"));
		submit.click();
		Thread.sleep(3000);
		WebElement button = xyz.findElement(By.id("radiobutton_0"));
		button.click();
		
		WebElement cont = xyz.findElement(By.id("continue"));
		cont.click();
		
		WebElement firstname = xyz.findElement(By.id("first_name"));
		firstname.sendKeys("Jeevi");
		
		WebElement lastname = xyz.findElement(By.id("last_name"));
		lastname.sendKeys("sathiya");
		
		WebElement addr = xyz.findElement(By.id("address"));
		addr.sendKeys("chennai");
		
		WebElement card_num = xyz.findElement(By.xpath("(//input[@type='text'])[13]"));
		card_num.sendKeys("1111111111111111");
		
		WebElement card_type= xyz.findElement(By.xpath("//option[text()='VISA']"));
		card_type.click();
		
		WebElement expiry_month= xyz.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s6=new Select(expiry_month);
		s6.selectByValue("2");
		
		WebElement expiry_year= xyz.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s7=new Select(expiry_year);
		s7.selectByValue("2024");
		
	WebElement cvv = xyz.findElement(By.id("cc_cvv"));
	cvv.sendKeys("456");
	
	WebElement booknow = xyz.findElement(By.id("book_now"));
	booknow.click();
	
	WebElement logout=xyz.findElement(By.xpath("//a[text()='Logout']"));
	logout.click();
	}

}


