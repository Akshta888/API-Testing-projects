package com.qa.rest.tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
public class RequestSpec_CommonVar {
	RequestSpecification requestspec;
	
	@BeforeClass
	public void setupSpec() {
		
		RequestSpecification requestspec = RestAssured.given();
		requestspec 
				.log()
				.all()
				.baseUri("https://reqres.in/api/")
				.basePath("users")
				.contentType(ContentType.JSON);
				
				
		}
	
	@Test
	public void postcall()
	{
		
		RestAssured
		.given()
			.spec(requestspec)
			.body("{\r\n"
						+ "    \"name\": \"Akshta\",\r\n"
						+ "    \"job\": \"Teacher\"\r\n"
						+ "}")
			.contentType(ContentType.JSON)
//Hit request and get response
		.when()
			.post()
//Validate the response
		.then()
			.log()
			.all()
			.statusCode(201);
	}

}
