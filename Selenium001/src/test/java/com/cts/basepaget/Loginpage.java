package com.cts.basepaget;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BasePaget {
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement login;
	@FindBy(xpath ="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/input")
	WebElement email;
	@FindBy(xpath ="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[3]/input")
	WebElement passwordpwd;
	@FindBy(xpath ="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	WebElement loginbtn;
	
	
	 public Loginpage() {
		 PageFactory.initElements(driver, this);
	 }
	 public void login() {
		 login.click(); 
	 }
	public void emailpwd() {
		
		email.sendKeys("a.nagendra201@gmail.com");
	}
	public void passwordpwd() {
		passwordpwd.sendKeys("6301136922");
		
	}
	public void loginbtn() {
		
		loginbtn.click();
}

}
