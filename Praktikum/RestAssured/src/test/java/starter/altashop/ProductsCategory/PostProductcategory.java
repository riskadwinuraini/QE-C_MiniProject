package starter.altashop.ProductsCategory;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostProductcategory {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the POST api endpoints in category")
    public String iSetThePOSTApiEndpointsInCategory(){
        return url + "categories";
    }
    @Step("I send HTTP api POST request")
    public void iSendHTTPApiPOSTRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","gaming");
        requestBody.put("description","for gaming purposes");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(iSetThePOSTApiEndpointsInCategory());

    }
    @Step("I receive valid HTTP response code 200 in product category")
    public void iReceiveValidHTTPResponseCodeInProductCategory(){
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("I receive valid data for new product category")
    public void iReceiveValidDataForNewProductCategory(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
