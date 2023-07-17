package Jira;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class JiraBaseclass  {
	
	public static String id;

	@BeforeMethod
	public void baseclass() {
		
		RestAssured.baseURI="https://esk55.atlassian.net/rest/api/2";
		RestAssured.authentication=RestAssured.preemptive().basic("eswark.test@gmail.com", "ATATT3xFfGF0s9BgOnUd3E8Cv1LHr_Pq1jlX6qcAfuiK84zUplfRBdanSdimp-jrzso4Y-WN_V_qCiFoTW-b5EO6-B8TaxwzLapJ8WE8lEw2sI9GnF4bl2s1nrZYrmwW2q0oTBnJLdcioBvLsHMPalzDY2wcu7r6jlpyxFO0kvbNFWxlq_lF6_c=FC9D5F0A");
	}
}
