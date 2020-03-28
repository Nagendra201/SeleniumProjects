package com.cts.basepaget;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookspage extends BasePaget {
	@FindBy(linkText = "BOOKS")
	WebElement Bookspage;
	public Bookspage() {
		PageFactory.initElements(driver, this);
	}
	public void Bookspage() {
		Bookspage.click();

 }
}
