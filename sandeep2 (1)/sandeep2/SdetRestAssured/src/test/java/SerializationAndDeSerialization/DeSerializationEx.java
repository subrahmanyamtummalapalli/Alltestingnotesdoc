package SerializationAndDeSerialization;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeSerializationEx {
	
	@Test
	public void deSerial() throws JsonMappingException, JsonProcessingException
	{
		
		//created jsonObject
		String s="{\r\n"
				+ "  \"name\" : \"sandeep\",\r\n"
				+ "  \"age\" : 25\r\n"
				+ "}";
		
		//converted json object into java object
		
		ObjectMapper om=new ObjectMapper();
		Pojo javaObject = om.readValue(s, Pojo.class);
		javaObject.getAge();
		javaObject.getName();
		
		System.out.println(javaObject.getAge());
		System.out.println(javaObject.getName());
		
		
	}

}
