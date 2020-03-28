package com.cts.basepaget;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class jry extends BasePaget {
	@FindBy(linkText = "JEWELRY")
	WebElement jry;
	public jry() {
		PageFactory.initElements(driver, this);
	}
	public void jry() {
		jry.click();

 }
}

