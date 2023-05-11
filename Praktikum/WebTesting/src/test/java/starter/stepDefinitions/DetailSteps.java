package starter.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.AltaShop.Detail;
import starter.AltaShop.DetailPage;

public class DetailSteps {

    @Steps
    Detail detail;
    @Steps
    DetailPage detailpage;
    @When("I click detail button Sony PS{int}")
    public void iClickDetailButtonSonyPS(int arg0) {
        detail.ClickDetail1Button();
    }

    @Then("I can see product detail")
    public void iCanSeeProductDetail() {
        detailpage.validateOnDetailPage();
    }
}
