package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario_2 {
	WebDriver driver;
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver","E:\\MyWorkspaces\\SeleniumPractice\\lib\\chromeDriver\\chromedriver.exe");
 
		//Open browser instance
		driver = new ChromeDriver();		
		//Open the AUT
		driver.get("https://www.jquery-az.com/boots/demo.php?ex63.0_2");
	}
	@Test
	public void test() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-7103\"]/a"));
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[2]/nav/div[3]/ul/li[2]/ul/li[4]/a"));	
	}

	@After
	public void after() {
		driver.close();
	}
	
}
