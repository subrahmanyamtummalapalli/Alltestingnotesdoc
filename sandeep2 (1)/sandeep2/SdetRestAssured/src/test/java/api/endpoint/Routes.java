package api.endpoint;
//https://petstore.swagger.io/v2/user  post

//https://petstore.swagger.io/v2/user/{username}  get

//https://petstore.swagger.io/v2/user/{username}  put

//https://petstore.swagger.io/v2/user/{username} delete
public class Routes {
	
	//base url
	
	public static String base_url="https://petstore.swagger.io/v2";
	
	//user model
	
	public static String post=base_url+"/user";
	public static String get=base_url+"/user/{username}";
	public static String put=base_url+"/user/{username}";
	public static String delete=base_url+"/user/{username}";

}
