package starter.AltaShop;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Category extends PageObject {

    private By selectCategoryButton(){
        return By.xpath("//div[@class='v-input__slot']");
    }

    private By categoryButton(){
        return By.xpath("//div[@class='v-list-item__content']");
    }

    private By clearButton(){
        return By.xpath("//div[@class='v-input__icon v-input__icon--clear']");
    }

    private By errorMessage(){
        return By.xpath("//div[@class='v-alert__wrapper']");
    }

    @Step
    public void ClickSelectCategoryButton(){
        $(selectCategoryButton()).click();
    }

    @Step
    public void ClickCategoryButton(){
        $(categoryButton()).click();
    }

    @Step
    public boolean validateMessageDisplayed(){
        return $(errorMessage()).isDisplayed();
    }

    @Step
    public boolean validateEqualMessage(String message){
        return $(errorMessage()).getText().equalsIgnoreCase(message);
    }

    @Step
    public void ClickClearButton(){
        $(clearButton()).click();
    }

}
