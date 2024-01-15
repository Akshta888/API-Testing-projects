package com.qa.rest.tests;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostUserAPI {
	public static void main(String[] args) {
	
		//RequestSpecification requestSpecification = RestAssured.given();
		RequestSpecification requestSpecification1 = RestAssured.given().log().all();
		requestSpecification1.baseUri("https://reqres.in/api/");
		requestSpecification1.basePath("users");
		requestSpecification1.body("{\r\n"
				+ "		    \"name\": \"morpheus\",\r\n"
				+ "		    \"job\": \"leader\"\r\n"
				+ "		}");
		requestSpecification1.contentType(ContentType.JSON);
		
		Response response = requestSpecification1.post();
		
		ValidatableResponse validatableresponse = response.then().log().all();
		validatableresponse.statusCode(201);
	}	
		
}
