package starter.altashop.orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetIdOrder {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoint for order by id")
    public String iSetTheGETApiEndpointForOrderById(){
        return url + "orders/11369";
    }
    @Step("I send HTTP api GET request for order by id")
    public void iSendHTTPApiGETRequestForOrderById(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IlJpc2theWEiLCJFbWFpbCI6InJpc2thZHdpNjY2QGdtYWlsLmNvbSJ9.1B3znF3ZyrJINDUI1zNLD5MrfhKsLxDv21xdPb8AWqw")
                .get(iSetTheGETApiEndpointForOrderById());
    }

    @Step("I receive valid HTTP response code 200 for get id data order")
    public void iReceiveValidHTTPResponseCodeForGetIdDataOrder(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for id order")
    public void iReceiveValidDataForIdOrder(){

    }
}
