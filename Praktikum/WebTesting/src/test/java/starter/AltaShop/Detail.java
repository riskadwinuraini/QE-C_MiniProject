package starter.AltaShop;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Detail extends PageObject {
    private By clickDetailProduct1Button(){
        return By.xpath("//button[@class='button-beli v-btn v-btn--outlined theme--light v-size--small primary--text']");
    }
    @Step
    public void ClickDetail1Button(){
        $(clickDetailProduct1Button()).click();
    }
}
