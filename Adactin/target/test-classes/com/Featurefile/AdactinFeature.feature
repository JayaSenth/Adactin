Feature: Hotel Booking In The Adactin Application
@SmokeTest
Scenario: User Login In The Web Application
Given user Launch the url in Adactin Application
When user Enter the username in the USername Field
And user Enter the Password in the password field
Then user click the login button and It Navigate To Search Hotel page
@SearchHotelPage
Scenario: User Enter In To The Search Hotel Page
When User Select the Location in the Location Dropdown
And User Select the Hotel in the Hotel Dropdown
And User Select the RoomType in the RoomType Dropdown
And User Select the NumberofRooms in the NumberofRooms Dropdown
And User Select the Adultsperroom in the Adultsperroom Dropdown
And User Select the ChildRoom in the Childroom Dropdown
Then User Click the Search button and It Navigate To The Select Hotel Page
@SelectHotelPage
Scenario: User Enter In To The Select Hotel Page
When User click the Select Hotel Radio Button in the Hotel details page
Then User Click the Continue button and It Navigate To The HotelBooking Page
@EnterHotelPage
Scenario: User Enter In To The Hotel Booking Page
When User Enter the FirstName in the FirstName Field
And User Enter the LastName in the LastName Field
And User Enter the BillingAddress in the BillingAddress Field
And User Enter the Creditcardnumber in the Creditcardnumber Field
And User Enter the Creditcardtype in the Creditcardtype Dropdown
And User Select the SelectMonth in the SelectMonth Dropdown 
And User select the SelectYear in the SelectYear Dropdown
And User Enter the Cvvnumber in the Cvvnumber Field
Then User Click on the BookNow button and It Navigate To The Booking Confirmation Page
@LogoutPage
Scenario: User Enter In To The Booking Confirmation Page
Then User Click on the Logout Button and It Successfully logout from the wb Application

