package day1;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class PathAndQuery {
 
	@Test
	void PathPar()
	{
		given()
		.pathParam("path", "users")
		.queryParam("page", 2)
		
		.when()
		
		  .get("https://reqres.in/api/{path}?page")
		
		.then()
		  .statusCode(200)
		  .log().all();
	}
}
