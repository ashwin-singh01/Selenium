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

public class scenario_3 {

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
		//Thread.sleep(5000);
		String newT = Keys.chord(Keys.CONTROL,Keys.RETURN) ;
		driver.findElement(By.linkText("Medical Records")).sendKeys(newT);;
		Set<String> WHandle = driver.getWindowHandles();
		for (String T:WHandle) {
			driver.switchTo().window(T);
		}
		driver.findElement(By.linkText("Search Patient")).click();
		WebElement WE=driver.findElement(By.id("search_type"));
		Select W= new Select(WE);
		W.selectByVisibleText("First Name");
		driver.findElement(By.id("search_patient")).click();
	}

	@After
	public void after() {
		driver.quit();
	}

}
