package starter.altashop.ProductsCategory;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetIdProductCategory {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoints by id")
    public String iSetTheGETApiEndpointsById(){
        return url + "categories/29377";
    }
    @Step("I send HTTP api GET request by id")
    public void iSendHTTPApiGETRequestById(){
        SerenityRest.given()
                .when()
                .get(iSetTheGETApiEndpointsById());
    }
    @Step("I receive valid HTTP response code 200 for GET id product category")
    public void iReceiveValidHTTPResponseCodeForGETIdProductCategory(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for id product category")
    public void iReceivedValidDataForIdProductCategory(){

    }
}
