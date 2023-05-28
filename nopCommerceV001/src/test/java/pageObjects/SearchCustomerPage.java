package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilites.WaitHelper;

public class SearchCustomerPage {
	
    public WebDriver ldriver;
    
     WaitHelper waithelper;
    
	public SearchCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		waithelper=new WaitHelper(rdriver);
	}
	@FindBy(how=How.ID, using="SearchEmail")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how=How.ID, using="SearchFirstName")
	@CacheLookup
	WebElement txtFstName;
	
	@FindBy(how=How.ID, using="SearchLastName")
	@CacheLookup
	WebElement txtLstName;
	
	@FindBy(how=How.ID, using="search-customers")
	@CacheLookup
	WebElement SerchButtn;	
	
	@FindBy(how=How.XPATH, using="//table[@id='customers-grid']")
	WebElement table;
	
	@FindBy(how=How.XPATH, using="//table[@id='customers-grid']//tbody/tr")
	List<WebElement>tablerows;
	
	@FindBy(how=How.XPATH, using="//table[@id='customers-grid']//tbody/tr/td")
	List<WebElement>tablecolumns;
	
	public void setEmail(String email) {
		waithelper.waitforelement(txtEmail, 30);
		txtEmail.clear();
		txtEmail.sendKeys(email);	
	}
	public void setFirstName(String FirstName) {
		waithelper.waitforelement(txtFstName, 30);
		txtEmail.clear();
		txtEmail.sendKeys(FirstName);
	}
	public void setLastName(String LastName) {
		waithelper.waitforelement(txtLstName, 30);
		txtEmail.clear();
		txtEmail.sendKeys(LastName);
	}	
	public void clicksearch() {
		SerchButtn.click();
		waithelper.waitforelement(SerchButtn, 30);
	}
	public int getnoofrows() {
		return (tablerows.size());	
	}
	public int getnoofcolumns() {
		return (tablecolumns.size());		
	}
	public boolean searchcustomerbyEmail(String Email) {
		boolean flag=false;		
		for(int i=1; i<=getnoofrows(); i++) {
			String Emailid=table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(Emailid);
			if(Emailid.equals(Email)) {
				flag=true;
				}
			}
		return flag;		
	}
	public boolean searchcustomerbyName(String Name) {
		boolean flag=false;		
		for(int i=1; i<=getnoofrows(); i++) {
			String name=table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[3]")).getText();
			String names[]=name.split(" ");
			if(names[0].equals("Victoria")&& names[1].equals("Terces")) 
					{
				flag=true;
				}
			}
		return flag;		
	}
}
