package starter.altashop.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostProductRating {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST endpoints by rating")
    public String iSetPOSTEndpointsByRating(){
        return url + "products/52485/ratings";
    }
    @Step("I send POST HTTP request by rating")
    public void iSendPOSTHTTPRequestByRating(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("count",4);

        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IlJpc2theWEiLCJFbWFpbCI6InJpc2thZHdpNjY2QGdtYWlsLmNvbSJ9.1B3znF3ZyrJINDUI1zNLD5MrfhKsLxDv21xdPb8AWqw")
                .header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iSetPOSTEndpointsByRating());
    }
    @Step("I receive valid HTTP response code 200 in products rating POST")
    public void iReceiveValidHTTPResponseCodeInProductsRatingPOST(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for assign product rating")
    public void iReceiveValidDataForAssignProductRating(){
        restAssuredThat(response -> response.statusCode(200));

    }
}
