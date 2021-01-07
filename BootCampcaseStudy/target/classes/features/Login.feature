Feature: Hotel Booking Application

Scenario: Hotel Booking Scenario
Given user is on login page
When heading of page is hotel booking application
When user enter username and password
Then title of page is hotel booking
Then user enters personal details
Then user enters email id and mobile number
    | user123 | jagdishpise007@gmail.com |
    | 76324789 | 9130329229 | 
Then user enters guests staying and address
Then user enters payment details         
Then user see the booking completed message
