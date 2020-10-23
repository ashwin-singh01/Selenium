package com.test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario7 {

	WebDriver driver;
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver","E:\\MyWorkspaces\\SeleniumPractice\\lib\\chromeDriver\\chromedriver.exe");
 
		//Open browser instance
		driver = new ChromeDriver();		
		//Open the AUT
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test
	public void test() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Dimension d= new Dimension(640,480);
		driver.manage().window().setSize(d);
		WebElement We= driver.findElement(By.name("q"));
		js.executeScript("arguments[0].value='Infosys'", We);
	}

	@After
	public void after() {
		driver.close();
	}

}
