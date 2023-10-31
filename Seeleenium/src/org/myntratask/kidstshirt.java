package org.myntratask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kidstshirt {
	
	
	static WebDriver driver;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Seeleenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");

	}

	private static void totalNumberOfProducts() {
		List<WebElement> products = driver.findElements(By.xpath("//li[@class='product-base']"));
		int size = products.size();
		System.out.println("Total number of Products=" + size);

	}

	public static void minimumPriceOfAllProducts() {
		List<Integer> priceList = new ArrayList<>();
		Map<Integer, String> proName=new HashMap<>();
		List<WebElement> totalPrice = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
		for (WebElement price : totalPrice) {
			String text = price.getText().replace("Rs. ", "");

			Integer text1 = Integer.parseInt(text);
			priceList.add(text1);
			//proName.put(text1, totalPrice.get(price).getText);
			

		}

		Integer min_price = Collections.min(priceList);
		System.out.println("Minimum price of all products=" + min_price);

	}

	public static void minPriceOfProductName() {
		
		
		
		
	}

	public static void main(String[] args) {
		browserLaunch();
		totalNumberOfProducts();
		minimumPriceOfAllProducts();

	}

}



