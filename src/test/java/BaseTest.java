package test.java;

import main.java.config.BasePage;
import main.java.config.Driver;
import main.java.pageObjects.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class BaseTest extends BasePage {

    private static final Logger logger = LogManager.getLogger(BaseTest.class.getSimpleName());

    public void goToHomePage() {

        HomePage homePage = new HomePage();
        homePage.navigateToHomePage();

        String currentPage = getUrl();
        String expectedPage = data.getProperties("homeUrl");
        Assert.assertEquals(currentPage, expectedPage);

        logger.info("Successfully navigated to home page");

    }

    public void goToHoversPage() {

        HomePage homePage = new HomePage();
        goToHomePage();
        homePage.clickOnHovers();

        String currentPage = getUrl();
        String expectedPage = data.getProperties("hoversUrl");
        Assert.assertEquals(currentPage, expectedPage);

        logger.info("Successfully navigated to hovers page");
    }

    public void goToAlertsPage() {

        HomePage homePage = new HomePage();
        goToHomePage();
        homePage.clickOnAlerts();

        String currentPage = getUrl();
        String expectedPage = data.getProperties("jsAlertsUrl");
        Assert.assertEquals(currentPage, expectedPage);

        logger.info("Successfully navigated to alerts page");
    }

    public void goToMultipleWindowsPage() {

        HomePage homePage = new HomePage();
        goToHomePage();
        homePage.clickOnMultipleWindows();

        String currentPage = getUrl();
        String expectedPage = data.getProperties("windowsUrl");
        Assert.assertEquals(currentPage, expectedPage);

        logger.info("Successfully navigated to windows page");
    }

    public void goToKeyPressesPage() {

        HomePage homePage = new HomePage();
        goToHomePage();
        homePage.clickOnKeyPressess();

        String currentPage = getUrl();
        String expectedPage = data.getProperties("keyPressesUrl");
        Assert.assertEquals(currentPage, expectedPage);

        logger.info("Successfully navigated to key press page");
    }

    public void goToNotificationsPage() {

        HomePage homePage = new HomePage();
        goToHomePage();
        homePage.clickOnNotifications();

        String currentPage = getUrl();
        String expectedPage = data.getProperties("notificationUrl");
        Assert.assertEquals(currentPage, expectedPage);

        logger.info("Successfully navigated to notifications page");
    }


    public void teardown() {
        Driver.getInstance().closeDriver();
    }

}

