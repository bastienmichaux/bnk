package kata;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @Given("today is Friday")
    public void today_is_friday() {
    }

    @Given("today is Sunday")
    public void today_is_sunday() {
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_its_friday_yet() {
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
    }
}
