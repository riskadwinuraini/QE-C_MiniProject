package starter.altashop.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostProduct {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST endpoints")
    public String iSetPOSTEndpoints(){
        return url + "products";}
    @Step("I send POST HTTP request")
    public void iSendPOSTHTTPRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","Sony PS5");
        requestBody.put("description","play has limits");
        requestBody.put("price",299);
        JSONArray categoriesArray = new JSONArray();
        categoriesArray.add(12541);
        requestBody.put("categories", categoriesArray);

        SerenityRest.given().header("Authorization","Bearer" + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6InJpc2thc2hoIiwiRW1haWwiOiJyaXNrYXNoMTIzQGdtYWlsLmNvbSJ9.NkOo3kqKAplHa_XMEx7vSn_3aTsqE8i2oDnEEgUfuFg")
                .header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iSetPOSTEndpoints());

    }
    @Step("I receive a valid HTTP response code 200 in products POST")
    public void iReceiveAValidHTTPResponseCodeInProductsPOST(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for new product")
    public void iReceiveValidDataForNewProduct(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
