package com.test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class scenario5_1 {
	WebDriver driver;
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver","E:\\MyWorkspaces\\SeleniumPractice\\lib\\chromeDriver\\chromedriver.exe");
 
		//Open browser instance
		driver = new ChromeDriver();		
		//Open the AUT
		driver.get("https://api.jquery.com/dblclick/");
	}
	@Test
	public void test() throws InterruptedException {
		try {
			File ScreenS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File copy= new File("C:\\Users\\Dell User\\Documents\\img.JPG");
			Files.copy(ScreenS, copy);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
	}

	@After
	public void after() {
		driver.close();
	}

}
