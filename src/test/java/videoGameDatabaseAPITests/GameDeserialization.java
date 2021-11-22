package videoGameDatabaseAPITests;

import dataEntity.videoGame.GameResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GameDeserialization extends RequestAndResponseSpecification {

    @Test
    public void gameDesiarilization() {
        Response response = given()
                .when()
                    .get("videogames/1");

        GameResponse gameResponse = response.as(GameResponse.class);
        System.out.println(gameResponse.toString());
    }

}
