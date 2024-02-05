package day1;

import static io.restassured.RestAssured.*;
//import io.restassured.matcher.ResponseAwareMatcher;
//import  static io.restassured.matcher.RestAssuredMatchers.*;
//import  io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.ValidatableResponse;
//import static io.restassured.RestAssured.given;

public class HttpRequests {

	ValidatableResponse id;

	@Test(priority = 0)
	public void getusers() {

		         given()
                   .when()
			         .get("https://reqres.in/api/users?page=2")
				
				
				
				.then()
				.statusCode(200)
				.body("page", equalTo(2))
				.log().all();

	}

@Test(priority=1)
void createUser() {
	
	//create request using HASHMAP
//	   HashMap data=new HashMap();
//	   data.put("name", "sandeep");
//	   data.put("loc", "singarayakonda");
	
	
	//CREATE A REQUEST USING oRG.JSON
	
//	JSONObject data=new JSONObject();
//	 data.put("name", "sandeep");
//	 data.put("loc", "singarayakonda");
	
	//Creating a request using pojo
	
	Pojo data=new Pojo();
	data.setName("sandeep");
	data.setLoc("singarayakonda"); 
	   
	   given()
	   .body(data.toString())
	   .when()
	    .post("https://reqres.in/api/users")
	    .then()
	    .statusCode(201)
	    
	    .log().all();
	    
}
@Test(priority=2,dependsOnMethods = {"createUser"})
public void update()
{
	HashMap data=new HashMap();
	   data.put("name", "sweety");
	   data.put("loc", "somarajupalli");
	   
	   id=given()
	   .body(data)
	   
	   .when()
	    .put("https://reqres.in/api/users/"+id)
	    
	    .then()
	    .log().all();
	
}
@Test(priority=4)
void deleteUser()
{
	given()
	
	.when()
	  .delete("https://reqres.in/api/users/2")
	  
	.then()
	  .statusCode(204)
	  .log().all();
}

	
}