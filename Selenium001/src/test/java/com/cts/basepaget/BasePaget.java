package com.cts.basepaget;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePaget {
	public static WebDriver driver;


	@FindBy(linkText = "Register")
	WebElement register;
	public BasePaget() {
		PageFactory.initElements(driver, this);

	}
		public void registrationpage() {
			
				register.click();
		}
}
