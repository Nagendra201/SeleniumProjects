package com.cts.basepaget;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage extends BasePaget {
	@FindBy(linkText = "COMPUTERS")
	WebElement menu;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[1]/a")
	WebElement link;
	public ComputersPage() {
		PageFactory.initElements(driver, this);
	}
	public void menu() {
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();

		Actions seriesofactions = action.moveToElement(link).click();
		seriesofactions.build().perform();
	}
	
}
