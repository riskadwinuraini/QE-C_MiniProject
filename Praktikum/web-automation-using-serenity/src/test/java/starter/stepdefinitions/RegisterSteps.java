package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.RegisterPage;

public class RegisterSteps {

    @Steps
    RegisterPage registerPage;
    @Steps
    LoginPage loginPage;


    @Given("I am on the register page")
    public void iAmOnTheRegisterPage() {
        registerPage.openPage();
        registerPage.validateOnRegisterPage();
    }

    @When("I input valid Nama Lengkap")
    public void iInputValidNamaLengkap() {
        registerPage.inputNama("Riska Dwi Nur Aini");
    }

    @When("I input valid Email")
    public void iInputValidEmail() {
        registerPage.inputEmail("riskadwi583@gmail.com");
    }

    @When("I input valid Password")
    public void iInputValidPassword() {
        registerPage.inputPassword("Riskaya123");
    }
    @And("I click register button")
    public void iClickRegisterButton() {
        registerPage.clickRegisterButton();
    }

    @Then("I am on the Login Page")
    public void iAmOnTheLoginPage() {
        loginPage.validateOnTheLoginPage();
    }
}
