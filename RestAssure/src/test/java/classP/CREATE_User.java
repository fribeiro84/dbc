package classP;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class CREATE_User {
	
	@Test
	void createUser() {
		
		HashMap data=new HashMap();
		data.put("name", "pavan");
		data.put("job", "trainer");
		
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


