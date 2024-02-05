package pathAndQueryParams;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class PathAndQueryParameters {

	 @Test
	 public void path_QueryParams()
	 {
		 given()
		     .pathParam("path1","api")
		     .pathParam("path2","users")
		     .queryParam("page", 2)
		     .queryParam("id", 8)
		 
		 .when()
		     .get("https://reqres.in/{path1}/{path2}")
		 .then()
		     .statusCode(200)
		     .log().all();
	 }

}
