package test.java.cases;

import main.java.config.Driver;
import main.java.pageObjects.Hovers;
import org.testng.Assert;
import org.testng.annotations.*;
import test.java.BaseTest;
import java.util.ArrayList;
import java.util.List;

public class HoversTest extends BaseTest {

    Hovers hoverPage = new Hovers();

    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser) throws Exception {

        Driver.getInstance().setDriver(browser);
        goToHoversPage();
    }

    @Test(priority = 1)
    public void tooltipsAreMatching() {

        List<String> hoverResults = hoverPage.hoverOverElements();
        List<String> expectedResults = new ArrayList<>();
        expectedResults.add("name: user1\nView profile");
        expectedResults.add("name: user2\nView profile");
        expectedResults.add("name: user3\nView profile");
        Assert.assertEquals(hoverResults, expectedResults);

    }

    @Test(priority = 2)
    public void secondProfileIsOpen() {

        hoverPage.hoverOverSecondAndClick();
        String currentUrl = hoverPage.getProfileURL();
        String expectedURL = hoverPage.user2URL;
        Assert.assertEquals(currentUrl, expectedURL);

    }

    @AfterTest
    public void tearDown() {
        teardown();
    }
}
