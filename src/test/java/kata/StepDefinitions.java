package kata;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import io.restassured.http.ContentType;

public class StepDefinitions {

    private final String BASE_URI = "https://automationintesting.online/message/";

    private RequestSpecification request = null;
    private Response rawResponse = null;
    private ValidatableResponse response = null;
    private JSONObject payload = null;

    @Given("I want to count all available messages")
    public void i_want_to_count_all_available_messages() {
        RestAssured.baseURI  = BASE_URI;
    }

    @When("I count all the messages")
    public void i_count_all_the_messages() {
        request = RestAssured.given();
        rawResponse = request.get();
    }

    @Then("I receive the correct amount of messages")
    public void i_receive_the_correct_amount_of_messages() {
        response = rawResponse.then();
        rawResponse.prettyPrint();
    }

    @And("the HTTP status line is {string}")
    public void the_http_status_line_is(String line) {
        response.statusLine("HTTP/1.1 200 OK");
    }

    @And("the HTTP response status is {int}")
    public void the_http_response_status_is(Integer status) {
        response.statusCode(200);
    }

    /*************************************************************************/

    @Given("I want to send a message to the reception")
    public void i_want_to_send_a_message_to_the_reception() {
        // declare POST body
        RestAssured.baseURI = "https://automationintesting.online/message/";
        payload = new JSONObject();
        payload.put("name", "Some Name");
        payload.put("subject", "my subject");
    }

    @And("my email is a valid email")
    public void my_email_is_a_valid_email() {
        payload.put("email", "valid@email.com");
    }

    @And("my phone number is valid")
    public void my_phone_number_is_valid() {
        payload.put("phone", ("00" + "23456789012"));
    }

    @And("my message is valid")
    public void my_message_is_valid() {
        payload.put("description", "my description is longer than 20 characters 2");
    }

    @When("I send the message")
    public void i_send_the_message() {
        // specify POST request
        request = RestAssured.given();
        request.contentType(ContentType.JSON);
        request.body(payload.toString());

        // execute POST request
        rawResponse = request.post();
        rawResponse.prettyPrint();
    }

    @Then("the reception should have received the message")
    public void the_reception_should_have_received_the_message() {
        response = rawResponse.then();
        rawResponse.prettyPrint();
        response.statusCode(201);
    }

    /*************************************************************************/
}
