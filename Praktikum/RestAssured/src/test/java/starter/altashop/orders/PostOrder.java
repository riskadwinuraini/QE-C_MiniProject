package starter.altashop.orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class PostOrder {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the POST api endpoints in order")
    public String iSetThePOSTApiEndpointsInOrder(){
        return url + "orders";
    }
    @Step("I send HTTP api POST request for order")
    public void iSendHTTPApiPOSTRequestForOrder(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id",13000);
        requestBody.put("quantity",1);


        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IlJpc2theWEiLCJFbWFpbCI6InJpc2thZHdpNjY2QGdtYWlsLmNvbSJ9.1B3znF3ZyrJINDUI1zNLD5MrfhKsLxDv21xdPb8AWqw")
                .get(iSetThePOSTApiEndpointsInOrder())
                .then()
                .statusCode(200);
    }
    @Step("I receive a valid HTTP response code 200 on the order POST")
    public void iReceiveAValidHTTPResponseCodeOnTheOrderPOST(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for create new order")
    public void iReceiveValidDataForCreateNewOrder() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
