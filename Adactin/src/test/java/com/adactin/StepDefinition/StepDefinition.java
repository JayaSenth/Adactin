package com.adactin.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Runner.RunnerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition {

	public static WebDriver driver = RunnerClass.driver;
	

		@Given("^user Launch the url in Adactin Application$")
		public void user_Launch_the_url_in_Adactin_Application() throws Throwable {
			driver.get("https://adactinhotelapp.com/");
			
		   
		}

		@When("^user Enter the username in the USername Field$")
		public void user_Enter_the_username_in_the_USername_Field() throws Throwable {
			WebElement username = driver.findElement(By.name("username"));
			username.sendKeys("JayaSenthil");
			
		}

		@When("^user Enter the Password in the password field$")
		public void user_Enter_the_Password_in_the_password_field() throws Throwable {
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("436JR5");
		}

		@Then("^user click the login button and It Navigate To Search Hotel page$")
		public void user_click_the_login_button_and_It_Navigate_To_Search_Hotel_page() throws Throwable {
			WebElement login = driver.findElement(By.id("login"));
			login.click();
			
		}

		@When("^User Select the Location in the Location Dropdown$")
		public void user_Select_the_Location_in_the_Location_Dropdown() throws Throwable {
			WebElement location = driver.findElement(By.id("location"));
			Select s=new Select(location);
			s.selectByValue("New York");
		}

		@When("^User Select the Hotel in the Hotel Dropdown$")
		public void user_Select_the_Hotel_in_the_Hotel_Dropdown() throws Throwable {
			WebElement hotel = driver.findElement(By.id("hotels"));
			Select s1=new Select(hotel);
			s1.selectByVisibleText("Hotel Sunshine");
		}

		@When("^User Select the RoomType in the RoomType Dropdown$")
		public void user_Select_the_RoomType_in_the_RoomType_Dropdown() throws Throwable {
			WebElement roomtype = driver.findElement(By.name("room_type"));
			Select s2=new Select(roomtype);
			s2.selectByValue("Super Deluxe");
		}

		@When("^User Select the NumberofRooms in the NumberofRooms Dropdown$")
		public void user_Select_the_NumberofRooms_in_the_NumberofRooms_Dropdown() throws Throwable {

			WebElement room_nos = driver.findElement(By.id("room_nos"));
			Select s3=new Select(room_nos);
			s3.selectByValue("3");
		}

		@When("^User Select the Adultsperroom in the Adultsperroom Dropdown$")
		public void user_Select_the_Adultsperroom_in_the_Adultsperroom_Dropdown() throws Throwable {
			WebElement adults = driver.findElement(By.id("adult_room"));
			Select s4=new Select(adults);
			s4.selectByValue("2");
		}

		@When("^User Select the ChildRoom in the Childroom Dropdown$")
		public void user_Select_the_ChildRoom_in_the_Childroom_Dropdown() throws Throwable {
			WebElement children = driver.findElement(By.id("child_room"));
			Select s5=new Select(children);
			s5.selectByValue("2");
		}

		@Then("^User Click the Search button and It Navigate To The Select Hotel Page$")
		public void user_Click_the_Search_button_and_It_Navigate_To_The_Select_Hotel_Page() throws Throwable {
			WebElement submit = driver.findElement(By.id("Submit"));
			submit.click();
		}

		@When("^User click the Select Hotel Radio Button in the Hotel details page$")
		public void user_click_the_Select_Hotel_Radio_Button_in_the_Hotel_details_page() throws Throwable {
			WebElement button = driver.findElement(By.id("radiobutton_0"));
			button.click();
		}

		@Then("^User Click the Continue button and It Navigate To The HotelBooking Page$")
		public void user_Click_the_Continue_button_and_It_Navigate_To_The_HotelBooking_Page() throws Throwable {
			WebElement cont = driver.findElement(By.id("continue"));
			cont.click(); 
		}

		@When("^User Enter the FirstName in the FirstName Field$")
		public void user_Enter_the_FirstName_in_the_FirstName_Field() throws Throwable {
			WebElement firstname = driver.findElement(By.id("first_name"));
			firstname.sendKeys("Jaya");
		}

		@When("^User Enter the LastName in the LastName Field$")
		public void user_Enter_the_LastName_in_the_LastName_Field() throws Throwable {
			WebElement lastname = driver.findElement(By.id("last_name"));
			lastname.sendKeys("Senthil");
		}

		@When("^User Enter the BillingAddress in the BillingAddress Field$")
		public void user_Enter_the_BillingAddress_in_the_BillingAddress_Field() throws Throwable {
			WebElement addr = driver.findElement(By.id("address"));
			addr.sendKeys("chennai");
			
		}

		@When("^User Enter the Creditcardnumber in the Creditcardnumber Field$")
		public void user_Enter_the_Creditcardnumber_in_the_Creditcardnumber_Field() throws Throwable {
			WebElement card_num = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
			card_num.sendKeys("1111111111111111");
		}

		@When("^User Enter the Creditcardtype in the Creditcardtype Dropdown$")
		public void user_Enter_the_Creditcardtype_in_the_Creditcardtype_Dropdown() throws Throwable {
			WebElement card_type= driver.findElement(By.xpath("//option[text()='VISA']"));
			card_type.click();
		}

		@When("^User Select the SelectMonth in the SelectMonth Dropdown$")
		public void user_Select_the_SelectMonth_in_the_SelectMonth_Dropdown() throws Throwable {
			WebElement expiry_month= driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
			Select s6=new Select(expiry_month);
			s6.selectByValue("2");
		}

		@When("^User select the SelectYear in the SelectYear Dropdown$")
		public void user_select_the_SelectYear_in_the_SelectYear_Dropdown() throws Throwable {
			WebElement expiry_year= driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
			Select s7=new Select(expiry_year);
			s7.selectByValue("2024");
		}

		@When("^User Enter the Cvvnumber in the Cvvnumber Field$")
		public void user_Enter_the_Cvvnumber_in_the_Cvvnumber_Field() throws Throwable {
			
			WebElement cvv = driver.findElement(By.id("cc_cvv"));
			cvv.sendKeys("456");
			
		}

		@Then("^User Click on the BookNow button and It Navigate To The Booking Confirmation Page$")
		public void user_Click_on_the_BookNow_button_and_It_Navigate_To_The_Booking_Confirmation_Page() throws Throwable {
			WebElement booknow = driver.findElement(By.id("book_now"));
			booknow.click();
		
		}

		@Then("^User Click on the Logout Button and It Successfully logout from the wb Application$")
		public void user_Click_on_the_Logout_Button_and_It_Successfully_logout_from_the_wb_Application() throws Throwable {
			
			WebElement logout=driver.findElement(By.xpath("//a[text()='Logout']"));
			logout.click();
		}


	
	




	
}
