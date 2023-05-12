package starter.altashop.product;


import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetIdProduct {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set GET endpoints by id")
    public String iSetGETEndpointsById(){
        return url+ "products/85142";
    }
    @Step("I send GET HTTP request by id")
    public void iSendGETHTTPRequestById(){
        SerenityRest.given()
                .when()
                .get(iSetGETEndpointsById());
    }
    @Step("I receive a valid HTTP response code 200 for Get id data products")
    public void iReceiveAValidHTTPResponseCodeForGetIdDataProducts(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for id products")
    public void iReceiveValidDataForIdProducts(){

    }


}
