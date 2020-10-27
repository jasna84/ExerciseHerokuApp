package test.java.cases;

import main.java.config.Driver;
import main.java.pageObjects.MultipleWindows;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.java.BaseTest;

public class MultipleWindowsTest extends BaseTest {

    MultipleWindows multiWindowsPage = new MultipleWindows();

    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser) throws Exception {

        Driver.getInstance().setDriver(browser);
        goToMultipleWindowsPage();
    }

    @Test
    public void newWindowIsGenerated() {

        multiWindowsPage.clickOnClickHere();
        multiWindowsPage.goToNewWindow();

        String pageText = multiWindowsPage.getNewWindowText();
        String currentURL = multiWindowsPage.getNewWindowURL();

        Assert.assertEquals("New Window",pageText);
        Assert.assertEquals(multiWindowsPage.newWindowURL,currentURL);

    }

    @AfterTest
    public void tearDown() {
        teardown();
    }

}
