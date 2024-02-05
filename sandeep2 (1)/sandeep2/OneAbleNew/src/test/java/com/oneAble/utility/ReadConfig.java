package com.oneAble.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	//constructor
	public ReadConfig()
	{
		File src =new File("./configuration/Config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	}
		catch(Exception e)
		{
			System.out.println("Exception is "+e.getMessage());
		}
	}
	//Create to call url, un, pwd
	public String getApplicationURL() 
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getUsername()
	{
		String username=pro.getProperty("username");
				return username;
	}
	public String getPassword()
	{
		String password=pro.getProperty("password");
		return password;
	}

}
