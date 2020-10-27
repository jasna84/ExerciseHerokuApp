package test.java.cases;

import main.java.config.Driver;
import main.java.pageObjects.KeyPresses;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.java.BaseTest;

public class KeyPressesTest extends BaseTest {

    KeyPresses keyPressPage = new KeyPresses();

    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser) throws Exception {

        Driver.getInstance().setDriver(browser);
        goToKeyPressesPage();
    }

    @Test
    public void tabKeyIsEntered() {

        keyPressPage.pressTab();
        String pageText = keyPressPage.getActionText();
        Assert.assertEquals("You entered: TAB", pageText);

    }

    @Test
    public void enterKeyIsEntered() {

        keyPressPage.pressEnter();
        String pageText = keyPressPage.getActionText();
        Assert.assertEquals("You entered: ENTER",pageText);

    }

    @Test
    public void spaceKeyIsEntered() {

        keyPressPage.pressSpace();
        String pageText = keyPressPage.getActionText();
        Assert.assertEquals("You entered: SPACE",pageText);

    }

    @Test
    public void ctrlKeyIsEntered() {

        keyPressPage.pressCtrl();
        String pageText = keyPressPage.getActionText();
        Assert.assertEquals("You entered: CONTROL", pageText);

    }

    @AfterTest
    public void tearDown() {
        teardown();
    }

}
