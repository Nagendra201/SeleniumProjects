package com.cts.basepaget;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage extends BasePaget{
	@FindBy(linkText = "ELECTRONICS")
	WebElement menu1;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/ul/li[2]/a")
	WebElement link1;
	public ElectronicsPage() {
		PageFactory.initElements(driver, this);
	}
	public void menu1() {
		Actions action = new Actions(driver);
		action.moveToElement(menu1).perform();

		Actions seriesofactions = action.moveToElement(link1).click();
		seriesofactions.build().perform();
	}

}
