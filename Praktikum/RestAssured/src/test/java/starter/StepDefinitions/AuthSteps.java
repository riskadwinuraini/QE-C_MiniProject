package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.altashop.authentication.Login;
import starter.altashop.authentication.Register;
import starter.altashop.authentication.getUserInformation;

public class AuthSteps {
    @Steps
    getUserInformation getUserInformation;
    @Steps
    Login login;
    @Steps
    Register register;

    @Given("I set GET user api endpoints")
    public void iSetGETUserApiEndpoints() {
        getUserInformation.iSetGETUserApiEndpoints();
    }

    @When("I send a GET request to the user API endpoints")
    public void iSendAGETRequestToTheUserAPIEndpoints() {
        getUserInformation.iSendAGETRequestToTheUserAPIEndpoints();
    }

    @Then("I receive valid HTTP response code {int} for get user information")
    public void iReceiveValidHTTPResponseCodeForGetUserInformation(int arg0) {
        getUserInformation.iReceiveValidHTTPResponseCodeForGetUserInformation();
    }

    @And("I receive valid data of the user")
    public void iReceiveValidDataOfTheUser() {
        getUserInformation.iReceiveValidDataOfTheUser();
    }

    @Given("I have valid credentials")
    public void iHaveValidCredentials() {
       login.iHaveValidCredentials();
    }

    @When("I submit a POST request to {string} with email {string} and password {string}")
    public void iSubmitAPOSTRequestToWithEmailAndPassword(String arg0, String arg1, String arg2) {
        login.iSubmitAPOSTRequestToWithEmailAndPassword();
    }

    @Then("I receive valid HTTP response code Login {int}")
    public void iReceiveValidHTTPResponseCodeLogin(int arg0) {
        login.iShouldGetAResponseCode();
    }

    @Given("I register using the correct data")
    public void iRegisterUsingTheCorrectData() {
        register.RegisterUsingTheCorrectData();
    }

    @When("I submit a POST request to {string} with fullname {string}, email {string} and password {string}")
    public void iSubmitAPOSTRequestToWithFullnameEmailAndPassword(String arg0, String arg1, String arg2, String arg3) {
        register.POSTRequestToWithFullnameEmailAndPassword();
    }

    @Then("I receive valid HTTP response code register {int}")
    public void iReceiveValidHTTPResponseCodeRegister(int arg0) {
        register.ValidHTTPResponseCodeRegister();
    }

    @And("register successfully")
    public void registerSuccessfully() {
        register.registerSuccessfully();
    }
}
