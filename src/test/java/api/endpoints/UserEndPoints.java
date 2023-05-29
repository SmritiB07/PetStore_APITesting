package api.endpoints;
import static io.restassured.RestAssured.*;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//User endpoints .java file  created to perform crud operations
//Create, Read, Update ,delete requests to the user API


public class UserEndPoints {

	public static Response createUser(User payload) 
	{
		Response response=given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		.when()
		.post(Routes.post_URL);
		return response;
	}
	public static Response readUser(String userName) 
	{
		Response response=given()
		.pathParam("username",userName)
		.when()
		.get(Routes.get_URL);
		return response;
	}
	public static Response updateUser(User payload, String userName) 
	{
		Response response=given()
		.contentType(ContentType.JSON)// from swagger
		.accept(ContentType.JSON)// from swagger
		.body(payload)
		.pathParam("username",userName)
		.when()
		.put(Routes.put_URL);
		return response;
	}
	public static Response deleteUser(String userName) 
	{
		Response response=given()
		.pathParam("username",userName)
		.when()
		.delete(Routes.delete_URL);
		return response;
	}
	
	
	
	
}
