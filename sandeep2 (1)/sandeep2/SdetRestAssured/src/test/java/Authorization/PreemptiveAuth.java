package Authorization;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;

public class PreemptiveAuth {
	
	@Test
	public void preemtiveA()
	{
		given()
		   .auth().preemptive().basic("postman", "password")
		
		.when()
		   .get("https://postman-echo.com/basic-auth")
		
		.then()
		   .statusCode(200)
		   .log().all();
	}

}
