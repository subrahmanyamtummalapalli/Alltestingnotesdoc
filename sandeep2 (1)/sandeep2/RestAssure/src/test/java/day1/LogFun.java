package day1;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class LogFun {
	
	@Test
	public void log()
	{
		given()
		
		
		.when()
		  .get("https://www.google.com/")
		
		.then()
		 // .log().cookies();
		 //.log().headers();
		.log().body();
	}

}