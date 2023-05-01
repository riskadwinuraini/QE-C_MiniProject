package starter.altashop.orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllOrder {

    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoint for order")
    public String iSetTheGETApiEndpointForOrder(){
        return url + "orders";
    }
    @Step("I send HTTP api GET request for order")
    public void iSendHTTPApiGETRequestForOrder(){
        SerenityRest.given()
                .when()
                .get(iSetTheGETApiEndpointForOrder());
    }
    @Step("I receive valid HTTP response code 200 for get all data order")
    public void iReceiveValidHTTPResponseCodeForGetAllDataOrder(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for all order")
    public void iReceivedValidDataForAllOrder(){
    }
}
