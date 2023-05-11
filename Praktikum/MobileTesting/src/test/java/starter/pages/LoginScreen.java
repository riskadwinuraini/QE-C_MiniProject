package starter.pages;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject{

    private By loginLinkButton() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");    }

    // /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button
    // [{"key":"elementId","value":"c738de7c-ab88-46b9-979c-3a573e2cfd3a","name":"elementId"},{"key":"index","value":"1","name":"index"},{"key":"package","value":"com.example.frontend_mobile","name":"package"},{"key":"class","value":"android.widget.Button","name":"class"},{"key":"text","value":"","name":"text"},{"key":"resource-id","value":"","name":"resource-id"},{"key":"checkable","value":"false","name":"checkable"},{"key":"checked","value":"false","name":"checked"},{"key":"clickable","value":"true","name":"clickable"},{"key":"enabled","value":"true","name":"enabled"},{"key":"focusable","value":"true","name":"focusable"},{"key":"focused","value":"false","name":"focused"},{"key":"long-clickable","value":"false","name":"long-clickable"},{"key":"password","value":"false","name":"password"},{"key":"scrollable","value":"false","name":"scrollable"},{"key":"selected","value":"false","name":"selected"},{"key":"bounds","value":"[954,63][1080,210]","name":"bounds"},{"key":"displayed","value":"true","name":"displayed"}]
    private By loginButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }
    // //android.widget.Button[@content-desc="Login"]
    private By emailField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    private By HomePage(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[3]");
    }
    private By passwordField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }
    private By toastMessage() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");
    }
    private By notifBlank(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"email can not empty\"]");
    }

    @Step
    public boolean OnLoginPage() {
        return waitUntilPresence(loginButton()).isDisplayed();
    }

    @Step
    public void tapLoginLink() {
        onClick(loginLinkButton());
    }

    @Step
    public void inputEmail(String email) {
        onClick(emailField());
        onType(emailField(), email);
    }

    @Step
    public void inputPassword(String password) {
        onClick(passwordField());
        onType(passwordField(), password);
    }

    @Step
    public void tapLoginButton() {
        onClick(loginButton());
    }

    @Step
    public boolean getToastMessage() {
        return waitUntilVisible(toastMessage()).isDisplayed();
    }
    @Step
    public boolean notifBlankBox(){
        return waitUntilVisible(notifBlank()).isDisplayed();
    }
    @Step
    public boolean onHomePage(){
        return waitUntilVisible(HomePage()).isDisplayed();
    }
}
