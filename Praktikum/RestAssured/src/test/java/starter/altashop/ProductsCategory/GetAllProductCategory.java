package starter.altashop.ProductsCategory;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProductCategory {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoints")
    public String iSetTheGETApiEndpoint(){
        return url + "categories";
    }
    @Step("I send HTTP api GET request")
    public void iSendHTTPApiGETRequest() {
        SerenityRest.given()
                .when()
                .get(iSetTheGETApiEndpoint());
    }
    @Step("I receive a valid HTTP response code 200 for GET All product category")
    public void iReceiveAValidHTTPResponseCodeForGetAllProductCategory(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for all product category")
    public void iReceiveValidDataForAllProductCategory(){
    }

}
