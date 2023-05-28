package stepDefinations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddCustomerpage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class Steps extends Baseclass {
	
	@Before
	public void setup() throws IOException {
		logger=logger.getLogger("nopCommerceV001");
		PropertyConfigurator.configure("Log4j.properties");
		
		//reading properties
		configProp=new Properties();
		FileInputStream configPropfile=new FileInputStream("config.properties");
		configProp.load(configPropfile);
		
		String br=configProp.getProperty("browser");
		if (br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath"));
		driver=new ChromeDriver();
		}
		else if (br.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver",configProp.getProperty("firefoxpath"));
		driver=new FirefoxDriver();			
	    }
		else if (br.equals("ie")) {
		System.setProperty("webdriver.ie.driver",configProp.getProperty("iepath"));
		driver=new InternetExplorerDriver();	
			
	}}
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
	logger.info("**********Launching Browser**********");
	lp=new LoginPage(driver);
	
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
		logger.info("**********Opening Url**********");
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("User enters email as {string} and Password as {string}")
	public void user_enters_email_as_and_Password_as(String email, String password) {
		logger.info("**********Providing Login Details**********");
		lp.setusername(email);
		lp.setpassword(password);
	}

	@When("click on Login")
	public void click_on_Login() throws InterruptedException{
		logger.info("********** Started Login **********");
		lp.clicklogin();
		Thread.sleep(3000);
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) {
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			logger.info("**********Login Pass**********");
			Assert.assertTrue(false);
		}else
		{
			logger.info("**********Login Fail**********");
			Assert.assertEquals(title, driver.getTitle());}
		}

	@When("User Click on Log Out link")
	public void user_Click_on_Log_Out_link() throws InterruptedException {
		logger.info("**********Click on Logout Link**********");
		lp.clicklogout();
		Thread.sleep(3000);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
		
	}
	@Then("close browser")
	public void close_browser() {
	logger.info("**********Closing Browser**********");
	driver.quit();
	}
	//custome feature step defination
	@Then("User Can View Dashboard")
	public void user_Can_View_Dashboard() {
	addcust=new AddCustomerpage(driver);
	Assert.assertEquals("Dashboard / nopCommerce administration", addcust.getpagetitle());
	}

	@When("user click on customers Menu")
	public void user_click_on_customers_Menu() throws InterruptedException {
		Thread.sleep(3000);
		addcust.clickoncustomersMenu();
	}

	@When("click on customer Menu Item")
	public void click_on_customer_Menu_Item() throws InterruptedException {
		Thread.sleep(2000);
		addcust.clickoncustomerMenuItem();
	}

	@When("click on Add new button")
	public void click_on_Add_new_button() throws InterruptedException {
		logger.info("**********Adding New Customer **********");
		addcust.clickonAddnewbutton();
		Thread.sleep(2000);
	}
	
	@Then("User can view Add new customer page")
	public void user_can_view_Add_new_customer_page() {
		Assert.assertEquals("Add a new customer / nopCommerce administration", addcust.getpagetitle());	
	}

	@When("User enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
		String email=randomstring()+"@gmail.com";
		addcust.setmail(email);
		addcust.setpwd("abcd5460");
		addcust.setcustomerroles("Vendors");
		Thread.sleep(2000);		
		addcust.setmanagerofvendor("Vendor 2");
		addcust.setgender("Mail");
		addcust.setfirstname("Bharath");
		addcust.setlastname("G M");
		addcust.setdob("05/07/2023");
		addcust.setcompanyname("qa company");
		addcust.setadmincontent("This is for Testing.............");
	}
	@When("click on Save button")
	public void click_on_Save_button() throws InterruptedException {
		addcust.clickonsavebtn();
		Thread.sleep(3000);
	}
	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully."));
	}
	//Steps for Searching a Customer Using Email Id
	
	@When("Enter customer Email")
	public void enter_customer_Email() {
		SearchCust=new SearchCustomerPage(driver);
		SearchCust.setEmail("victoria_victoria@nopCommerce.com");	    
	}
	@When("Click on Search button")
	public void click_on_Search_button() throws InterruptedException {
		SearchCust.clicksearch();
		Thread.sleep(300);	    
	}
	@Then("User should find email in the search table")
	public void user_should_find_email_in_the_search_table() {
		boolean status=SearchCust.searchcustomerbyEmail("victoria_victoria@nopCommerce.com");
		Assert.assertEquals(true, status);   
	}
	//Steps for Searching a Customer Using Firstname and Lastname
	@When("Enter customer FirstName")
	public void enter_customer_FirstName() {
		SearchCust=new SearchCustomerPage(driver);
		SearchCust.setFirstName("Victoria");
	}

	@When("Enter customer LastName")
	public void enter_customer_LastName() {
		SearchCust.setLastName("Terces");
	}

	@Then("User should find Name in the search table")
	public void user_should_find_Name_in_the_search_table() {
		boolean status=SearchCust.searchcustomerbyName("Victoria Terces");
		Assert.assertEquals(true, status);   
	}
	}

