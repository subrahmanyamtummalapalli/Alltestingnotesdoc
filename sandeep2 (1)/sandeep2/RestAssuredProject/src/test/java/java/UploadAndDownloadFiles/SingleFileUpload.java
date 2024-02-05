package UploadAndDownloadFiles;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class SingleFileUpload {
	
	@Test
	public void singleFileUpload()
	{
		File f=new File("C:\\Users\\$P42000-5CVKF7CNLE6V\\sandeep\\oneableSysAdmin\\Configuration\\Config.properties");
		
		Response res=given()
		   .multiPart("file",f)
		   .contentType("multiPart/form-data")
		.when()
		   .post("https://the-internet.herokuapp.com/upload");
//		.then()
//		   .statusCode(201)
//		   .log().all();


		
}}
