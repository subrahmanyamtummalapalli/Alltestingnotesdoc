package CookiesAndHeaders;

import static io.restassured.RestAssured.given;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeadersInfo {
	@Test
	public void getHeaders()
	{
	Response res=given()
			
			.when()
			  .get("https://www.google.com/");
			
			//get single cookie
			
//			String single_Val = res.getHeader("Content-Type");
//			System.out.println(single_Val);
			 
			//get all cookies info
			Headers All_Headers = res.getHeaders();
			
			for(Header sandeep:All_Headers)
			{
				System.out.println(sandeep.getName()+" "+ sandeep.getValue());
				
			}

}
}
