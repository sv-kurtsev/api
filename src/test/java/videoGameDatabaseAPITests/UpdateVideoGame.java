package videoGameDatabaseAPITests;

import dataEntity.videoGame.GameResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateVideoGame extends RequestAndResponseSpecification {
    @Test
    public void updateGame() {
        Response response = given()
                            .when()
                                .get("videogames/2");
        GameResponse gameResponse = response.as(GameResponse.class);

        GameResponse updateGame = new GameResponse(gameResponse.getReviewScore(), gameResponse.getReleaseDate(), "Updated Test Game", gameResponse.getRating(), gameResponse.getId(), "Updated category");
                given()
                    .body(updateGame)
                    .header("Content-Type", "application/json")
                .when()
                    .put("videogames/2")
                .then()
                    .log()
                    .all();

    }


}
