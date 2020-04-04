package com.cts.stepdefinition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cts.baseclass.BasePage;
import com.cts.pages.CucumbLoginPage;
import com.cts.pages.LeavesPage;
import com.cts.tests.TestLoginPage;
import com.cts.utility.Excelllogin;
import com.cts.utility.ScreenShot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SDLeavesPage extends BasePage{
	

	final static Logger logger=LogManager.getLogger(TestLoginPage.class);	
	WebDriver driver=null;
	Excelllogin data=new Excelllogin();
	CucumbLoginPage clpage =null ;
	LeavesPage lp=null;
	
	@Given("^TC01_03the user launch the chrome application$")
    public void tc0103the_user_launch_the_chrome_application() throws Throwable {
		driver = launchApp("chrome");
 	   clpage = new CucumbLoginPage(driver) ;
 	   lp=new LeavesPage(driver);
			
			logger.info("browser opens");
    }

    @When("^TC01_03the user open the OrangeHRM Home page$")
    public void tc0103the_user_open_the_orangehrm_home_page() throws Throwable {
    	driver.get("https://opensource-demo.orangehrmlive.com");
    	logger.info("website opens");
    }

    @Then("^TC01_03the user login using (.+) and (.+)$")
    public void tc0103the_user_login_using_and(String username, String password) throws Throwable {
    	Excelllogin excellogin = new Excelllogin();
    	clpage.username(excellogin.excel_username(0));
    	clpage.password(excellogin.excel_password(0));
    	
    	
    	logger.info("login successfully");
    }

    @Then("^TC01_03click on the login button user nagivate to the next page$")
    public void tc0103click_on_the_login_button_user_nagivate_to_the_next_page() throws Throwable {
    	clpage.loginbtn();
    }

    @Then("^TC01_03Using actions move to leave types from leaves then move to next page$")
    public void tc0103using_actions_move_to_leave_types_from_leaves_then_move_to_next_page() throws Throwable {

		lp.leave();
		logger.info("leavepage opens sucessfully");
    }

    @Then("^TC01_03click on Add$")
    public void tc0103click_on_add() throws Throwable {
    	lp.add();
    }

    @Then("^TC01_03wrote the leave type$")
    public void tc0103wrote_the_leave_type() throws Throwable {
    	lp.textleave();
    }

    @Then("^TC01_03click on save the user moves to next page$")
    public void tc0103click_on_save_the_user_moves_to_next_page() throws Throwable {
    	lp.savebtn();
		logger.info("saved sucessfully");
		ScreenShot util = new  ScreenShot(driver);
		util.takeSnapShot("D:\\Groot1\\OrangeHRMDemo\\src\\test\\resources\\screenshots\\TestLeavesPage.png");
		logger.warn("browser closed");
		  driver.close();
    }

}
