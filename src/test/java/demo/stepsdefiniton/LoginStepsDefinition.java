package demo.stepsdefiniton;

import demo.pages.Homepage;
import demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepsDefinition {
    Homepage homepage = new Homepage();
    LoginPage loginPage = new LoginPage();
    @When("User click login menu button")
    public void userClickLoginMenuButton() {
        homepage.clickLoginButton();
    }

    @Then("User is on login page")
    public void userIsOnLoginPage() {
        boolean status = loginPage.isOnLoginPage();
        Assert.assertTrue(status);
    }

    @When("User input username or email {string}")
    public void userInputUsernameOrEmail(String username) {
        loginPage.inputUsername(username);
    }

    @And("User input password {string}")
    public void userInputPassword(String password) throws InterruptedException {
        loginPage.inputPassword(password);
        Thread.sleep(3000);
    }

    @And("User click login button")
    public void userClickLoginButton() {
        loginPage.confirmLogin();
    }

    @Then("User successfully login")
    public void userSuccessfullyLogin() {
        loginPage.skipAvatar();
        Assert.assertTrue(loginPage.isOnDashboard());
    }

    @Then("User see warning message")
    public void userSeeWarningMessage() {
        Assert.assertTrue(loginPage.warningMessage());
    }
}
