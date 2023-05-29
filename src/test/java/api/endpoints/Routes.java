package api.endpoints;

/*Swagger URI-------https://petstore.swagger.io
DElete:---------------https://petstore.swagger.io/v2/user/{username}
Get:-------------------https://petstore.swagger.io/v2/user/{username}
Update user (PUT):-----https://petstore.swagger.io/v2/user/{username}
Create POST:------https://petstore.swagger.io/v2/user
*/

public class Routes {
	public static String base_URL = "https://petstore.swagger.io/v2";
	
	
    //User Module
	public static String post_URL = base_URL+"/user";
	public static String get_URL = base_URL+"/user/{username}";
	public static String put_URL = base_URL+"/user/{username}";
	public static String delete_URL = base_URL+"/user/{username}";// path parameter
	
	//Store Module
	//here we will create store module URLs
	
	//Pet Module
	// Here we willl create Pet modules URLs


}
