package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.altashop.orders.GetAllOrder;
import starter.altashop.orders.GetIdOrder;
import starter.altashop.orders.PostOrder;

public class OrderSteps {

    @Steps
    PostOrder postOrder;
    @Steps
    GetAllOrder getAllOrder;
    @Steps
    GetIdOrder getIdOrder;

    @Given("I set the GET api endpoint for order")
    public void iSetTheGETApiEndpointForOrder() { getAllOrder.iSetTheGETApiEndpointForOrder();

    }

    @When("I send HTTP api GET request for order")
    public void iSendHTTPApiGETRequestForOrder() { getAllOrder.iSendHTTPApiGETRequestForOrder();

    }

    @Then("I receive valid HTTP response code {int} for get all data order")
    public void iReceiveValidHTTPResponseCodeForGetAllDataOrder(int arg0) { getAllOrder.iReceiveValidHTTPResponseCodeForGetAllDataOrder();

    }

    @And("I received valid data for all order")
    public void iReceivedValidDataForAllOrder() { getAllOrder.iReceivedValidDataForAllOrder();

    }

    @Given("I set the POST api endpoints in order")
    public void iSetThePOSTApiEndpointsInOrder() { postOrder.iSetThePOSTApiEndpointsInOrder();
        
    }

    @When("I send HTTP api POST request for order")
    public void iSendHTTPApiPOSTRequestForOrder() { postOrder.iSendHTTPApiPOSTRequestForOrder();
        
    }

    @Then("I receive a valid HTTP response code {int} on the order POST")
    public void iReceiveAValidHTTPResponseCodeOnTheOrderPOST(int arg0) { postOrder.iReceiveAValidHTTPResponseCodeOnTheOrderPOST();
        
    }

    @And("I receive valid data for create new order")
    public void iReceiveValidDataForCreateNewOrder() { postOrder.iReceiveValidDataForCreateNewOrder();
        
    }

    @Given("I set the GET api endpoint for order by id")
    public void iSetTheGETApiEndpointForOrderById() {
        getIdOrder.iSetTheGETApiEndpointForOrderById();
    }

    @When("I send HTTP api GET request for order by id")
    public void iSendHTTPApiGETRequestForOrderById() {
        getIdOrder.iSendHTTPApiGETRequestForOrderById();
    }

    @Then("I receive valid HTTP response code {int} for get id data order")
    public void iReceiveValidHTTPResponseCodeForGetIdDataOrder(int arg0) {
        getIdOrder.iReceiveValidHTTPResponseCodeForGetIdDataOrder();
    }

    @And("I receive valid data for id order")
    public void iReceiveValidDataForIdOrder() {
        getIdOrder.iReceiveValidDataForIdOrder();
    }
}
