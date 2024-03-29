package JsonResponseValidator;

import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;


public class ResponseData {
	
	@Test
	public void approch1()
	{
		given()
		
		  .contentType(ContentType.JSON)
		
		.when()
		  .get("https://reqres.in/api/users?page=2")
		
		.then()
		  .statusCode(200)
		  .body("data[0].last_name", equalTo("Lawson"))
		  .log().all();
	}

}
