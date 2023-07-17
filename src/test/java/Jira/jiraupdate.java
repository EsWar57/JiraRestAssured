package Jira;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class jiraupdate extends JiraBaseclass {

	
	@Test(dependsOnMethods="Jira.jiracreate.create")
	public void update() {
	
		File file2= new File("./src/test/resources/JiraPut.json");
		 RequestSpecification input =RestAssured.given().contentType("application/json").when().body(file2);
		
		Response response =input.put("/issue/"+id);
		
		response.prettyPrint();
		
		int status= response.getStatusCode();
		
		System.out.println("status code for update request......"+" == "+ status);
		
		response.then().assertThat().statusCode(Matchers.equalTo(status));
		
	}
}
