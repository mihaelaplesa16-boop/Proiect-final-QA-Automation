package api;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiTest {

    @Test
    public void getUsersTest() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        int statusCode =
                given()
                        .when()
                        .get("/users")
                        .getStatusCode();

        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void createPostTest() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        String requestBody = """
            {
                "title": "QA Project",
                "body": "Hello!",
                "userId": 1
            }
            """;

        int statusCode =
                given()
                        .header("Content-type", "application/json")
                        .body(requestBody)
                        .when()
                        .post("/posts")
                        .getStatusCode();

        Assert.assertEquals(statusCode, 201);
    }

    @Test
    public void deletePostTest() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        int statusCode =
                given()
                        .when()
                        .delete("/posts/1")
                        .getStatusCode();

        Assert.assertEquals(statusCode, 200);
    }
}