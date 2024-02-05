package SerializationAndDeSerialization;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationExample {
	
	@Test
	public void serial() throws JacksonException
	{
		//created java object
		Pojo p=new Pojo();
		p.setAge(25);
		p.setName("sandeep");
		
		//convert java object to json object
		
		ObjectMapper om=new ObjectMapper();
		String s=om.writerWithDefaultPrettyPrinter().writeValueAsString(p);
		System.out.println(s);
	}

}
