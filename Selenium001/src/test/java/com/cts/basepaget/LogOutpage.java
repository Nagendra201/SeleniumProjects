package com.cts.basepaget;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutpage  extends BasePaget {
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement LogOutpage;
	public LogOutpage() {
		PageFactory.initElements(driver, this);
	}
	public void LogOutpage() {
		LogOutpage.click();

 }
}