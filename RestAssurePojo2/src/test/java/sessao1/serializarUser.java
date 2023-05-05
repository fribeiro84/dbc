package sessao1;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
 

public class serializarUser {
	
	@Test
	public void criarJsonObject() throws JsonProcessingException {
		
		user u1 = new user();
		u1.setName("morpheus");
		u1.setJob("leader");
		
		ObjectMapper objMapper = new ObjectMapper();
		
		String userJSON = objMapper.writeValueAsString(u1);
		System.out.println(userJSON);
		
		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.baseUri("https://reqres.in/api/users");
		reqSpec.contentType(ContentType.JSON);
		reqSpec.body(userJSON);
		Response response = reqSpec.post();
		response.prettyPrint();
		
		//Validar status code
		Assert.assertEquals(response.statusCode(), 201, "Verificando Status Code");
		
		
		
	}

}
