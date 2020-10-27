package main.java.pageObjects;

import main.java.config.BasePage;
import main.java.config.Driver;
import org.openqa.selenium.By;

public class MultipleWindows extends BasePage {

    public String multipleWindowsURL = "http://the-internet.herokuapp.com/javascript_alerts";
    public String newWindowURL = "http://the-internet.herokuapp.com/windows/new";

    public void navigateToMultipleWindowsPageDirectly() {
        Driver.getInstance().getDriver().navigate().to(multipleWindowsURL);
    }

    By openWindow = By.linkText("Click Here");
    By newWindowTxt = By.cssSelector("h3");

    public void clickOnClickHere() {
        click(openWindow);
    }

    public void goToNewWindow() {
        switchToNewWindow();
    }

    public String getNewWindowText() {
        return getElementText(newWindowTxt);
    }

    public String getNewWindowURL() {
        return getUrl();
    }
}
