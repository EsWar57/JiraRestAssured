package Jira;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Jiradelete extends JiraBaseclass {

	
	@Test(dependsOnMethods="Jira.jiraupdate.update")
	public void delete() {
		
		Response response = RestAssured.given().delete("/issue/"+id);
		
		int status= response.getStatusCode();
		
		System.out.println("status code for delete request......"+" == "+ status);
		
		response.then().assertThat().statusCode(Matchers.equalTo(status));
	}
}
