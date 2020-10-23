package com.test;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario3_2 {

	WebDriver driver;
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver","E:\\MyWorkspaces\\SeleniumPractice\\lib\\chromeDriver\\chromedriver.exe");
 
		//Open browser instance
		driver = new ChromeDriver();		
		//Open the AUT
		driver.get("http://popuptest.com/goodpopups.html");
	}
	@Test
	public void test() throws InterruptedException {
		Thread.sleep(5000);
		String newT = Keys.chord(Keys.CONTROL,Keys.RETURN) ;
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
		Set<String> WHandle = driver.getWindowHandles();
		for (String T:WHandle) {
			driver.switchTo().window(T);
		}
		
		}

	@After
	public void after() {
		driver.quit();
	}

}
