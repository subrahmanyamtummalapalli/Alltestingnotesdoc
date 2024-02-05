package HttpRequests;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class UpdateRequest extends PostRequest {
	
	
	
	@Test(priority=2,dependsOnMethods = {"createUser"})
	public void updateUser()
	{
		HashMap data=new HashMap();
		data.put("name", "sweety");
		data.put("mail", "sandeep.vel@ojas-it.com");
		
		given()
		 .contentType("application/json")
		 .body(data)
		 
		.when()
		 .put("https://reqres.in/api/users/"+id)

		 
		.then()
		.statusCode(200)
		.log().all();
	}
  

}