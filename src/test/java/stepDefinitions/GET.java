package stepDefinitions;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class GET {
    @Given("the client makes GET request")
    public void the_client_makes_get_request() {

        JsonPath jp = given()
                .queryParam("apiKey", "a9f54578")
                .queryParam("t", "Street Fight").

                        when()
                .get().prettyPeek().  // our request URL is already complete , do not need to add anything here
                then()
                .statusCode(is(200))
                .contentType(ContentType.JSON)
                .body("Title", is("Street Fight"))
                .extract().jsonPath();

//        MoviePojo hannibalInfo = jp.getObject("", MoviePojo.class);
//        System.out.println(hannibalInfo);

        String hannibalInfo = jp.getString("");
        System.out.println(hannibalInfo);

        String title = jp.getString("Title");
        System.out.println(title);


    }


    @Given("the client should receive an HTTP {int} response code")
    public void the_client_should_receive_an_http_response_code(Integer int1) {

    }
    @Given("the client should receive an jsonPath Title equal to {string}")
    public void the_client_should_receive_an_json_path_title_equal_to(String string) {


    }
    @Given("the client should receive an jsonPath Year equal to {string}")
    public void the_client_should_receive_an_json_path_year_equal_to(String string) {


    }
    @Given("the client should receive an jsonPath Released equal to {string}")
    public void the_client_should_receive_an_json_path_released_equal_to(String string) {


    }
    @Given("the client should receive an jsonPath Genre equal to {string}")
    public void the_client_should_receive_an_json_path_genre_equal_to(String string) {


    }
}
