package starter.altashop.ProductsCategory;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProductCategory {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the DELETE api endpoints")
    public String iSetTheDELETEApiEndpoints(){
        return url + "categories/1";
    }
    @Step("I send HTTP api DELETE request for category")
    public void iSendHTTPApiDELETERequestForCategory(){
        SerenityRest.given().delete(iSetTheDELETEApiEndpoints());
    }
    @Step("I receive valid HTTP response code 200 for category DELETE")
    public void iReceiveValidHTTPResponseCodeForCategoryDELETE(){
        restAssuredThat(response -> response.statusCode(200));

    }
}
