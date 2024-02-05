package day1;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeadersDemo {
  @Test
  void getHeader()
  {
	  Response res=given()
			  
			  .when()
			    .get("https://www.google.com/");
			  
			  Headers hd = res.getHeaders();
			  System.out.println(hd);
  }
}
