package com.cts.basepaget;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpageclass extends BasePaget {
	
	@FindBy(xpath = "//input[@name=\"Gender\" and @type='radio' and @id='gender-male']")
	WebElement radiobtn;
	@FindBy(xpath = " /html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input")
	WebElement firstname;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input")
	WebElement lastname;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input")
	WebElement email;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/input")
	WebElement password;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input")
	WebElement confirmpwd;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[4]/input")
	WebElement regbtn;
	 public void Registrationpageclass() {
		 PageFactory.initElements(driver, this);
	 }
	 public void radiobtn() {
		 radiobtn.click();
		 
	 }
 public void firstname() {
	 
	 
	 firstname.sendKeys("Nagendra ");
		 
	 }
 public void lastname() {
	 
	 lastname.sendKeys("Alahari");
 }
 public void email() {
	 
	 email.sendKeys("a.nagendra201@gmail.com");
	 
 }
 public void password() {
	 
	 password.sendKeys("6301136922");
 }
 public void confirmpwd() {
	
	 confirmpwd.sendKeys("6301136922");
	  }
 public void regbtn() {
	 
	 regbtn.click();
	 
 }
	 

}
