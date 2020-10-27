package main.java.pageObjects;

import main.java.config.BasePage;
import org.openqa.selenium.By;

public class NotificationMessages extends BasePage {

    By generateMessage = By.linkText("Click here");
    By closeButton = By.className("close");
    By notification = By.id("flash");

    public void clickOnCloseButton(){
        click(closeButton);
    }
    public void clickToGenerateNotification(){
        click(generateMessage);
    }

    public boolean notificationExists() {
        return waitForElement(notification, 2);
    }

}
