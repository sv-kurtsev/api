package videoGameDatabaseAPITests;

import dataEntity.videoGame.GameResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateVideoGame extends RequestAndResponseSpecification {
    @Test
    public void updateGame() {
        GameResponse gameResponse = new GameResponse(78, "2021-11-07", "Updated Test Game", "Perfect", 4, "Shooter");
                given()
                    .body(gameResponse)
                    .header("Content-Type", "application/json")
                .when()
                    .put("videogames/4")
                .then()
                    .log()
                    .all();

    }


}
