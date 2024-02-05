package ParsingXmlValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import java.util.List;


public class XmlValidation {
	
	@Test
	public void approch1()
	{
		Response res=given()
				
				.contentType(ContentType.XML)
		
		.when()
		  .get("http://restapi.adequateshop.com/api/Traveler?page=1");
		
		Assert.assertEquals(res.getStatusCode(), 200);
		Assert.assertEquals(res.getHeader("Content-Type"), "application/xml; charset=utf-8");
		
		XmlPath xm=new XmlPath(res.asString());
		List<String> traveler_name = xm.getList("TravelerinformatioResponse.travelers.Travelerinformation.name");
		System.out.println(traveler_name);
		boolean status=false;
		for(String k:traveler_name)
		{
			if(k.equals("Developer"))
			{
				status=true;
				break;
			}
		}
		Assert.assertEquals(status, true);
		 
	}

}
