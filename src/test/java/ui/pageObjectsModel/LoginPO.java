package ui.pageObjectsModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class LoginPO extends BasePO {

    @FindBy(xpath = "//input[@id='login-form-username']")
    public WebElement usernameInputBox;

    @FindBy(xpath = "//input[@id='login-form-password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@id='login-form-submit']")
    public WebElement loginButton;

    public void enterUsername(String username) {
        usernameInputBox.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInputBox.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
