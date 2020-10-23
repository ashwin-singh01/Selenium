package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Account {
	WebDriver driver;
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver","E:\\MyWorkspaces\\SeleniumPractice\\lib\\chromeDriver\\chromedriver.exe");
 
		//Open browser instance
		driver = new ChromeDriver();		
		//Open the AUT
		driver.get("https://accounts.google.com/signup");
	}
	@Test
	public void test() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("Ashwin");
		driver.findElement(By.id("lastName")).sendKeys("Singh");
		driver.findElement(By.id("username")).sendKeys("123what123ever321");
		driver.findElement(By.name("Passwd")).sendKeys("kuchvrkhlo");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("kuchvrkhlo");
		driver.findElement(By.className("CwaK9")).click();
		String pageTitle = driver.getTitle();
		System.out.println("Page title: " + pageTitle);
			
	}

	@After
	public void after() {
		driver.close();
	System.out.println("Inside after method.");
	}
}
