Feature: Hotel Booking in Adactin Application

Scenario: User Login in the web application
Given userlanch the adactin application
When user Enter the Username in Username field
And user Enter the password in Password field
Then user Click the Login Button and it Navigates to Search Hotel Page

Scenario: User Search Hotel Using multiple options
When user select the Location from Select Location Dropdown
And user select the Hotel from Select Hotel Dropdown
And user select the Room Type from Select Room Type Dropdown
And user select the Number of Rooms from Select Number of Rooms Dropdown
And user enter the Check In Date in the Check In Date field
And user enter the Check Out Date in the Check Out Date field
And user select Number of Adults per Room from Select Adults per Room Dropdown
And user select Number of Children per Room from Select Children per Room Dropdown
Then user click the search Button And It Navigates to Search  Hotel Continue Page

Scenario: User Confirm Hotel Details
When user click the select Button
Then user click the continue Button And It Navigates to Book a Hotel Page

Scenario: User Book A Hotel by Providing essential details
When user enter First Name in First Name field
And user enter Last Name in Last Name field
And user enter the Address in Billing Address field
And user enter Credit card No in Credit Card No Field
And user select the card type from Select Credit Card Type Dropdown
And user select Expiry month from select Month Dropdown
And user Select Expiry year from Select yesr Dropdown
And user enter CVV Number in CVV Number field
Then user click Book Now Button And It Navigates to Booking Confirmation Page

Scenario: User Rechecks the Details in Bookin Confirmation Page
Then user click Logout Button And It navigates to Logout Page

Scenario: User Got a Logout confirmation message
