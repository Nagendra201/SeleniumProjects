package com.cts.basepaget;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloads extends BasePaget {
	@FindBy(linkText = "DIGITAL DOWNLOADS")
	WebElement DigitalDownloads;
	@FindBy(linkText = "JEWELRY")
	WebElement jry;
	public DigitalDownloads() {
		PageFactory.initElements(driver, this);
	}
	public void DigitalDownloads() {
		DigitalDownloads.click();

 }
	public void Jewelry() {
		jry.click();

 }
}
