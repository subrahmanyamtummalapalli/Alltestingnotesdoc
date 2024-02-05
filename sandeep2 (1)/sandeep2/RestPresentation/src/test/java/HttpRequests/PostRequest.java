package HttpRequests;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class PostRequest {
	int id;
	@Test(priority=1)
	public void createUser()
	{
	
	//Create a request using HASHMAP
	
//	HashMap data=new HashMap();
//	data.put("name", "sandeep");
//	data.put("mail", "sandeep.velpula@ojas-it.com");
	
	
	//create a request using JSONObject
	
//	JSONObject data=new JSONObject();
//	data.put("name", "sweety");
//	data.put("age", 3);
	
	//create a request using POJO class
	
	Pojo data=new Pojo();
	data.setName("akhilesh");
	data.setAge(7);
	
	
	id = given()
	   .contentType(ContentType.JSON)
	   .body(data)
	   
	
	.when()
	   .post("https://reqres.in/api/users")
	   .jsonPath().getInt("id");
	   
//	   .then()
//	   
//
//	   .statusCode(201)
//	   .log().all();
	
}
}


