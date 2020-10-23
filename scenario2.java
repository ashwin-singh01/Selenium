package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scenario2 {
	WebDriver driver;
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver","E:\\MyWorkspaces\\SeleniumPractice\\lib\\chromeDriver\\chromedriver.exe");
 
		//Open browser instance
		driver = new ChromeDriver();		
		//Open the AUT
		driver.get("https://jqueryui.com/droppable/");
	}
	@Test
	public void test() throws InterruptedException {
		WebElement dragP=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/aside[1]/ul/li[1]/a"));
		WebElement dropP=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/aside[1]/ul/li[2]/a"));	
		
		Actions action=new Actions(driver);
		action.dragAndDrop(dragP, dropP).perform();
	}

	@After
	public void after() {
		driver.close();
	}
}
