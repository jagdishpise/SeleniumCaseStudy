$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking Application",
  "description": "",
  "id": "hotel-booking-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Hotel Booking Scenario",
  "description": "",
  "id": "hotel-booking-application;hotel-booking-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "heading of page is hotel booking application",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "title of page is hotel booking",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters personal details",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters email id and mobile number",
  "rows": [
    {
      "cells": [
        "user123",
        "jagdishpise007@gmail.com"
      ],
      "line": 10
    },
    {
      "cells": [
        "76324789",
        "9130329229"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters guests staying and address",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters payment details",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user see the booking completed message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 315001700,
  "error_message": "java.lang.NullPointerException\r\n\tat Base.TestBase.initialize(TestBase.java:45)\r\n\tat StepDefs.LoginPageSteps.user_is_on_login_page(LoginPageSteps.java:23)\r\n\tat ✽.Given user is on login page(src/main/java/features/Login.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginPageSteps.heading_of_page_is_hotel_booking_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.user_enter_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.title_of_page_is_hotel_booking()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.user_enters_personal_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.user_enters_email_id_and_mobile_number(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.user_enters_guests_staying_and_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.user_enters_payment_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.user_see_the_booking_completed_message()"
});
formatter.result({
  "status": "skipped"
});
});