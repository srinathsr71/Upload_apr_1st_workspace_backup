package practice_rest_assured;

import org.hamcrest.Matcher;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static io.restassured.RestAssured.*;
public class practice1 {
	
	//String url="https://reqres.in";
	
	@Test
	public void Get_Method_QueryParam() {
		Response response=given().queryParam("page", 2).queryParam("per_page", 4)
				.when().get("https://reqres.in/api/users");
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
	}
	
//	@Test
//	public void Extract_Headers() {
//		Response response=given()
//				.when().get("https://reqres.in/api/users/1");
//		Headers headers=response.getHeaders();
//		for(Header header:headers) {
//			System.out.println(header.getName()+":"+header.getValue());
//		}
//		System.out.println(response.getBody().asString());
//		System.out.println(response.getStatusCode());
//	}
	
	@Test
//	public void Validate_Json_Schema() {
//		Response response=given()
//				.when().get("https://reqres.in/api/users?page=2");
//		response.then().assertThat().body("data[0]",matchesJsonSchemaInClasspath("userschema.json"));
//		System.out.println(response.getBody().asString());
//		System.out.println(response.getStatusCode());
//	}

	
	public void Basic_authentication() {
	given().auth().basic("username", "password")
			.when().get("https://reqres.in/api/users").then().statusCode(200).log().all();
	
}
	
	
//	@Test
//	public void create_resource() {
////		js.put("name","Tenali Ramakrishna");
////		js.put("gender","male");
////		js.put("email","tenali.ramakrishna@15ce.com");
////		js.put("status","active");
//		//given().body(js.toJSONString()).when().post("https://gorest.co.in/public/v2/users").then().statusCode(201).log().all();
//		JSONObject js=new JSONObject();
//		js.put("id", "101");
//		js.put("username", "abc");
//		js.put("firstName", "abcnnnn");
//		js.put("lastName", "iokekek");
//		js.put("email", "sj@gmail.com");
//		js.put("password", "12332111");
//		js.put("phone", "9877588838");
//		js.put("userStatus", "1");
//		given().contentType(ContentType.JSON).accept(ContentType.JSON)
//		.body(js).post("https://petstore.swagger.io/v2/user").then().statusCode(200).log().all();
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
