package day1;
import static io.restassured.RestAssured.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Cookies {
@Test
void testCoolies()
{
//	given()
//	
//	
//	
//	.when()
//	
//	 .get("https://www.google.com/")
//	
//	.then()
//	.cookie("AEC","Ad49MVFMoWzbcXei3Etu-CVUbMnWOmwl4VDxvGhbMSobaAY5TOILPI-zXmI")
//	.log().all();
	
	Response res=given()
			.when()
			.get("https://www.google.com/");
			String  ck=res.getCookie("AEC");
			System.out.println(ck);
			
			//gET ALL COOKIES
			
			Map<String, String> cks = res.getCookies();
			System.out.println(cks);
			for(String c:cks.keySet())
			{
				System.out.println(c);
			}
}
}
