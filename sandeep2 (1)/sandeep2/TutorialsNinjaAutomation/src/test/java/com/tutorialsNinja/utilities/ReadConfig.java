package com.tutorialsNinja.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()	{
		
			File f=new File("./configuration/config.properties");
			try {
			FileInputStream fis=new FileInputStream(f);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());
			//e.printStackTrace();
		}
			
			
		
	}
	
	public String getUrl()
	{
		String baseUrl=pro.getProperty("url");
		return baseUrl;
	}
	
	public String getUsername()
	{
		String un=pro.getProperty("username");
		return un;
	}
	
	public String getPassword()
	{
		String pwd=pro.getProperty("password");
		return pwd;
		
	}

}
