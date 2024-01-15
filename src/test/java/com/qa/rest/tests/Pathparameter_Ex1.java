package com.qa.rest.tests;

import io.restassured.RestAssured;

public class Pathparameter_Ex1 {

	public static void main(String[] args) {
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://reqres.in/api/")
			.basePath("{basePath}/{Id}")
			.pathParam("basePath", "users")
			.pathParam("Id", 2)
		.when()
			.get()
		.then()
			.log()
			.all();

	}

}
