package StepDefs;

import java.util.List;

import org.testng.Assert;

import Base.TestBase;
import Pages.HotelBookingForm;
import Pages.LoginPage;
import Pages.SuccessPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends TestBase {
	
	
	LoginPage login;

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		TestBase testbase= new TestBase();
		testbase.initialize();
		
	}

	@When("^heading of page is hotel booking application$")
	public void heading_of_page_is_hotel_booking_application()  {
	    login= new LoginPage();
	   Assert.assertTrue(login.Heading());
	  
	}

	@When("^user enter username and password$")
	public void user_enter_username_and_password() {
	    login.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	
	
	@Then("^title of page is hotel booking$")
	public void title_of_page_is_hotel_booking() {
		HotelBookingForm hotelbookingform= new HotelBookingForm();
		Assert.assertEquals("Hotel Booking", hotelbookingform.verifytitle());		
	
	}
	
	 

	  @Then("^user enters personal details$")
	  public void user_enters_personal_details() {
		  HotelBookingForm personaldetails= new HotelBookingForm();
		  personaldetails.personaldetails(prop.getProperty("firstname"), prop.getProperty("lastname"));
	  }
	  
	 

	  @Then("^user enters email id and mobile number$")
	  public void user_enters_email_id_and_mobile_number(DataTable userCred) {
		 List<List<String>> data = userCred.raw();
		 HotelBookingForm emailId= new HotelBookingForm();
		 emailId.emailId(data.get(0).get(0), data.get(0).get(1));
		 HotelBookingForm  phone = new HotelBookingForm();
		 phone.phone(data.get(0).get(0), data.get(0).get(1));
		 	  
	  }

	  @Then("^user enters guests staying and address$")
	  public void user_enters_guests_staying_and_address() {
		  HotelBookingForm guestsstaying= new HotelBookingForm();
		  guestsstaying.guestsstaying(prop.getProperty("numberofgueststaying"), prop.getProperty("address"));

	  }

	  @Then("^user enters payment details$")
	  public void user_enters_payment_details() {
		  HotelBookingForm carddetails = new HotelBookingForm();
		  carddetails.carddetails(prop.getProperty("cardholdername"), prop.getProperty("debitcardnumber"), prop.getProperty("cvv"),
	  prop.getProperty("expirationmonth"), prop.getProperty("expirationyear"));
		  
	  }  
	
	  
	@Then("^user see the booking completed message$")
	public void user_see_the_booking_completed_message() {
		SuccessPage successpage = new SuccessPage();
		Assert.assertTrue(successpage.Title());
		
	}
	
	
	/*
	 * @After(order=1) public void afterscenario(Scenario scenario) throws
	 * IOException { Reporter.addScenarioLog("In case of failure takes screenshot");
	 * if(scenario.isFailed()) { String screenshotname =
	 * scenario.getName().replaceAll(" ", " "); TakesScreenshot screen =
	 * (TakesScreenshot)driver; File srcpath =
	 * screen.getScreenshotAs(OutputType.FILE); File destpath = new
	 * File(System.getProperty("user.dir")+ "\\target\\extent-repoort"+
	 * screenshotname+".png"); FileUtils.copyFile(srcpath, destpath);
	 * Reporter.addScreenCaptureFromPath(destpath.toString()); }
	 * 
	 * 
	 * 
	 * }
	 * 
	 * @After(order=0) public void teardown() { driver.close(); }
	 */
	 
	
}
