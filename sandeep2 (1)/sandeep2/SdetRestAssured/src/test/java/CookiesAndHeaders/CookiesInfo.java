package CookiesAndHeaders;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import java.util.Map;

public class CookiesInfo {
	
	@Test
	public void getCookie()
	{
		Response res=given()
		
		.when()
		  .get("https://www.google.com/");
		
		//get single cookie
		
		String single_Val = res.getCookie("AEC");
		System.out.println(single_Val);
		
		//get all cookies info
		Map<String, String> All_Cookies = res.getCookies();
		System.out.println(All_Cookies.keySet());
		for(String sandeep:All_Cookies.keySet())
		{
			
			String value=res.getCookie(sandeep);
			System.out.println(sandeep +" " +value);
		}
	}

}