package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoint.EndPoints;
import api.payload.User;
import io.restassured.response.Response;

public class UserTest {
	
	Faker faker;
	User userPayload;
	
	@BeforeClass
	public void setUp()
	{
		faker=new Faker();
		userPayload=new User();
		
		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUsername(faker.name().username());
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPassword(faker.internet().password());
		userPayload.setPhone(faker.phoneNumber().cellPhone().hashCode());
		
	}
	
	@Test(priority=1)
	public void postUser()
	{
		Response res = EndPoints.createUser(userPayload);
		res.then().log().all();
		
		Assert.assertEquals(res.getStatusCode(), 200);
	}
	
	@Test(priority=2)
	public void readUser()
	{
		Response res=EndPoints.getUser(this.userPayload.getUsername());
		res.then().log().all();
		Assert.assertEquals(res.getStatusCode(), 200);
	}
	
	@Test(priority=3)
	public void updateUser()
	{
		userPayload.setUsername(faker.name().username());
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPassword(faker.internet().password());
		
		Response res = EndPoints.putUser(this.userPayload.getUsername(),userPayload);
		res.then().log().all();
		
		Assert.assertEquals(res.getStatusCode(), 200);
	}
	
	@Test(priority=4)
	public void dltUser()
	{
		Response res=EndPoints.deleteUser(this.userPayload.getUsername());
		res.then().log().all();
		Assert.assertEquals(res.getStatusCode(), 200);
	}

}
