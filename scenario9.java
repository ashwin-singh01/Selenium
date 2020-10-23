package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class scenario9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties P = new Properties();
		FileInputStream F= new FileInputStream(" input_Location");
		P.load(F);
		System.out.println(P.getProperty("browser"));
		System.out.println(P.getProperty("url"));
		System.out.println(P.getProperty("name"));
		System.out.println(P.getProperty("Password"));
	}

}
