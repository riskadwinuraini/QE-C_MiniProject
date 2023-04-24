package starter.altashop.product;


import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductRating {
    protected static String url = "https://altashop-api.fly.dev/api/";

   @Step("I set GET endpoints by rating")
   public String iSetGETEndpointsByRating(){
       return url + "products/1/ratings";
   }
   @Step("I send GET HTTP request by rating")
   public void iSendGETHTTPRequestByRating(){
       SerenityRest.given()
               .when()
               .get(iSetGETEndpointsByRating());
   }
   @Step("I receive valid HTTP response code 200 for Get rating data products")
   public void iReceiveValidHTTPResponseCodeForGetRatingDataProducts(){
       restAssuredThat(response -> response.statusCode(200));

   }
   @Step("I receive valid data for rating products")
   public void iReceiveValidDataForRatingProducts(){

   }
}
