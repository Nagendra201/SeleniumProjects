package com.cts.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSpicejet2 {
	WebDriver driver;

	@Test
		void browseropens() {
				//fail("Not yet implemented");
				driver.get("http://www.spicejet.com");
				driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
				
			}
			@Test
			void departure() {
					driver.findElement(By.xpath("//a[contains(text(),'Pune (PNQ)')]")).click();
			}
			
			@BeforeClass
			public  void beforclass() {
				System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
				 driver=new ChromeDriver();
			}
		
	}


