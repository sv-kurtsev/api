package jsonPlaceHolder;

import dataEntity.jsonPlaceholderEntity.JSONPlaceholderItem;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class JSONPlaceholderTest {

    @Test
    public void jsonPlaceholder() {
        Response response = given()
                .when()
                    .get("http://jsonplaceholder.typicode.com/users");

        JSONPlaceholderItem[] jsonPlaceholderItem = response.as(JSONPlaceholderItem[].class);
        for (JSONPlaceholderItem a :
                jsonPlaceholderItem) {
            System.out.println(a.toString());
        }
    }
}
