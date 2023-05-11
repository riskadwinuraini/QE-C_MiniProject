package starter.altashop.orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllOrder {

    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoint for order")
    public String iSetTheGETApiEndpointForOrder(){
        return url + "orders";
    }
    @Step("I send HTTP api GET request for order")
    public void iSendHTTPApiGETRequestForOrder(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IlJpc2theWEiLCJFbWFpbCI6InJpc2thZHdpNjY2QGdtYWlsLmNvbSJ9.1B3znF3ZyrJINDUI1zNLD5MrfhKsLxDv21xdPb8AWqw")
                .get(iSetTheGETApiEndpointForOrder());


    }
    @Step("I receive valid HTTP response code 200 for get all data order")
    public void iReceiveValidHTTPResponseCodeForGetAllDataOrder(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for all order")
    public void iReceivedValidDataForAllOrder(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
