package Authorization;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;


public class DigestAuth {
	
	@Test
	public void digestA()
	{
		given()
		.auth().digest("postman", "password")
		.when()
		.get("https://postman-echo.com/basic-auth")
		
		.then()
		.statusCode(200)
		.log().all();
		
	}

}
