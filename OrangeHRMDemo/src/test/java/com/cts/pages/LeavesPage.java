package com.cts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.baseclass.BasePage;

public class LeavesPage extends BasePage {
	WebDriver driver;
	@FindBy(linkText = "Leave")
	WebElement leave;
	@FindBy(linkText  = "Configure")
	WebElement configure;
	@FindBy(linkText  = "Leave Types")
	WebElement leavetypes;
	@FindBy(xpath = "//a[contains(text(),'Paternity US')]")
	WebElement paternity;
	@FindBy(xpath = "//input[@id='btnAdd']")
	WebElement add;
	@FindBy(xpath = "//input[@name='leaveType[txtLeaveTypeName]']")
	WebElement textleave;
	@FindBy(xpath = "//input[@value='Save']")
	WebElement savebtn;

	public LeavesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver =driver;

	}
	public void leave() {
		
		Actions action = new Actions(driver);
		action.moveToElement(leave).perform();
		action.moveToElement(configure).perform();

		Actions seriesofactions = action.moveToElement(leavetypes).click();
		seriesofactions.build().perform();
	}
	public void paternity() {
		
		paternity.click();
		}
		public void add() {
		
				add.click();
		}
		
		public void savebtn() {
			savebtn.click();
			
		}
		public void textleave() {
			textleave.sendKeys("my ankel was twisted, so need a mdical leave");
			
		}

}
