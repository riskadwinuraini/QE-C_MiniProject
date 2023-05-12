package starter.altashop.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Register {
    protected static String url = "https://altashop-api.fly.dev/api/auth/";
    @Step("I register using the correct data")
    public String RegisterUsingTheCorrectData(){
        return url + "register";
    }
    @Step("I submit a POST request to {string} with fullname Riska Dwi Nur Aini, email riskadwi583@gmail.com and password Riskaya123")
    public void POSTRequestToWithFullnameEmailAndPassword(){
        String alphabet = "abcdef";
        String s = RandomStringUtils.random(8, alphabet);
        JSONObject requestBody = new JSONObject();
        requestBody.put("fullname", "riskashh");
        requestBody.put("email",s + "@gmail.com");
        requestBody.put("password", "Riskaya123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(RegisterUsingTheCorrectData());
    }
    @Step("I receive valid HTTP response code register 200")
    public void ValidHTTPResponseCodeRegister(){

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("register successfully")
    public void registerSuccessfully(){

        restAssuredThat(response -> response.statusCode(200));
    }
}
