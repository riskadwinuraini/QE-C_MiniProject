package starter.stepdefinition;
import io.appium.java_client.MobileBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.pages.LoginScreen;

public class LoginSteps {
    LoginScreen loginScreen = new LoginScreen();

    @Given("user on login page")
    public void androidUserOnLandingScreen() throws  InterruptedException{
        loginScreen.tapLoginLink();
        boolean actual = loginScreen.OnLoginPage();
        Assert.assertTrue(actual);
    }

    @When("user input valid username")
    public void androidUserInputUnregisteredEmail() {
        String email = "teko@email.com";
        loginScreen.inputEmail(email);
    }
    @And("user input invalid password")
    public void androidUserInputPassword() {
        loginScreen.inputPassword("password");
    }

    @And("user click login button")
    public void androidUserTapLoginButton() {
        loginScreen.tapLoginButton();
    }

    @Then("user see error message Wrong Email or Password")
    public void androidUserSeeMessage() throws InterruptedException{
        loginScreen.getToastMessage();
        Thread.sleep(2000);
    }

    // EMPTY BOXES LOGIN //
    @When("user didnt fill email")
    public void usernotFillEmail(){
        String email = "";
        loginScreen.inputEmail(email);
    }
    @And("user didnt fill password")
    public void usernotFillPass(){
        loginScreen.inputPassword("");
    }
    @Then("user see notification below boxes")
    public void getNotification()throws InterruptedException{
        loginScreen.notifBlankBox();
        Thread.sleep(2000);
    }

    // INVALID EMAIL AND PASSWORD //
    @When("user input invalid username")
    public void  invalidUsername(){
        loginScreen.inputEmail("elisa@mail.com");
    }

    // VALID EMAIL AND PASSWORD //
    @And("user input valid password")
    public void inputValidPass(){
        loginScreen.inputPassword("123123");
    }
    @Then("i got into dashboard again")
    public void getinDashBoard()throws  InterruptedException{
        loginScreen.onHomePage();
        Thread.sleep(2000);
    }
}
