package starter.AltaShop;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Home extends PageObject {
    private By productsTitle(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/div[1]/h3");
    }
    @Step
    public void validateOnTheHomePage(){
        $(productsTitle()).isDisplayed();
    }
}
