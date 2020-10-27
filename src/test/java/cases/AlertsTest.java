package test.java.cases;

import main.java.config.Driver;
import main.java.pageObjects.JavaScriptAlerts;
import org.testng.Assert;
import org.testng.annotations.*;
import test.java.BaseTest;

public class AlertsTest extends BaseTest {

    JavaScriptAlerts alertsPage = new JavaScriptAlerts();

    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser) throws Exception {

        Driver.getInstance().setDriver(browser);
        goToAlertsPage();
    }

    @Test
    public void jsAlertIsAccepted() {

        alertsPage.clickOnJSAlertButton();

        String alertText = alertsPage.getAlertText();
        Assert.assertEquals("I am a JS Alert", alertText);

        alertsPage.acceptAlert();
        String resultText = alertsPage.getResultText();
        Assert.assertEquals("You successfuly clicked an alert", resultText);

    }

    @Test
    public void jsConfirmIsCanceled() {

        alertsPage.clickOnJSConfirmButton();;

        String alertText = alertsPage.getAlertText();
        Assert.assertEquals("I am a JS Confirm", alertText);

        alertsPage.dismissAlert();
        String resultText = alertsPage.getResultText();
        Assert.assertEquals("You clicked: Cancel", resultText);

    }

    @Test
    public void sendTextToJsPrompt() {

        alertsPage.clickOnJSPromptButton();

        String alertText = alertsPage.getAlertText();
        Assert.assertEquals("I am a JS prompt", alertText);

        alertsPage.enterTextToAlert("This is a test");
        alertsPage.acceptAlert();

        String resultText = alertsPage.getResultText();
        Assert.assertEquals("You entered: This is a test", resultText);

    }

    @AfterTest
    public void tearDown() {
        teardown();
    }
}
