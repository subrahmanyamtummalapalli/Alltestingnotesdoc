package day1;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.github.scribejava.core.model.Response;

import io.restassured.response.ValidatableResponse;

public class ParsingResponse {
	@Test
  void testResponseData()
  {
		io.restassured.response.Response res=given()
				.contentType("ContentType.JSON")
				.when()
				.get("https://reqres.in/api/users?page=2");
		JSONObject data1=new JSONObject(res.asString());
		boolean status=false;
		for(int i=0;i<data1.getJSONArray("data").length();i++)
		{
			
			String fname = data1.getJSONArray("data").getJSONObject(i).get("first_name").toString();
			System.out.println(fname);
		}
				
		
		//JSONObject data=new JSONObject(res.asString());
  }
}
