package starter.AltaShop;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Register extends PageObject {

    private By fullnameField(){
        return By.xpath("//input[@id= 'input-18']");
    }
    private By emailField(){
        return By.xpath("//input[@id= 'input-21']");
    }
    private By passwordField(){
        return By.xpath("//input[@id= 'input-24']");
    }
    private By registerButton(){
        return By.xpath("//button[@class= 'v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }


    @Step
    public static OpenUrl url(String targetUrl){
        return new OpenUrl(targetUrl);
    }
    @Step
    public void validateOnRegisterPage(){
        $(registerButton()).isDisplayed();
    }
    @Step
    public void inputFullName(String fullname){
        $(fullnameField()).type(fullname);
    }
    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }
    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }
    @Step
    public void ClickRegisterButton() {
        $(registerButton()).click();
    }



}
