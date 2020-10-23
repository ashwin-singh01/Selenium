package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Scenario6 {
	@Test (dataProvider="credentials")
	public void check(String Username, String Password) {
		System.out.println(Username);
		System.out.println(Password);
	}
	
	@DataProvider(name="credentials")
	public Object getD() {
		Object [][] d= new Object[2][2];
		d[0][0]= "user1";
		d[0][1]="password1";
		d[1][0]="user2";
		d[1][1]= "password2";
		return d;
	}
	
	
}
