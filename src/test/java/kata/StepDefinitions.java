package kata;

// import io.cucumber.java.en.Given;
// import io.cucumber.java.en.Then;
// import io.cucumber.java.en.When;
// import io.restassured.response.Response;
// import static io.restassured.RestAssured.given;
// import static org.hamcrest.Matchers.*;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// io.restassured.module.jsv.JsonSchemaValidator.*;
import static org.hamcrest.Matchers.is;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StepDefinitions {

    private static final String BASE_URL = "https://automationintesting.online/message/";
    private Response response;
    private static final String MESSAGE_API_BASE_URL = BASE_URL + "message/";
    private static final String AUTH_API_BASE_URL = BASE_URL + "auth/";

    // Before
    @Given("the API base url is set")
    public void the_api_base_url_is_set() {
        RestAssured.baseURI = BASE_URL;
    }

    // Before
    @Given("I am authenticated")
    public void i_am_authenticated() {
        // create Token object
        // see: https://restful-booker.herokuapp.com/apidoc/index.html#api-Auth
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", "admin");
		jsonObject.put("password", "password123");

        given()
        .body(jsonObject.toString())
        .post()
    }

    // Scenario: Get all messages
    @Given("I want to count the messages received")
    public void i_want_to_count_the_messages_received() {
    }

    // Scenario: Get all messages
    @When("I count the messages")
    public void i_count_the_messages() {
    }

    // Scenario: Get all messages
    @When("there is more than one message")
    public void there_is_more_than_one_message() {
    }

    // Scenario: Get all messages
    @Then("I should have several messages")
    public void i_should_have_several_messages() {
        int messagesAmount = 7;
        RestAssured.given()
                .get("https://automationintesting.online/message/count")
                .then()
                .body("count", is(messagesAmount))
                .and()
                .log()
                .all();
    }

    //
    @Given("I want to delete a message")
    public void i_want_to_delete_a_message() {
    }

    @Given("the message ID is \\{int}")
    public void the_message_id_is() {
    }

    @When("I delete the message")
    public void i_delete_the_message() {
    }

    @Then("I should not find the message")
    public void i_should_not_find_the_message() {
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer statusCode) {
        RestAssured.given()
                .then()
                .statusCode(statusCode);
    }

    //
    @Given("I want to get a message")
    public void i_want_to_get_a_message() {
    }

    @When("I get the message")
    public void i_get_the_message() {
    }

    @Then("I receive the message")
    public void i_receive_the_message() {
    }

    //
    @Given("I want to get all messages")
    public void i_want_to_get_all_messages() {
    }

    @When("I get all messages")
    public void i_get_all_messages() {
    }

    @Then("I receive several messages")
    public void i_receive_several_messages() {
    }

    //
    @Given("I want to mark a message as read")
    public void i_want_to_mark_a_message_as_read() {
    }

    @When("I read a message")
    public void i_read_a_message() {
    }

    @When("the message hasnt been read")
    public void the_message_hasnt_been_read() {
    }

    @Then("the message status should have changed")
    public void the_message_status_should_have_changed() {
    }

    //
    @Given("I want to post a message")
    public void i_want_to_post_a_message() {
    }

    @When("I post a message")
    public void i_post_a_message() {
    }

    @Then("I should read the message")
    public void i_should_read_the_message() {
    }
}
