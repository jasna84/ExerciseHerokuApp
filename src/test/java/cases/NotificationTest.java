package test.java.cases;

import main.java.config.Driver;
import main.java.pageObjects.NotificationMessages;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.java.BaseTest;

public class NotificationTest extends BaseTest {

    NotificationMessages notificationPage = new NotificationMessages();

    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser) throws Exception {

        Driver.getInstance().setDriver(browser);
        goToNotificationsPage();
    }

    @Test(priority = 1)
    public void notificationVisibleOnPageLoad() {

        boolean isVisibleOnPageLoad = notificationPage.notificationExists();
        Assert.assertTrue(isVisibleOnPageLoad);

    }

    @Test(priority = 2)
    public void newNotificationIsGenerated() {

        notificationPage.clickOnCloseButton();
        boolean isVisibleOnClick = notificationPage.notificationExists();
        Assert.assertTrue(isVisibleOnClick);

    }

    @AfterTest
    public void tearDown() {
        teardown();
    }
}
