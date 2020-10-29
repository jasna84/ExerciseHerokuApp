package main.java.pageObjects;

import main.java.config.BasePage;
import main.java.config.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class KeyPresses extends BasePage {

    private static final Logger logger = LogManager.getLogger(KeyPresses.class.getSimpleName());

    By result = By.id("result");

    public void pressEnter() {
        pressKeys(Keys.ENTER);
        logger.info("Enter key pressed");
    }

    public void pressTab() {
        pressKeys(Keys.TAB);
        logger.info("Tab key pressed");
    }

    public void pressCtrl() {
        pressKeys(Keys.LEFT_CONTROL);
        logger.info("Control key pressed");
    }

    public void pressSpace() {
        pressKeys(Keys.SPACE);
        logger.info("Space key pressed");
    }

    public String getActionText() {
        return getElementText(result);
    }

}
