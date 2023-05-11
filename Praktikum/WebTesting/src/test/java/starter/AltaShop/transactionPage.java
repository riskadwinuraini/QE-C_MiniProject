package starter.AltaShop;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class transactionPage extends PageObject {
    private By title(){
        return By.xpath("//th[@class='text-start sortable']");
    }
    @Step
    public void validateOnTransactionPage(){
        $(title()).isDisplayed();
    }

}
