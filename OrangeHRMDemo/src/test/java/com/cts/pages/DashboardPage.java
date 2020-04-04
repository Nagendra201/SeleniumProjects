package com.cts.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	WebDriver driver;
	@FindBy(linkText = "Dashboard")
			WebElement dashboard;
	@FindBy(xpath = "//span[contains(text(),'Timesheets')]")
	WebElement timesheet;
	@FindBy(xpath = "//input[@id=\"employee\" and @type=\"text\" ]")
	WebElement employeename;
	@FindBy(xpath = "//input[@type=\"button\" and @id=\"btnView\" ]")
	WebElement viewbtn;
	public DashboardPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver =driver;
	}
		public void dashboard() {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			dashboard.click();
		}
		public void timesheet() {
			
			timesheet.click();
		}
		public void employeename() {
			
			employeename.sendKeys("Hannah Flores");
		}
		public void viewbtn() {
			
			viewbtn.click();
		}
	

}
