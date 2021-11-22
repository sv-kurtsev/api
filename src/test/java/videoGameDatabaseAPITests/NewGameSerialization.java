package videoGameDatabaseAPITests;

import dataEntity.videoGame.GameResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class NewGameSerialization extends RequestAndResponseSpecification {
    @Test
    public void videoGameSerializationJSON() {
        GameResponse gameResponse = new GameResponse(97, "2021-11-21", "New Test Game", "Perfect", 21, "Shooter");

                given()
                    .body(gameResponse)
                    .header("Content-Type", "application/json")
                .when()
                    .post("videogames")
                .then()
                        .log()
                        .all();

    }
}
