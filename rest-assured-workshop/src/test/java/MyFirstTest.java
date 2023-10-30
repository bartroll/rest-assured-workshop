import org.junit.Test;

import static io.restassured.RestAssured.*;

public class MyFirstTest {

    @Test
    public void myFirstTest() {
        given()
                .log().all()
        .when()
                .get("https://reqres.in/api/users")
        .then()
                .log().all();

    }
}
