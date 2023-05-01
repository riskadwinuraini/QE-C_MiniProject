package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;
    @Steps
    HomePage homePage;
    @Given("I am on the login page")
    public void onTheLoginPage(){
        loginPage.openPage();
        loginPage.validateOnTheLoginPage();
    }
    @And("I enter valid Email")
    public void doEnterValidEmail(){loginPage.inputEmail("riskadwi583@gmaill.com");}
    @And("I enter valid Password")
    public void doEnterValidPassword(){
        loginPage.inputPassword("Riskaya123");
    }
    @And("I click the enter login")
    public void doClickLoginButton(){loginPage.clickButtonLogin();}
    @Then("I am on the home page")
    public void onTheHomePage(){
        homePage.validateOnHomePage();
    }
}
