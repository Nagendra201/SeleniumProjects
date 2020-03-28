package com.cts.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;

class TestJunit1 {
	WebDriver driver;
	

	@Test
	void test() {
		//fail("Not yet implemented");
		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("i am groot");
		driver.findElement(By.name("q")).submit();
		driver.quit();
		//assertEquals("Google",driver.getTitle());
		System.out.println("test case passed");
		
		
		
	}
	@BeforeEach
	void before() {
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	@AfterEach
	void after() {
						driver.quit();
	}
	
	
	

}
