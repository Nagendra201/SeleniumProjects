package com.cts.basepaget;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCards extends BasePaget {
	@FindBy(linkText = "GIFT CARDS")
	WebElement GiftCards;
	public GiftCards() {
		PageFactory.initElements(driver, this);
	}
	public void GiftCards() {
		GiftCards.click();

 }
}