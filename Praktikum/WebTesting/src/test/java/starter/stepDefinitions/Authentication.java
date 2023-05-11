package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.AltaShop.Home;
import starter.AltaShop.Login;
import starter.AltaShop.Register;

public class Authentication {
    @Steps
    Login login;
    @Steps
    Home home;

    @Steps
    Register register;

    @Given("me on the register page")
    public void onRegisterPage(){
        register.openUrl("https://alta-shop.vercel.app/auth/register");
        register.validateOnRegisterPage();
    }
    @When("I enter a full name {string}")
    public void enterFullname(String fullname){
        register.inputFullName(fullname);
    }
    @And("I entered a email {string}")
    public void enterEmail(String email){
        register.inputEmail(email);
    }
    @And("I entered a password {string}")
    public void enterPassword(String password){
        register.inputPassword(password);
    }
    @And("I click the register button")
    public void clickRegisterButton(){
        register.ClickRegisterButton();
    }
    @Then("I'm on the login page")
    public void iMOnTheLoginPage() { register.openUrl("https://alta-shop.vercel.app/auth/login");

    }

    @Then("I can see error message")
    public void iCanSeeErrorMessage() {
    }


    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.validateOnLoginPage();
    }

    @When("I enter email {string}")
    public void iEnterEmail(String email) {
        login.inputEmail(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        login.inputPassword(password);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        login.ClickLoginButton();
    }

    @Then("I am on the home page")
    public void iAmOnTheHomePage() {
        login.openUrl("https://alta-shop.vercel.app");
    }

    
}
