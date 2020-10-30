package main.java.pageObjects;

import main.java.config.BasePage;
import main.java.config.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BasePage {

    private static final Logger logger = LogManager.getLogger(HomePage.class.getSimpleName());

        public void navigateToHomePage() {
            Driver.getInstance().getDriver().navigate().to((data.getProperties("homeUrl")));
            logger.info("Home page navigated");
        }

        By alertsLink = By.linkText("JavaScript Alerts");
        By hoversLink = By.linkText("Hovers");
        By keyPressesLink = By.linkText("Key Presses");
        By multipleWindowsLink = By.linkText("Multiple Windows");
        By notificationsLink = By.linkText("Notification Messages");

        public void clickOnAlerts(){
        click(alertsLink);
        logger.info("Alerts page clicked");
    }
        public void clickOnHovers(){
        click(hoversLink);
        logger.info("Hovers page clicked");
    }
        public void clickOnKeyPressess(){
        click(keyPressesLink);
        logger.info("Key Presses page clicked");
    }
        public void clickOnMultipleWindows(){
        click(multipleWindowsLink);
        logger.info("Multiple Windows page clicked");
    }
        public void clickOnNotifications(){
        click(notificationsLink);
        logger.info("Notifications page clicked");
    }

}
