package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class SuccessPage extends TestBase {
	
	@FindBy(xpath="//h1[contains(text(),'Booking Completed'])")
	WebElement BookingSuccess;

	
	public SuccessPage() {
		{
	        PageFactory.initElements(driver, this);
	        
	        
	    }
	}
	
	public boolean Title() {
		return BookingSuccess.isDisplayed();
	}
}
