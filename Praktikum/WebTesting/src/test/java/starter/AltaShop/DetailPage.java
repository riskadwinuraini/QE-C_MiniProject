package starter.AltaShop;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailPage extends PageObject {
    private By title(){
        return By.xpath("//p[@class='text-h4 text--primary']");
    }
    @Step
    public void validateOnDetailPage(){
        $(title()).isDisplayed();
    }
}
