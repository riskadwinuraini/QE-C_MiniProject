package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.altashop.product.*;

public class ProductSteps {
    @Steps
    GetAllProduct getAllProduct;
    @Steps
    GetIdProduct getIdProduct;
    @Steps
    DeleteProduct deleteProduct;
    @Steps
    PostProduct postProduct;

    @Steps
    GetProductRating getProductRating;
    @Steps
    GetProductComment getProductComment;
    @Steps
    PostProductRating postProductRating;
    @Steps
    PostProductComment postProductComment;

    @Given("I set GET endpoints")
    public void iSetGETEndpoints() {
        getAllProduct.GetApiEndpoint();
    }
    @When("I send GET HTTP request")
    public void iSendGETHTTPRequest() {
        getAllProduct.GetHttpRequest();
    }
    @Then("I receive valid HTTP response code {int}")
    public void iReceiveValidHTTPResponseCode(int arg0) {
        getAllProduct.validateHttpResponseCode200();
    }
    @And("I received valid data for all products")
    public void iReceivedValidDataForAllProducts() {
        getAllProduct.validateDataDetailProduct();
    }

    @Given("I set GET endpoints by id")
    public void iSetGETEndpointsById() {
        getIdProduct.iSetGETEndpointsById();
    }

    @When("I send GET HTTP request by id")
    public void iSendGETHTTPRequestById() {
        getIdProduct.iSendGETHTTPRequestById();
    }

    @Then("I receive a valid HTTP response code {int} for Get id data products")
    public void iReceiveAValidHTTPResponseCodeForGetIdDataProducts(int arg0) { getIdProduct.iReceiveAValidHTTPResponseCodeForGetIdDataProducts();

    }
    @And("I receive valid data for id products")
    public void iReceiveValidDataForIdProducts() {
        getIdProduct.iReceiveValidDataForIdProducts();
    }

    @Given("I set DELETE endpoints")
    public void iSetDELETEEndpoints() { deleteProduct.iSetDELETEEndpoints();
    }

    @When("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest() { deleteProduct.iSendDELETEHTTPRequest();
    }

    @Then("I receive a valid HTTP response code {int} in products DELETE")
    public void iReceiveAValidHTTPResponseCodeOnAProductDELETE(int arg0) { deleteProduct.iReceiveAValidHTTPResponseCodeOnAProductDELETE();
    }

    @Given("I set POST endpoints")
    public void iSetPOSTEndpoints() { postProduct.iSetPOSTEndpoints();
    }

    @When("I send POST HTTP request")
    public void iSendPOSTHTTPRequest() { postProduct.iSendPOSTHTTPRequest();
        
    }

    @Then("I receive a valid HTTP response code {int} in products POST")
    public void iReceiveAValidHTTPResponseCodeInProductsPOST(int arg0) { postProduct.iReceiveAValidHTTPResponseCodeInProductsPOST();
        
    }

    @And("I receive valid data for new product")
    public void iReceiveValidDataForNewUser() { postProduct.iReceiveValidDataForNewProduct();

    }

    @Given("I set GET endpoints by rating")
    public void iSetGETEndpointsByRating() { getProductRating.iSetGETEndpointsByRating();
        
    }

    @When("I send GET HTTP request by rating")
    public void iSendGETHTTPRequestByRating() { getProductRating.iSendGETHTTPRequestByRating();
        
    }

    @Then("I receive valid HTTP response code {int} for Get rating data products")
    public void iReceiveValidHTTPResponseCodeForGetRatingDataProducts(int arg0) { getProductRating.iReceiveValidHTTPResponseCodeForGetRatingDataProducts();
        
    }

    @And("I receive valid data for rating products")
    public void iReceiveValidDataForRatingProducts() { getProductRating.iReceiveValidDataForRatingProducts();
        
    }

    @Given("I set GET endpoints by comment")
    public void iSetGETEndpointsByComment() { getProductComment.iSetGETEndpointsByComment();
        
    }

    @When("I send GET HTTP request by comment")
    public void iSendGETHTTPRequestByComment() { getProductComment.iSendGETHTTPRequestByComment();


    }

    @Then("I receive valid HTTP response code {int} for Get comment data products")
    public void iReceiveValidHTTPResponseCodeForGetCommentDataProducts(int arg0) { getProductComment.iReceiveValidHTTPResponseCodeForGetCommentDataProducts();
        
    }

    @And("I receive valid data for comment products")
    public void iReceiveValidDataForCommentProducts() { getProductComment.iReceiveValidDataForCommentProducts();
    }

    @Given("I set POST endpoints by rating")
    public void iSetPOSTEndpointsByRating() { postProductRating.iSetPOSTEndpointsByRating();
    }

    @When("I send POST HTTP request by rating")
    public void iSendPOSTHTTPRequestByRating() { postProductRating.iSendPOSTHTTPRequestByRating();
        
    }

    @Then("I receive valid HTTP response code {int} in products rating POST")
    public void iReceiveValidHTTPResponseCodeInProductsRatingPOST(int arg0) { postProductRating.iReceiveValidHTTPResponseCodeInProductsRatingPOST();
        
    }

    @And("I receive valid data for assign product rating")
    public void iReceiveValidDataForAssignProductRating() { postProductRating.iReceiveValidDataForAssignProductRating();
    }

    @Given("I set POST endpoints by comment")
    public void iSetPOSTEndpointsByComment() { postProductComment.iSetPOSTEndpointsByComment();

    }

    @When("I send POST HTTP request by comment")
    public void iSendPOSTHTTPRequestByComment() { postProductComment.iSendPOSTHTTPRequestByComment();


    }

    @Then("I receive valid HTTP response code {int} in products comment POST")
    public void iReceiveValidHTTPResponseCodeInProductsCommentPOST(int arg0) { postProductComment.iReceiveValidHTTPResponseCodeInProductsCommentPOST();

    }

    @And("I receive valid data for new comment")
    public void iReceiveValidDataForNewComment() { postProductComment.iReceiveValidDataForNewComment();
    }


}
