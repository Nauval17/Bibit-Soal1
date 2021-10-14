package demo.stepsdefiniton;

import demo.pages.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GeneralStepsDef {
    Homepage homepage = new Homepage();

    @Given("User open website {string}")
    public void userOpenWebsite(String url) {
        homepage.openPage(url);
    }

    @When("User is at homepage")
    public void userIsAtHomepage() {
        Assert.assertTrue(homepage.isOnPage());
    }

    @Then("User see all menu available on the homepage")
    public void userSeeAllMenuAvailableOnTheHomepage() {
        Assert.assertTrue(homepage.topMenu());
    }
}
