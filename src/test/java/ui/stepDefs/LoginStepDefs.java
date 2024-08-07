package ui.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.constants.URL;
import ui.driver.DriverFactory;
import ui.pageObjectsModel.LoginPO;
import static org.testng.Assert.assertEquals;

public class LoginStepDefs {
    private LoginPO loginPO;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        DriverFactory.getDriver().navigate().to(URL.Login.toString());
        loginPO = new LoginPO();
    }

    @When("I enter the username {string}")
    public void iEnterTheUsername(String username) {
        loginPO.enterUsername(username);
    }

    @And("I enter the password {string}")
    public void iEnterThePassword(String password) {
        loginPO.enterPassword(password);
    }

    @And("I click login button")
    public void iClickLoginButton(){
        loginPO.clickLoginButton();
    }

    @Then("I am directed to the dashboard")
    public void iAmDirectedToTheDashboard(){
        assertEquals(DriverFactory.getDriver().getCurrentUrl(), URL.Home.toString());
    }
}
