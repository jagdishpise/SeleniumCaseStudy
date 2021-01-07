package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import junit.framework.Assert;


@SuppressWarnings("deprecation")
public class LoginPage extends TestBase {
	
	@FindBy(xpath="//h1[contains(text(), 'Hotel Booking Application')]")
    WebElement Heading;
	
	@FindBy(id="userName")
    WebElement UserName;
	
	@FindBy(id="userPwd")
    WebElement Password;
	
	@FindBy(id="userErrMsg")
    WebElement UserError;
	
	@FindBy(id="pwdErrMsg")
    WebElement PwdError;
	
	@FindBy(className="btn")
    WebElement Login;

	public LoginPage()
    {
        PageFactory.initElements(driver, this);
        
        
    }
	
	  public boolean Heading () {
		  return Heading.isDisplayed(); 
	  }
	 
	
	public void login(String userName, String userPwd) {
		Login.click();
		Assert.assertEquals("* Please enter userName", "UserError.getText()");
		UserName.sendKeys(userName);
		Login.click();
		Assert.assertEquals("* Please enter password", "PwdError.getText()");
		Password.sendKeys(userPwd);
		Login.click();
	
		
	}

}


