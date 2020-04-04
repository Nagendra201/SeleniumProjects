package com.cts.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	WebDriver driver;
	@FindBy(xpath = "//a[contains(text(),'Welcome Admin')]")
	WebElement welcomeadmin;
	@FindBy(xpath = "//a[contains(text(),'About')]")
	WebElement about;
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement logout;
		public LogoutPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
				this.driver=driver;
	}
			public void welcomeadmin() {
				
				welcomeadmin.click();
			}
		public void about() {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			about.click();
			}
		public void logout() {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			
			logout.click();
		}
	

}
