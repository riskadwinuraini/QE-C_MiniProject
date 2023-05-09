package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.AltaShop.Detail;
import starter.AltaShop.DetailPage;

public class DetailSteps {

    @Steps
    Detail detail;
    @Steps
    DetailPage detailPage;

    @When("I click detail button Sony PS5")
    public void clickDetailProduct(){
        detail.ClickDetail1Button();
    }

    @Then("I can see product detail")
    public void goToDetailPage(){
//        register.openUrl("https://alta-shop.vercel.app/auth/login");
        detailPage.validateOnDetailPage();
    }
}
