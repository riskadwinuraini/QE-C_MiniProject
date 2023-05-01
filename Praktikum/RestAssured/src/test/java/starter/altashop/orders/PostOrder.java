package starter.altashop.orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostOrder {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the POST api endpoints in order")
    public String iSetThePOSTApiEndpointsInOrder(){
        return url + "orders";
    }
    @Step("I send HTTP api POST request for order")
    public void iSendHTTPApiPOSTRequestForOrder(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id","2");
        requestBody.put("quantity","1");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(iSetThePOSTApiEndpointsInOrder());
    }
    @Step("I receive a valid HTTP response code 200 on the order POST")
    public void iReceiveAValidHTTPResponseCodeOnTheOrderPOST(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for create new order")
    public void iReceiveValidDataForCreateNewOrder(){
        restAssuredThat(response -> response.body("'product_id'", equalTo("2")));
        restAssuredThat(response -> response.body("'quantity'", equalTo("1")));
    }
}
