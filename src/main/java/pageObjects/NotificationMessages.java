package main.java.pageObjects;

import main.java.config.BasePage;
import main.java.config.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class NotificationMessages extends BasePage {

    private static final Logger logger = LogManager.getLogger(NotificationMessages.class.getSimpleName());

    By generateMessage = By.linkText("Click here");
    By closeButton = By.className("close");
    By notification = By.id("flash");

    public void clickOnCloseButton(){
        click(closeButton);
        logger.info("Notification close button clicked");
    }
    public void clickToGenerateNotification(){
        click(generateMessage);
        logger.info("Clicked to generate new notification");
    }

    public boolean notificationExists() {
        return waitForElement(notification, 2);
    }

}
