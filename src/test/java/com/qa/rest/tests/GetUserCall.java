package com.qa.rest.tests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;



public class GetUserCall {
	
	
	public static void main(String[] args) {
		
	//Build REquest
		//Response resp =	
		RestAssured
		.given()
			.log().all()
			.baseUri("https://reqres.in/api/")
			.basePath("users/{id}")
			.pathParam("id", 2)
	//Hit the request and get the response
			//JsonPath j1 = new JsonPath(J1);
		
		.when()
			.get()
	//Validate the response
		.then().log().all()
			.statusCode(200);
		
		
		
			
		
	}
	

}
