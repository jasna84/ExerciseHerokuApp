package main.java.pageObjects;

import main.java.config.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class MultipleWindows extends BasePage {

    private static final Logger logger = LogManager.getLogger(MultipleWindows.class.getSimpleName());

    By openWindow = By.linkText("Click Here");
    By newWindowTxt = By.cssSelector("h3");

    public void clickOnClickHere() {
        click(openWindow);
        logger.info("New window clicked");
    }

    public void goToNewWindow() {
        switchToNewWindow();
        logger.info("Switched to a new window");
    }

    public String getNewWindowText() {
        return getElementText(newWindowTxt);
    }

    public String getCurrentUrl() {
        return getUrl();
    }

    public String getExpectedUrl() { return data.getProperties("newWindowUrl");}
}
