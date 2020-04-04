package com.cts.stepdefinition;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cts.baseclass.BasePage;
import com.cts.pages.CucumbLoginPage;
import com.cts.pages.Loginpage;
import com.cts.tests.TestLoginPage;
import com.cts.utility.Excelllogin;
import com.cts.utility.ScreenShot;

public class SDLoginPage extends BasePage {
	
	
	final static Logger logger=LogManager.getLogger(TestLoginPage.class);	
	WebDriver driver=null;
	Excelllogin data=new Excelllogin();
	CucumbLoginPage clpage =null ;
	
	
       @Given("^the user launch the chrome application$")
	    public void the_user_launch_the_chrome_application() throws Throwable {
    	   
    	   
    	   driver = launchApp("chrome");
    	   clpage = new CucumbLoginPage(driver) ;
  			
   			logger.info("browser opens");

	        
	    }

	    @When("^the user open the OrangeHRM Home page$")
	    public void the_user_open_the_orangehrm_home_page() throws Throwable {
	    	
	    	driver.get("https://opensource-demo.orangehrmlive.com");
	    	logger.info("website opens");
	    	 
	       
	    }

//	    @Then("^the user login using \"([^\"]*)\" and \"([^\"]*)\"$")
	    @Then("^the user login using (.+) and (.+)$")
	    public void the_user_login_using_username_and_password(String strArg1, String strArg2) throws Throwable {
	    	 
//	    	System.out.println("username " +strArg1+ "password" +strArg2);
	    	
	    	Excelllogin excellogin = new Excelllogin();
	    	clpage.username(excellogin.excel_username(0));
	    	clpage.password(excellogin.excel_password(0));
	    	
	    	
	    	logger.info("login successfully");
	        
	    }

	    @Then("^click on the login button user nagivate to the next page$")
	    public void click_on_the_login_button_user_nagivate_to_the_next_pag() throws Throwable {
	    	clpage.loginbtn();
	    	ScreenShot util = new  ScreenShot(driver);
			util.takeSnapShot("D:\\Groot1\\OrangeHRMDemo\\src\\test\\resources\\screenshots\\TestLoginPage.png");
				logger.error("browser is closed");
			  driver.close();
	        
	    
	  
	    }
}


