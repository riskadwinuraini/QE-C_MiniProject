package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.AltaShop.Buy;
import starter.AltaShop.Transaction;

public class TransactionSteps {

    @Steps
    Buy buy;
    @Steps
    Transaction transaction;

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
        buy.openUrl("https://alta-shop.vercel.app/order");
//        homePage.validateOnHomePage();
    }

    @Then("I click pay button")
    public void clickPayProduct(){
        buy.ClickPayButton();
    }

    @And("I am on the transaction information page")
    public void onTransactionPage(){
//        buy.openUrl("https://alta-shop.vercel.app/order");
        transaction.validateOnTransactionPage();
    }

}
