package JsonResponseValidator;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;


public class Approch2 {
	
	@Test
	public void secondAppr()
	{
		Response res=given()
		   .contentType(ContentType.JSON)
		
		.when()
		   .get("https://reqres.in/api/users?page=2");
		
//		Assert.assertEquals(res.getStatusCode(),200);
//		String ln = res.jsonPath().get("data[0].last_name").toString();
//		Assert.assertEquals(ln, "Lawson");
		
		JSONObject jo=new JSONObject(res.asString());
		for(int i=0;i<jo.getJSONArray("data").length();i++)
		{
			String info=jo.getJSONArray("data").getJSONObject(i).get("last_name").toString();
			System.out.println(info);
			if(info.equals("Lawson"))
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
		
		
	}

}