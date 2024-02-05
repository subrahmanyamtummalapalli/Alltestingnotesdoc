package api.endpoint;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class EndPoints {
	
	public static Response createUser(User payload)
	{
		Response res=given()
		    .contentType(ContentType.JSON)
		    .accept(ContentType.JSON)
		    .body(payload)
		
		.when()
		    .post(Routes.post);
		
		return res;
	}
	
	public static Response getUser(String username)
	{
		Response res=given()
		          .pathParam("username", username)
		
		.when()
		    .get(Routes.get);
		
		return res;
	}
	
	public static Response putUser(String username,User payload)
	{
		Response res=given()
		    .contentType(ContentType.JSON)
		    .accept(ContentType.JSON)
		    .pathParam("username", username)
		    .body(payload)
		
		.when()
		    .put(Routes.put);
		
		return res;
	}
	
	public static Response deleteUser(String username)
	{
		Response res=given()
		          .pathParam("username", username)
		
		.when()
		    .delete(Routes.delete);
		
		return res;
	}

}
