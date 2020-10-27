package main.java.pageObjects;

import main.java.config.BasePage;
import main.java.config.Driver;
import org.openqa.selenium.By;

public class NotificationMessages extends BasePage {

    public String notificationMessagesURL = "http://the-internet.herokuapp.com/notification_message_rendered";

    public void navigateToNotificationPageDirectly() {
        Driver.getInstance().getDriver().navigate().to(notificationMessagesURL);
    }

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
