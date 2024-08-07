package ui.pageObjectsModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ui.driver.DriverFactory;


public class BasePO {
    public BasePO(){
        WebDriver driver = DriverFactory.getDriver();
        PageFactory.initElements(driver,this);
    }

    public WebDriver getDriver() {
        return DriverFactory.getDriver();
    }
}
