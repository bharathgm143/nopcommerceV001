package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);		
	}
	
	@FindBy(id="Email") 
	@CacheLookup 
	WebElement Textemail;
	
	@FindBy(id="Password") 
	@CacheLookup
	WebElement Textpassword;
	
	@FindBy(xpath="//button[normalize-space()='Log in']") 
	@CacheLookup  
	WebElement logInbtn;
	
	@FindBy(xpath="//a[normalize-space()='Logout']") 
	@CacheLookup 
	WebElement Linklogout;
	
	public void setusername(String uname) {
		Textemail.clear();
		Textemail.sendKeys(uname);
	}
	public void setpassword(String Upwd) {
		Textpassword.clear();
		Textpassword.sendKeys(Upwd);	
	}
	public void clicklogin() {
		logInbtn.click();
	}
	public void clicklogout() {
		Linklogout.click();
	}
}
