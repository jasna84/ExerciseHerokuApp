package main.java.pageObjects;

import main.java.config.BasePage;
import main.java.config.Driver;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

        public String homeURL = "http://the-internet.herokuapp.com/";

        public void navigateToHomePage() {
            Driver.getInstance().getDriver().navigate().to(homeURL);
        }

        By alertsLink = By.linkText("JavaScript Alerts");
        By hoversLink = By.linkText("Hovers");
        By keyPressesLink = By.linkText("Key Presses");
        By multipleWindowsLink = By.linkText("Multiple Windows");
        By notificationsLink = By.linkText("Notification Messages");

        public void clickOnAlerts(){
        click(alertsLink);
    }
        public void clickOnHovers(){
        click(hoversLink);
    }
        public void clickOnKeyPressess(){
        click(keyPressesLink);
    }
        public void clickOnMultipleWindows(){
        click(multipleWindowsLink);
    }
        public void clickOnNotifications(){
        click(notificationsLink);
    }

}
