package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.AltaShop.Category;
import starter.AltaShop.Home;

public class CategorySteps {
    @Steps
    Home home;
    @Steps
    Category category;
    @When("I click select category")
    public void clickSelectCategoryButton(){
        category.ClickSelectCategoryButton();
    }

    @And("I click category Furniture")
    public void clickCategoryProduct(){
        category.ClickCategoryButton();
    }

    @Then("I can see product category message {string}")
    public void iCanSeeProductCategoryMessage(String message) {
        category.validateMessageDisplayed();
        category.validateEqualMessage(message);}
    @And("I click clear button")
    public void clickClearProduct(){
        category.ClickClearButton();
    }

    @And("I go to home page")
    public void gotoHomePage(){
        home.validateOnTheHomePage();
    }
}
