Feature: Hotel Booking In Adactin Application

@smokeTest
Scenario: User Login In The Web Application
Given user Launch The Adactin Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And It Navigates To Search Hotel Page

@sanityTest
Scenario: User Search For  The Hotel
When user Select Location From The Location Dropdown
And user Select Hotel From Hotels Dropdown
And user Select Room Type From Room Type Dropdown
And user select Number Of Rooms From Number Of Rooms from Number Of Rooms Dropdown
And user Enter Check In Date In Check In Date Field
And user Enter Check Out Date In Check Out Date Field
And user Select Number Of Adults In Adults Per Room Dropdown
And user Select Number of Children In Children Per Room Dropdown
Then user Click Search Button And It Navigates To Select Hotel Page

@sanityTest
Scenario: User Select For The Hotel
When user Select Hotel From the Hotel List
And user Select Hotel By Click The Radio Button
Then user Click The Continue Button And It Navigates to Hotel Booking Page

@sanityTest
Scenario: User Enter Personal Details And Book Hotel
When user Enter First Name In First Name Field
And user Enter Last Name In Last Name Field
And user Enter Address In Billing Address Field
And user Enter Card Number In Credit Card No Field
And user Select Card Type In Credit Card Type Dropdown
And user Enter Expiry Date In Select Month and Select Year Field
And user Enter CVV Number In CVV Number Field
Then user Click Book Now Button And It Navigates To Booking Confirmation Page

@regressionTest
Scenario: User Check Booking Details in Booking Confirmation Page
When user Verifies The Given Details
Then user CLick The Logout Button and It Navigates And Display "You Have Successfully Logged Out"
 