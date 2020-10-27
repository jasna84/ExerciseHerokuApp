package main.java.pageObjects;

import main.java.config.BasePage;
import main.java.config.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class KeyPresses extends BasePage {

    public String keyPressesURL = "http://the-internet.herokuapp.com/javascript_alerts";

    public void navigateToKeyPressesPageDirectly() {
        Driver.getInstance().getDriver().navigate().to(keyPressesURL);
    }

    By result = By.id("result");

    public void pressEnter() {
        pressKeys(Keys.ENTER);
    }

    public void pressTab() {
        pressKeys(Keys.TAB);
    }

    public void pressCtrl() {
        pressKeys(Keys.LEFT_CONTROL);
    }

    public void pressSpace() {
        pressKeys(Keys.SPACE);
    }

    public String getActionText() {
        return getElementText(result);
    }

}
