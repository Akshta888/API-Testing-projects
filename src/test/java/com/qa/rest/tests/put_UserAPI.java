package com.qa.rest.tests;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;

public class put_UserAPI {
	
	static void put_API()
	{
		given()
//			.baseUri("https://reqres.in/api/")
//			.basePath("users/2")
			.header("Content-Type","application/json")
			.log()
			.all()
			.body("{\r\n"
					+ "    \"name\": \"morpheus123\",\r\n"
					+ "    \"job\": \"zion resident\"\r\n"
					+ "}")
		.when()
			.put()
		.then()
			.log().all()
			.assertThat()
			.statusCode(200)
			.time(Matchers.lessThan(4000L)).time(Matchers.greaterThan(1000L), TimeUnit.MILLISECONDS);
		
	}
	
	public static void main(String[] args)
	{
		put_API();
		
	}

}