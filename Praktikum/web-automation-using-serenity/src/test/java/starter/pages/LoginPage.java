package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By EmailField(){
        return By.id("input-18846");
    }

    private By passwordField(){return By.id("input-18849");}
    private By loginButton(){ return By.className("v-btn__content");}

    @Step
    public void openPage(){ open();}

    @Step
    public void validateOnTheLoginPage(){
        $(loginButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String text){
        $(EmailField()).type(text);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickButtonLogin(){
        $(loginButton()).click();
    }
}
