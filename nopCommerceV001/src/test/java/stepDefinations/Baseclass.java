package stepDefinations;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.AddCustomerpage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class Baseclass {	
	
	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerpage addcust;
	public SearchCustomerPage SearchCust;
	public static Logger logger;
	public Properties configProp;
	
	
	public static String randomstring() {
		String generatedstring1=RandomStringUtils.randomAlphabetic(5);
		return (generatedstring1);
		
	}

}
