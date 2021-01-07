package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;

import Base.TestBase;


public class HotelBookingForm extends TestBase {
	
	@FindBy(id="txtFirstName")
	WebElement FirstName;
	
	@FindBy(id="txtLasttName")
	WebElement LastName;
	
	@FindBy(id="txtEmail")
	WebElement Email;
	
	@FindBy(id="txtPhone")
	WebElement Mobileno;
	
	@FindBy(xpath="//*[textarea]")
	WebElement Address;
	
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(name="state")
	WebElement State;
	
	@FindBy(name="persons")
	WebElement Nunmberofguests;
	
	@FindBy(id="txtCardholderName")
	WebElement CardHolderName;
	
	@FindBy(id="txtDebit")
	WebElement DebitCardNumber;
	
	@FindBy(name="cvv")
	WebElement CVV;
	
	@FindBy(name="month")
	WebElement ExpirationMonth;
	
	@FindBy(name="year")
	WebElement ExpirationYear;
	
	@FindBy(className="btn")
	WebElement ConfirmBookingButton;
	
	public HotelBookingForm()
    {
        PageFactory.initElements(driver, this);
        
        
    }
	
	public String verifytitle() {
		String pagetitle= driver.getTitle();
		return pagetitle;
	}
	
	public String alert() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.accept();
		return text;
	}
	
public void personaldetails(String firstname, String lastname) {
	ConfirmBookingButton.click();
	Assert.assertEquals("Please fill the First Name", alert());
	FirstName.sendKeys(firstname);
	
	ConfirmBookingButton.click();
	Assert.assertEquals("Please fill the Last Name", alert());
	LastName.sendKeys(lastname); ConfirmBookingButton.click();
}
	

public void emailId(String email1, String email2) {
		Assert.assertEquals("Please fill the Email", alert());
		Email.sendKeys(email1);
		if (emailIdCheck(email1)) {
			Assert.assertEquals("Please fill the Mobile No", alert());
			
		}
		else {
			Assert.assertEquals("Please enter valid Email Id", alert());
			Email.clear();
			
			Email.sendKeys(email2);
			if(emailIdCheck(email2)) {
				Assert.assertEquals("Please fill the Mobile No", alert());
			}
		}
	}
	
public void phone(String mobileno1, String mobileno2) {
		Mobileno.sendKeys(mobileno1);
		if(phoneNumValid(mobileno1));
		else {
			Assert.assertEquals("Please enter  valid Contact No", alert());
			Mobileno.clear();
			Mobileno.sendKeys(mobileno2);
			if(phoneNumValid(mobileno2));
		}
		
	}
	
public void guestsstaying(String numberofgueststaying, String address) {
		Select ngs = new Select(Nunmberofguests);
		ngs.selectByVisibleText(numberofgueststaying);
		Address.sendKeys(address);
	}
	
public void carddetails(String cardholdername, String debitcardnumber, String cvv, String expirationmonth, String expirationyear) {
		ConfirmBookingButton.click();
		Assert.assertEquals("Please fill the Card holder name", alert());
		CardHolderName.sendKeys(cardholdername);
		ConfirmBookingButton.click();
		Assert.assertEquals("Please fill the Debit card Number", alert());
		DebitCardNumber.sendKeys(debitcardnumber);
		ConfirmBookingButton.click();
		Assert.assertEquals("Please fill the CVV", alert());
		CVV.sendKeys(cvv);
		ConfirmBookingButton.click();
		Assert.assertEquals("Please fill expiration month", alert());
		ExpirationMonth.sendKeys(expirationmonth);
		ConfirmBookingButton.click();
		Assert.assertEquals("Please fill expiration year", alert());
		ExpirationYear.sendKeys(expirationyear);
		ConfirmBookingButton.click();
		
		
	}
	
public boolean emailIdCheck(String Email) {
		 String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                 "[a-zA-Z0-9_+&*-]+)*@" + 
                 "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                 "A-Z]{2,7}$"; 
                   
Pattern pat = Pattern.compile(emailRegex); 
if (Email == null) 
 return false; 
else
return pat.matcher(Email).matches();
	}
	
public boolean phoneNumValid(String mobilenum) {
		Pattern p = Pattern.compile("[7-9][0-9]{9}"); 
		Matcher m = p.matcher(mobilenum); 
	    return (m.find() && m.group().equals(mobilenum)); 
	}

}
