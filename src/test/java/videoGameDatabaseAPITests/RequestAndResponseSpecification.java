package videoGameDatabaseAPITests;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeMethod;

import static io.restassured.http.ContentType.JSON;
import static org.apache.http.HttpStatus.SC_OK;

public class RequestAndResponseSpecification {
    static RequestSpecification requestSpecification;
    static ResponseSpecification responseSpecification;

    @BeforeMethod
    public void setRequestSpecification() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("http://localhost")
                .setBasePath("/app")
                .setPort(8082)
                .addHeader("Accept", "application/json")
                .build();

        RestAssured.requestSpecification = requestSpecification;
    }

    @BeforeMethod
    public void setResponseSpecification() {
        responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(SC_OK)
                .expectContentType(JSON)
                .build();

        RestAssured.responseSpecification = responseSpecification;
    }

}
