import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestApi {

    @Test
    public void testGet() {
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("https://postman-echo.com/get")
                .then()
                .statusCode(200)

                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))

                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.accept", equalTo("*/*"))

                .body("url", containsString("foo1=bar1"))
                .body("url", containsString("foo2=bar2"));


    }

    @Test
    public void testPost() {
        String body = "{ \"test\": \"value\" }";
        given()
                .header("Content-Type", "text/plain")
                .body(body)
                .when()
                .post("https://postman-echo.com/post")
                .then()
                .statusCode(200)
                .body("data", containsString("value"));


    }

    @Test
    public void testPostFromData() {
        given()
                .multiPart("foo1", "bar1")
                .multiPart("foo2", "bar2")
                .when()
                .post("https://postman-echo.com/post")
                .then()
                .statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }

    @Test
    public void testPut() {
        String body = "This is expected to be sent back as part of response body.";
        given()
                .header("Content-Type", "text/plain")
                .body(body)
                .when()
                .put("https://postman-echo.com/put")
                .then()
                .statusCode(200)
                .body("data", equalTo(body));
    }

    @Test
    public void testPatch() {
        String body = "This is expected to be sent back as part of response body.";
        given()
                .header("Content-Type", "text/plain")
                .body(body)
                .when()
                .patch("https://postman-echo.com/patch")
                .then()
                .statusCode(200)
                .body("data", equalTo(body));
    }

    @Test
    public void testDelete() {
        String body = "This is expected to be sent back as part of response body.";
        given()
                .header("Content-Type", "text/plain")
                .body(body)
                .when()
                .delete("https://postman-echo.com/delete")
                .then()
                .statusCode(200)
                .body("data", equalTo(body));
    }
}
