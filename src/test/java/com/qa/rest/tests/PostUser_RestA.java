package com.qa.rest.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostUser_RestA {

	public static void main(String[] args) {

//Build request
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://reqres.in/api/")
				.basePath("users")
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
