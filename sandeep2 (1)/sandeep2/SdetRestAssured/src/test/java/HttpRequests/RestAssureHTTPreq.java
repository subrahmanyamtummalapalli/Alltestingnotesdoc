package HttpRequests;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.HashMap;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class RestAssureHTTPreq {
	int id;
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
	
	@Test(priority=1)
	public void createUser()
	{
		
		//Create a request using HASHMAP
		
//		HashMap data=new HashMap();
//		data.put("name", "sandeep");
//		data.put("mail", "sandeep.velpula@ojas-it.com");
		
		
		//create a request using JSONObject
		
//		JSONObject data=new JSONObject();
//		data.put("name", "sweety");
//		data.put("age", 3);
		
		//create a request using POJO class
		
		Pojo data=new Pojo();
		data.setName("akhilesh");
		data.setAge(5);
		
		
		id= given()
		   .contentType(ContentType.JSON)
		   .body(data)
		   
		
		.when()
		   .post("https://reqres.in/api/users")
		   .jsonPath().getInt("id");
		System.out.println(id);
		   
//		   .then()
//		   
//   
//		   .statusCode(201)
//		   .log().all();
		
	}
	
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
		 //.jsonPath().getInt("id");
		 
		.then()
		.statusCode(200)
		.log().all();
	}
  
}
