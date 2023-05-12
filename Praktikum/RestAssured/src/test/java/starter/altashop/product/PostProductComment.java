package starter.altashop.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostProductComment {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST endpoints by comment")
    public String iSetPOSTEndpointsByComment(){
        return url + "products/85117/comments";
    }
    @Step("I send POST HTTP request by comment")
    public void iSendPOSTHTTPRequestByComment(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("content","the games are great including Gran Turismo 7 but sadly GT4 is much better");

        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6InJpc2thc2hoIiwiRW1haWwiOiJyaXNrYXNoMTIzQGdtYWlsLmNvbSJ9.NkOo3kqKAplHa_XMEx7vSn_3aTsqE8i2oDnEEgUfuFg")
                .header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iSetPOSTEndpointsByComment());

    }
    @Step("I receive valid HTTP response code 200 in products comment POST")
    public void iReceiveValidHTTPResponseCodeInProductsCommentPOST(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for new comment")
    public void iReceiveValidDataForNewComment(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
