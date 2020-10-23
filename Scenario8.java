package com.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario8 {

	WebDriver driver;
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver","E:\\MyWorkspaces\\SeleniumPractice\\lib\\chromeDriver\\chromedriver.exe");
 
		//Open browser instance
		driver = new ChromeDriver();		
		//Open the AUT
		driver.get("https://www.zlti.com");
	}
	@Test
	public void test() throws InterruptedException, IOException {
		List<WebElement> link= driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		System.setProperty("javax.net.ssl.trustStore", "D:\\");
		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		for(int i=0;i <link.size();i++) {
			WebElement We=link.get(i);
			String url=We.getAttribute("href");
			verifyLinkActive(url);
		}
		
	}

	private void verifyLinkActive(String url) throws IOException {
		// TODO Auto-generated method stub
		
		URL u = new URL(url);
		
		HttpURLConnection connect= (HttpURLConnection) u.openConnection() ;
		connect.setConnectTimeout(1000);
		connect.connect();
		
		if(connect.getResponseCode()==200) {
			System.out.println(url +"-"+connect.getResponseMessage());
		}
		if(connect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
			System.out.println(url +"-"+connect.getResponseMessage()+"-"+HttpURLConnection.HTTP_NOT_FOUND);
				
		}
		
	}
	@After
	public void after() {
		driver.close();
	}

}
