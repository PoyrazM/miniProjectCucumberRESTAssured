package TestSteps;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.is;

public class BDDStyledMethod {

    public static void SimpleGETPost(String postNumber){
        given()
                .contentType(ContentType.JSON).
        when()
                .get(String.format("http://localhost:3000/posts/%s",postNumber)).
        then()
                .body("character", is("Anakin Skywalker"))
                .statusCode(200)
                .log().all();
    }



}
