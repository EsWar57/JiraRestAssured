package Jira;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class jiracreate extends JiraBaseclass {

	@Test
	public void create ()
	{
		
	
		
		File file = new File("./src/test/resources/JiraPost.json");
		 RequestSpecification input = RestAssured.given().contentType("application/json").when().body(file);
		
		Response response = input.post("/issue");
		
		response.prettyPrint();
		
		id=response.jsonPath().get("id");
		
		System.out.println("the id number is----------"+" "+ id);
		int status= response.getStatusCode();
		
		System.out.println("status code for create request......"+" == "+ status);
	
		response.then().assertThat().statusCode(Matchers.equalTo(status));
	}
}
