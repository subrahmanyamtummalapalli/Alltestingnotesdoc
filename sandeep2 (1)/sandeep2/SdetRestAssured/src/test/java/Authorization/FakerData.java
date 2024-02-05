package Authorization;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FakerData {
	
	@Test
	public void fakeData()
	{
		Faker data=new Faker();
		String fullName=data.name().fullName();
		System.out.println(fullName);
		String username=data.name().username();
		System.out.println(username);
		
		String pwd=data.internet().password();
		System.out.println(pwd);
		
		String num = data.phoneNumber().cellPhone();
		System.out.println(num);
	}

}
