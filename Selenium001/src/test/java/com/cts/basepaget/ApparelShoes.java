package com.cts.basepaget;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelShoes extends BasePaget {
	@FindBy(linkText = "APPAREL & SHOES")
	WebElement menu2;
	public ApparelShoes() {
		PageFactory.initElements(driver, this);
	}
	public void menu2() {
		menu2.click();

 }
}
