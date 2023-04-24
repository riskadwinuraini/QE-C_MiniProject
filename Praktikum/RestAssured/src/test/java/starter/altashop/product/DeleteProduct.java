package starter.altashop.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProduct {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set DELETE endpoints")
    public String iSetDELETEEndpoints(){
        return url + "products/3";
    }

    @Step("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest(){
        SerenityRest.given().delete(iSetDELETEEndpoints());
    }
    @Step("I receive a valid HTTP response code {int} in products DELETE")
    public void iReceiveAValidHTTPResponseCodeOnAProductDELETE(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
