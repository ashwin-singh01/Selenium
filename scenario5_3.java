package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class scenario5_3 {

	WebDriver driver;
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver","E:\\MyWorkspaces\\SeleniumPractice\\lib\\chromeDriver\\chromedriver.exe");
 
		//Open browser instance
		driver = new ChromeDriver();		
		//Open the AUT
		driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
	}
	@Test
	public void test() throws InterruptedException {
		//Thread.sleep(2000);
		String pageTitle = driver.getTitle();
		Assert.assertEquals("Welcome to OpenClinic : Clinica1",pageTitle);
			
	}

	@After
	public void after() {
		driver.close();
	}

}
