package com.cts.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BasePage {

	private static WebDriver driver;

	public WebDriver launchApp(String browser) {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browser.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com");

		return driver;
	}

 
	public void quit() {

		driver.quit();
	}
	
	public void getScreenshot(String result) throws IOException {
		System.out.println(driver);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://test//" + result + "screenshot.png"));
	}

}
