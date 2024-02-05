package JSONSchemaValidation;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class JsonSchema {
	
	@Test
	public void schema()
	{
		
		given()
		
		.when()
		   .get("https://reqres.in/api/users/2")
		
		.then()
		   .assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema1.json"));
		
	}

}