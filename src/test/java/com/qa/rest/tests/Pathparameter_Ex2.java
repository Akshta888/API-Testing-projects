package com.qa.rest.tests;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class Pathparameter_Ex2 {

	public static void main(String[] args) {
		Map<String,Object> pathParameters = new HashMap<>();
		pathParameters.put("basePath", "users");
		pathParameters.put("Id", 2);
		
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://reqres.in/api/")
			.basePath("{basePath}/{Id}")
			//.pathParam("basePath", "booking")
			//.pathParam("bookingId", 2)
			.pathParams(pathParameters)
		.when()
			.get()
		.then()
			.log()
			.all();

	}

}
