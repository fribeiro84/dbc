package testePojo;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import pacotePojo.CreateUser;
import java.util.*;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PojoValidaCreate {
	
	@Test
	
	public void DeserTest() {
		/*RestAssured.baseURI = "https://reqres.in/api/users";
		CreateUser pojo = new CreateUser();
		RestAssured.given().when().get().as(CreateUser.class);
		
		System.out.println(pojo.toString());
		*/
		HashMap data=new HashMap();
		given()
		.contentType("application/json")
		.body(data)
		
	.when()
		.post("https://reqres.in/api/users")
	
	.then()
		.statusCode(201)
		.log().all();
	
		
		
	}
	
}
		
		
	

