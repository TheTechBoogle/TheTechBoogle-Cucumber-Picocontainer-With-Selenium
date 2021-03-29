package steps;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class LoginSteps {

    DriverFactory driverFactory;
    LoginPage loginPage;

    public LoginSteps(DriverFactory driverFactory){
        this.driverFactory = driverFactory;
    }

    @Given("That I navigate to the web login page.")
    public void thatINavigateToTheWebLoginPage() {
        loginPage = new LoginPage(driverFactory.driver);
        loginPage.goToLoginPage();
    }

    @When("I enter a correct ([^\"]*) and correct ([^\"]*).")
    public void iEnterACorrectUsernameAndCorrectPassword(String username, String password) {
        loginPage.enterAUsernameAndPassword(username, password);
    }




    @Then("I should see the welcome page.")
    public void iShouldSeeTheWelcomePage() {
        LoginPage.GetMessageText getText = loginPage.getMessageText();
        Assert.assertEquals("  ", getText.getMessageText());
    }


}
