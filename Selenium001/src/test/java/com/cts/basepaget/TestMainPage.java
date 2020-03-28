
package com.cts.basepaget;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMainPage extends BasePaget {
	
	TestMainPage tm;
	Registrationpageclass rpc;
	Loginpage lp;
	ComputersPage cp;
	ElectronicsPage ep;
	ApparelShoes as;
	Bookspage bp;
	DigitalDownloads dd;
	jry j;
	GiftCards gc;
	LogOutpage lo;
	
	
	@BeforeSuite
		public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");

	}
	@BeforeTest
	public void launchAPP() {
		tm=new TestMainPage();
		rpc=new Registrationpageclass();
		lp=new Loginpage();
		cp=new ComputersPage();
		ep=new ElectronicsPage();
		as=new ApparelShoes();
		bp=new Bookspage();
		dd=new DigitalDownloads();
		j=new jry();
		gc=new GiftCards();
		lo=new LogOutpage();
		
		
		
	}
	@Test
	public void testreg() {
		
			tm.registrationpage();
			rpc.radiobtn();
			rpc.firstname();
			rpc.lastname();
			rpc.email();
			rpc.password();
			rpc.confirmpwd();
			rpc.regbtn();
			lp.login();
			lp.emailpwd();
			lp.passwordpwd();
			lp.loginbtn();
			bp.Bookspage();
			cp.menu();
			ep.menu1();
			as.menu2();
			dd.DigitalDownloads();
			j.jry();
			gc.GiftCards();
			lo.LogOutpage();
			
			
	}
	@AfterTest
	public void close() {
		driver.quit();
	}
}
