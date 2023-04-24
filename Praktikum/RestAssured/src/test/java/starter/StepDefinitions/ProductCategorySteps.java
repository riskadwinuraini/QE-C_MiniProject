package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.altashop.ProductsCategory.DeleteProductCategory;
import starter.altashop.ProductsCategory.GetAllProductCategory;
import starter.altashop.ProductsCategory.GetIdProductCategory;
import starter.altashop.ProductsCategory.PostProductcategory;

public class ProductCategorySteps {
    @Steps
    GetAllProductCategory getAllProductCategory;
    @Steps
    GetIdProductCategory getIdProductCategory;

    @Steps
    PostProductcategory postProductcategory;
    @Steps
    DeleteProductCategory deleteProductCategory;

    @Given("I set the GET api endpoints")
    public void iSetTheGETApiEndpoint() { getAllProductCategory.iSetTheGETApiEndpoint();

    }

    @When("I send HTTP api GET request")
    public void iSendHTTPApiGETRequest() { getAllProductCategory.iSendHTTPApiGETRequest();

    }

    @Then("I receive valid HTTP response code {int} for GET All product category")
    public void iReceiveAValidHTTPResponseCodeForGetAllProductCategory(int arg0) { getAllProductCategory.iReceiveAValidHTTPResponseCodeForGetAllProductCategory();

    }

    @And("I received valid data for all product category")
    public void iReceiveValidDataForAllProductCategory() { getAllProductCategory.iReceiveValidDataForAllProductCategory();

    }

    @Given("I set the GET api endpoints by id")
    public void iSetTheGETApiEndpointsById() { getIdProductCategory.iSetTheGETApiEndpointsById();

    }

    @When("I send HTTP api GET request by id")
    public void iSendHTTPApiGETRequestById() { getIdProductCategory.iSendHTTPApiGETRequestById();

    }

    @Then("I receive valid HTTP response code {int} for GET id product category")
    public void iReceiveValidHTTPResponseCodeForGETIdProductCategory(int arg0) { getIdProductCategory.iReceiveValidHTTPResponseCodeForGETIdProductCategory();

    }

    @And("I received valid data for id product category")
    public void iReceivedValidDataForIdProductCategory() { getIdProductCategory.iReceivedValidDataForIdProductCategory();
    }

    @Given("I set the POST api endpoints in category")
    public void iSetThePOSTApiEndpointsInCategory() { postProductcategory.iSetThePOSTApiEndpointsInCategory();


    }

    @When("I send HTTP api POST request")
    public void iSendHTTPApiPOSTRequest() { postProductcategory.iSendHTTPApiPOSTRequest();

    }

    @Then("I receive valid HTTP response code {int} in product category")
    public void iReceiveValidHTTPResponseCodeInProductCategory(int arg0) { postProductcategory.iReceiveValidHTTPResponseCodeInProductCategory();

    }

    @And("I receive valid data for new product category")
    public void iReceiveValidDataForNewProductCategory() { postProductcategory.iReceiveValidDataForNewProductCategory();
    }

    @Given("I set the DELETE api endpoints")
    public void iSetTheDELETEApiEndpoints() { deleteProductCategory.iSetTheDELETEApiEndpoints();


    }

    @When("I send HTTP api DELETE request for category")
    public void iSendHTTPApiDELETERequestForCategory() { deleteProductCategory.iSendHTTPApiDELETERequestForCategory();

    }

    @Then("I receive valid HTTP response code {int} for category DELETE")
    public void iReceiveValidHTTPResponseCodeForCategoryDELETE(int arg0) { deleteProductCategory.iReceiveValidHTTPResponseCodeForCategoryDELETE();
    }
}
