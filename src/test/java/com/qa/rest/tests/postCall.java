package com.qa.rest.tests;


import io.restassured.RestAssured;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

public class postCall {

	
	public static void main(String[] args) {
		
		//Build request
				
			
		String response=	
				RestAssured
				.given()
						.log()
						.all()
						.baseUri("https://reqres.in/api/")
						.basePath("users")
						.body("{\r\n"
									+ "    \"name\": \"Akshta\",\r\n"
									+ "    \"job\": \"Teacher12\"\r\n"
									+ "}")
						.contentType(ContentType.JSON)
		//Hit request and get response
					.when()
						.post()
		//Validate the response
					.then()
						.log()
						.all()
						.extract()
						.body()
					//	.asString();
						.asPrettyString();
						System.out.println(response);

				
		
		
		
		
	}
	
}
