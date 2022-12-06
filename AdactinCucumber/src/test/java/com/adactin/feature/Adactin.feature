Feature: Hotel Booking in Adactin Application

Scenario: User Login in the Application
  Given User Launch the Adactin Application
  When User enter the Username in Username field
  And User enter the password in Passsword field
  Then User Click the login Button and It navigate to search hotel
  
  Scenario: Search hotel page
   When User Choose the location in location field
   And User Choose the hotels in hotels field
   And User Choose the Roomtype in Roomtype 
   And User Chooose the Number of rooms in Number of rooms field
   And User Enter the Check in date in Check in date field
   And User Enter  the Checl out date in Check out field
   And User Enter Number of Adults in Number of adults Field
   And User Enter Number of Childrens in Number of Children Field
   Then User Click the Search Button and It navigates to Search Hotels continue page
   
   Scenario: Confirm Hotel Details
     When User click the Select Button
     Then User Click the select Button And it Navigates to The Hotel Page
     
  Scenario: Booking Hotel
    When User Enter the Firstname in Firstname field
    And  User Enter the Lastname in Lastname Field
    And  User Enter the Address in Billing Address Field
    And  User Enter the Credit card Number in  Credit Card Number field
    And  User Choose the Card Type In Card Type field
    And  User Enter the Expiry Month in Expiry Month Field
    And  User Eneter the Expiry Year In Expiry Year Field
    And  User Enter  The CVV Number In CVV Number Field
    Then User Click the Book now BUtton and it Navigate to Booking Hotelconfirmation page
    
 Scenario: Logout The Application
  Then User click the Logout Button and Its logout from the Application   
    
