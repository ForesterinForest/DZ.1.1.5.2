package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;



public class PostmanEchoTest {
    @Test
    public void shouldPostRawTextTest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Hi")
                .when().log().all()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data",org.hamcrest.Matchers.equalTo("no Hi"));
    }
}
