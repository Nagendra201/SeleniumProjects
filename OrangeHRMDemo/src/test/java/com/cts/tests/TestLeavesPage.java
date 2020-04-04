package com.cts.tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.cts.baseclass.BasePage;
import com.cts.pages.LeavesPage;
import com.cts.pages.Loginpage;
import com.cts.utility.Excelllogin;
import com.cts.utility.ScreenShot;

public class TestLeavesPage extends BasePage {
	
	final static Logger logger=LogManager.getLogger(TestLoginPage.class);
	WebDriver driver;
	LeavesPage lp;
	Excelllogin data=new Excelllogin();
	Loginpage lpage = null;
	
	
	@Parameters({"browser"})
	@BeforeTest	
	public void initDriver(String browser)
	{
		driver = launchApp(browser);
		logger.info("browser openes");
		lp=new LeavesPage(driver);
		 lpage=new Loginpage(driver);
		
	}
	
	@DataProvider(name="UserDetails")
	public Object[][] getUsers() throws IOException
	{
////		return new Object[][] {
////			{"nagendra","nagendra201"},
////			{"Groot","Groot123"}
////		};
		return data.getData();
	}
	
	@Test(dataProvider = "UserDetails")
	public void login(String username,String password) throws IOException
	{		

		lpage.username(username);
		lpage.password(password);
		lpage.loginbtn();
		logger.error("login sucessfully");
	}
	
	@Test
	public void testleaves() {
		
		lp.leave();
		logger.info("leavepage opens sucessfully");
		//lp.paternity();
		lp.add();
		lp.textleave();
		lp.savebtn();
		logger.info("saved sucessfully");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterTest
	public void close() {
		ScreenShot util = new  ScreenShot(driver);
		util.takeSnapShot("D:\\Groot1\\OrangeHRMDemo\\src\\test\\resources\\screenshots\\TestLeavesPage.png");
		logger.error("browser closed");
		  driver.close();				
	}

}
