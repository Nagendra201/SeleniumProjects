package com.cts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.baseclass.BasePage;

public class MaintanancePage  extends BasePage {
	WebDriver driver;
	@FindBy(linkText = "Maintenance")
	WebElement Maintenance;
	@FindBy(linkText  = "Purge Records")
	WebElement PurgeRecords;
	@FindBy(linkText  = "Candidate Records")
	WebElement CandidateRecords;
	@FindBy(xpath = "//input[@id=\"confirm_password\"]")
	WebElement verifypwd;
	@FindBy(xpath = "//input[@value=\"Verify\"]")
	WebElement verifybtn;
	@FindBy(xpath = "//input[@id=\"candidate_empName\"]")
	WebElement textvacancy;
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/form/div/div/input")
	WebElement searchbtn;

	public MaintanancePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver =driver;

	}
	public void Maintenance() {
		
		Actions action = new Actions(driver);
		action.moveToElement(Maintenance).perform();
		action.moveToElement(PurgeRecords).perform();

		Actions seriesofactions = action.moveToElement(CandidateRecords).click();
		seriesofactions.build().perform();
		}
	public void verifypwd() {
		
		verifypwd.sendKeys("admin123");
			}
	public void verifybtn() {
		
		verifybtn.click();
			}
	public void textvacancy() {
	
		textvacancy.sendKeys("associate");
			}
	public void searchbtn() {
		
				searchbtn.click();
					}
	

}
