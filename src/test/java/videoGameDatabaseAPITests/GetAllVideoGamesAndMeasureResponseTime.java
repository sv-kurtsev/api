package videoGameDatabaseAPITests;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetAllVideoGamesAndMeasureResponseTime extends RequestAndResponseSpecification {

    @Test
    public void getAllVideoGames() {

        Response response =
                given()
                        .when()
                        .get("/videogames");
        long responseTime = response.time();
        System.out.println("Response time is " + responseTime);

        response.then()
                .log()
                .all();
    }
}
