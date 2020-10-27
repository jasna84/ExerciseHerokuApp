package test.java;

import main.java.config.Driver;
import main.java.pageObjects.HomePage;

public class BaseTest {

    public void goToHomePage() {
        HomePage homePage = new HomePage();
        homePage.navigateToHomePage();
    }

    public void goToHoversPage() {
        HomePage homePage = new HomePage();
        homePage.navigateToHomePage();
        homePage.clickOnHovers();
    }

    public void goToAlertsPage() {
        HomePage homePage = new HomePage();
        homePage.navigateToHomePage();
        homePage.clickOnAlerts();
    }

    public void goToMultipleWindowsPage() {
        HomePage homePage = new HomePage();
        homePage.navigateToHomePage();
        homePage.clickOnMultipleWindows();
    }

    public void goToKeyPressesPage() {
        HomePage homePage = new HomePage();
        homePage.navigateToHomePage();
        homePage.clickOnKeyPressess();
    }

    public void goToNotificationsPage() {
        HomePage homePage = new HomePage();
        homePage.navigateToHomePage();
        homePage.clickOnNotifications();
    }


    public void teardown() {
        Driver.getInstance().closeDriver();
    }

}

