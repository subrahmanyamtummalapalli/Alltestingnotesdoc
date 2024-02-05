package HttpRequests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

public class GetRequest {

	@Test(priority=0)
	public void getUser()
	{
		given()
		
		.when()
		   .get("https://reqres.in/api/users?page=2")
		.then()
		   .statusCode(200)
		   .and()
		   .body("page", equalTo(2))
		   .and()
		   .log().all();
}
}
