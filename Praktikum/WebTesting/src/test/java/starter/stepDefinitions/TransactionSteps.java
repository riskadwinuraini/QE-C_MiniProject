package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.AltaShop.Buy;
import starter.AltaShop.Home;
import starter.AltaShop.transactionPage;

public class TransactionSteps {

    @Steps
    Buy buy;
    @Steps
    transactionPage TransactionPage;
    @Steps
    Home home;
    @When("I click buy button product")
    public void clickBuyProduct(){
        buy.ClickBuyButton();
    }

    @And("I click cart button")
    public void clickCartProduct(){
        buy.ClickCartButton();
    }

    @Then("I am on the your cart page")
    public void onCartPage(){
       home.validateOnTheHomePage();
    }

    @Then("I click pay button")
    public void clickPayProduct(){
        buy.ClickPayButton();
    }

    @And("I am on the transaction information page")
    public void onTransactionPage(){

        TransactionPage.validateOnTransactionPage();
    }
}
