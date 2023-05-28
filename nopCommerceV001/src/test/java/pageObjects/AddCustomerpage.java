package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerpage {

	public WebDriver ldriver;
	public AddCustomerpage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
}
	By lnkcustomer_menu=By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
	By lnkcustomer_menuitem=By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]");
	By btnAddnew=By.xpath("//a[normalize-space()='Add new']");
	By txtemail=By.xpath("//input[@id='Email']");
	By txtpwd=By.xpath("//input[@id='Password']");
	
	By txtcustomerroles=By.xpath("//div[@class='input-group-append input-group-required']//div[@role='listbox']");
	By listitemadministrators=By.xpath("//li[normalize-space()='Administrators']");
	By listitemforummoderators=By.xpath("//li[normalize-space()='Forum Moderators']");
	By listitemguests=By.xpath("//li[normalize-space()='Guests']");
	By listitemregistered=By.id("d93b3de4-a089-43a5-b7f1-a838ca8fab1c");
	By listitemvendor=By.xpath("//li[contains(text(),'Vendors')]");
	By txtmanagrvendor=By.xpath("//select[@id='VendorId']");
	By radmale=By.xpath("//input[@id='Gender_Male']");
	By radfemale=By.xpath("//input[@id='Gender_Female']");
	
	By txtfstname=By.xpath("//input[@id='FirstName']");
	By txtlastname=By.xpath("//input[@id='LastName']");
	By txtdateofbirth=By.xpath("//input[@id='DateOfBirth']");
	
	By txtcompnyname=By.xpath("//input[@id='Company']");
	By txtadmincomment=By.xpath("//textarea[@id='AdminComment']");
	By savebtn=(By.xpath("//button[@name='save']"));
	
	public void clickoncustomersMenu() {
		ldriver.findElement(lnkcustomer_menu).click();
	}
	public void clickoncustomerMenuItem() {
		ldriver.findElement(lnkcustomer_menuitem).click();
	}
	public void clickonAddnewbutton() {
		ldriver.findElement(btnAddnew).click();
	}
	public void setmail(String email) {
		ldriver.findElement(txtemail).sendKeys(email);
	}
	public void setpwd(String pwd) {
		ldriver.findElement(txtpwd).sendKeys(pwd);
	}
	public void setcustomerroles(String role) throws InterruptedException {
		//if(!role.equals("vendors")) {
			//ldriver.findElement(By.xpath("//span[normalize-space()='Vendors']"));	
		//}	
		ldriver.findElement(txtcustomerroles).click();
	    WebElement listitem;
	    Thread.sleep(3000);
	if(role.equals("administrators")) {
		listitem=ldriver.findElement(listitemadministrators);
	}
	else if(role.equals("forummoderators")) {
		listitem=ldriver.findElement(listitemforummoderators);
	}
	else if(role.equals("Guests")) {
		listitem=ldriver.findElement(listitemguests);
	}
	else if(role.equals("registered")) {
		listitem=ldriver.findElement(listitemregistered);
	}
	else {
		listitem=ldriver.findElement(listitemvendor);
	}
	listitem.click();
	Thread.sleep(3000);
	//JavascriptExecutor js=(JavascriptExecutor)ldriver;
	//js.executeScript("arguments[0].click();", listitem);
	}
	public void setmanagerofvendor(String value) {
		Select drp=new Select(ldriver.findElement(txtmanagrvendor));
		drp.selectByVisibleText(value);
	}
	public void setgender(String gender) {
		if(gender.equals("Male")) {
			ldriver.findElement(radmale).click();
		}
		else if(gender.equals("Female")) {
			ldriver.findElement(radfemale).click();
		}
		else {
			ldriver.findElement(radmale).click();
		}
	}
	public void setfirstname(String fname) {
		ldriver.findElement(txtfstname).sendKeys(fname);
	}
	
	public void setlastname(String lname) {
		ldriver.findElement(txtlastname).sendKeys(lname);
	}
	public void setdob(String dob) {
		ldriver.findElement(txtdateofbirth).sendKeys(dob);
	}
	public void setcompanyname(String companame) {
		ldriver.findElement(txtcompnyname).sendKeys(companame);
	}
	public void setadmincontent(String admincntent) {
		ldriver.findElement(txtadmincomment).sendKeys(admincntent);
	}
	public void clickonsavebtn() {
		ldriver.findElement(savebtn).click();
	}
	public Object getpagetitle() {
		return ldriver.getTitle(); 
	}
	}