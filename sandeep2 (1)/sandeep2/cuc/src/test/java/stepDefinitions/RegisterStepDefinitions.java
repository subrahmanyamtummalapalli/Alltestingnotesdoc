package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RegisterStepDefinitions {

    @Given("User is on the registration page")
    public void user_is_on_the_registration_page() {
        // Navigate to the registration page
    }

    @When("User enters valid username and email and password")
    public void user_enters_valid_username_and_email_and_password() {
        // Enter valid username, email, and password
    }

    @And("User clicks the register button")
    public void user_clicks_the_register_button() {
        // Click the register button
    }

    @Then("User should be registered successfully")
    public void user_should_be_registered_successfully() {
        // Validate registration success
    }
}

