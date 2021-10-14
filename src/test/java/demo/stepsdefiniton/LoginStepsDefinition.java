package demo.stepsdefiniton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefinition {
    @When("User click login menu button")
    public void userClickLoginMenuButton() {
    }

    @Then("User is on login page")
    public void userIsOnLoginPage() {
    }

    @When("User input username or email {string}")
    public void userInputUsernameOrEmail(String username) {
    }

    @And("User input password {string}")
    public void userInputPassword(String password) {
    }

    @And("User click login button")
    public void userClickLoginButton() {
    }

    @Then("User successfully login")
    public void userSuccessfullyLogin() {
    }
}
