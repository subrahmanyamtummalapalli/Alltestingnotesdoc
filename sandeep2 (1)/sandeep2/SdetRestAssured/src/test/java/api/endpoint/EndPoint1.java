package api.endpoint;

import static io.restassured.RestAssured.given;

import java.util.ResourceBundle;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class EndPoint1 {
	
	static ResourceBundle getUrl()
	{
         ResourceBundle rb=ResourceBundle.getBundle("config");
		return rb;
	}
	
	public static Response createUser(User payload)
	{
		String post_url = getUrl().getString("post");
		
		Response res=given()
		    .contentType(ContentType.JSON)
		    .accept(ContentType.JSON)
		    .body(payload)
		
		.when()
		    .post(post_url);
		
		return res;
	}
	
	public static Response getUser(String username)
	{
		String get_url = getUrl().getString("get");
		
		Response res=given()
		          .pathParam("username", username)
		
		.when()
		    .get(get_url);
		
		return res;
	}
	
	public static Response putUser(String username,User payload)
	{
		String put_url = getUrl().getString("put");
		
		Response res=given()
		    .contentType(ContentType.JSON)
		    .accept(ContentType.JSON)
		    .pathParam("username", username)
		    .body(payload)
		
		.when()
		    .put(put_url);
		
		return res;
	}
	
	public static Response deleteUser(String username)
	{
		String delete_url = getUrl().getString("delete");
		
		Response res=given()
		          .pathParam("username", username)
		
		.when()
		    .delete(delete_url);
		
		return res;
	}


}
