package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    private By namaField(){ return By.className("v-text-field_slot");
    }
    private By emailField(){
        return By.className("v-text-field__slot");
    }
    private By passwordField(){
        return By.className("v-text-filed__slot");
    }

    private By registerButton(){
        return By.className("v-btn__content");
    }

    @Step
    public void openPage(){ open();
    }
    @Step
    public void validateOnRegisterPage(){ $(registerButton()).isDisplayed();}
    @Step
    public void inputNama(String Nama){ $(namaField()).type(Nama);}
    @Step
    public void inputEmail(String Email){ $(emailField()).type(Email);}
    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickRegisterButton() {
        $(registerButton()).click();
    }


}
