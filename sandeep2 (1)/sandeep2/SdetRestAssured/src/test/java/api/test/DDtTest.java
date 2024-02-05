package api.test;

import org.testng.annotations.Test;

import api.endpoint.EndPoint1;
import api.endpoint.EndPoints;
import api.payload.User;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class DDtTest {
	@Test(priority=1,dataProvider="data",dataProviderClass=DataProviders.class)
	public void postUser(String uid,String uname,String fname,String lname,String pwd,String safeemail,String phn)
	{
		User u=new User();
		u.setId(Integer.parseInt(uid));
		u.setUsername(uname);
		u.setFirstName(fname);
		u.setLastName(lname);
		u.setEmail(safeemail);
		u.setPassword(pwd);
		u.setPhone(Integer.parseInt(phn));
		
		Response res=EndPoints.createUser(u);
		res.then().log().all();
//		
//		Assert.assertEquals(res.getStatusCode(), 200);
		
	}
	
	@Test(priority=2,dataProvider = "username",dataProviderClass=DataProviders.class)
	public void dltUser(String username)
	{
		Response res=EndPoints.deleteUser(username);
		res.then().log().all();
		
		//Assert.assertEquals(res.getStatusCode(), 200);
	}

}