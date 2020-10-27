package main.java.pageObjects;

import main.java.config.BasePage;
import org.openqa.selenium.By;

public class MultipleWindows extends BasePage {

    public String newWindowURL = "http://the-internet.herokuapp.com/windows/new";

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
