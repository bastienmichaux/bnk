package kata;

// import static org.junit.matchers.JUnitMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StepDefinitions {

    private Response response;

    private static final String BASE_URL = "https://automationintesting.online/";
    private static final String MESSAGE_API_BASE_URL = BASE_URL + "message/";
    private static final String AUTH_API_BASE_URL = BASE_URL + "auth/";

    // Background
    @Given("the API base url is set")
    public void the_api_base_url_is_set() {
        RestAssured.baseURI = BASE_URL;
    }

    // Background
    @Given("I am authenticated")
    public void i_am_authenticated() {
        String username = "admin";
        String password = "password123";
        AuthPayload authPayload = new AuthPayload(username, password);

        // authenticate 
        Response response = RestAssured.given()
                .body(authPayload)
                .contentType("application/json")
                .post("https://restful-booker.herokuapp.com/auth");
        String authResponse = response.getBody().asString();

        // if we receive a token, we're authenticated
        Debug.logBody(response);
        assertThat(authResponse, containsString("token"));
    }

    // Shared
    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer statusCode) {
        RestAssured.given()
                .then()
                .statusCode(statusCode);
    }

    // Scenario: Get all messages
    // endpoint: GET /
    @Given("I want to get all messages")
    public void i_want_to_get_all_messages() {
        requestSpecification = RestAssured.given();
    }

    // Scenario: Get all messages
    // endpoint: GET /
    @When("I request all messages")
    public void i_request_all_messages() {
        response = RestAssured.given()
                .get(MESSAGE_API_BASE_URL);
        int statusCode = response.getStatusCode();

        Debug.logBody(response);
        assertThat(statusCode, is(200));
    }

    // Scenario: Get all messages
    // endpoint: GET /
    @Then("I receive at least one message")
    public void i_receive_at_least_one_message() {
        String responseBody = response.getBody().asString();
        List<String> messages = response.jsonPath().getList("messages");

        Debug.logBody(response);
        assertThat(responseBody, containsString("messages"));
        assertThat(messages.size(), greaterThan(0));
    }

    // Scenario: Post a message
    // endpoint: POST /
    @Given("I want to post a message")
    public void i_want_to_post_a_message() {
    }

    // Scenario: Post a message
    // endpoint: POST /
    @When("I post a message")
    public void i_post_a_message() {
    }

    // Scenario: Post a message
    // endpoint: POST /
    @Then("I should read the message")
    public void i_should_read_the_message() {
    }

    // endpoint: GET /{id}
    // Scenario: Get a message by ID
    @Given("I want to get a message")
    public void i_want_to_get_a_message() {
    }

    // endpoint: GET /{id}
    // Scenario: Get a message by ID
    @When("I get the message")
    public void i_get_the_message() {
    }

    // endpoint: GET /{id}
    // Scenario: Get a message by ID
    @Then("I receive the message")
    public void i_receive_the_message() {
    }

    // Scenario: Mark a message as read by ID
    // endpoint: PUT /{id}/read
    @Given("I want to mark a message as read")
    public void i_want_to_mark_a_message_as_read() {
    }

    // Scenario: Mark a message as read by ID
    // endpoint: PUT /{id}/read
    @When("I read a message")
    public void i_read_a_message() {
    }

    // Scenario: Mark a message as read by ID
    // endpoint: PUT /{id}/read
    @When("the message hasnt been read")
    public void the_message_hasnt_been_read() {
    }

    // Scenario: Mark a message as read by ID
    // endpoint: PUT /{id}/read
    @Then("the message status should have changed")
    public void the_message_status_should_have_changed() {
    }

    // Scenario: Delete a message
    // endpoint: DELETE /{id}/
    @Given("I want to delete a message")
    public void i_want_to_delete_a_message() {
    }

    // Scenario: Delete a message
    // endpoint: DELETE /{id}/
    @Given("the message ID is \\{int}")
    public void the_message_id_is() {
    }

    // Scenario: Delete a message
    // endpoint: DELETE /{id}/
    @When("I delete the message")
    public void i_delete_the_message() {
    }

    // Scenario: Delete a message
    // endpoint: DELETE /{id}/
    @Then("I should not find the message")
    public void i_should_not_find_the_message() {
    }

    // Scenario: Count the messages received
    // endpoint: GET /count
    @Given("I want to count the messages received")
    public void i_want_to_count_the_messages_received() {

    }

    // Scenario: Count the messages received
    // endpoint: GET /count
    @When("I count the messages")
    public void i_count_the_messages() {
    }

    // Scenario: Count the messages received
    // endpoint: GET /count
    @When("there is more than one message")
    public void there_is_more_than_one_message() {
    }

    // Scenario: Count the messages received
    // endpoint: GET /count
    @Then("I should have several messages")
    public void i_should_have_several_messages() {
    }
}

class Debug {

    static void logBody(Response response) {
        response.getBody().prettyPrint();
    }
}
