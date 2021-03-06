package main.java.pageObjects;

import main.java.config.BasePage;
import main.java.config.DataReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Hovers extends BasePage {

    private static final Logger logger = LogManager.getLogger(Hovers.class.getSimpleName());

    By images = By.className("figure");
    By secondImage = By.xpath("//*[@id='content']/div/div[2]");

    public String getProfileURL() {
        return getUrl();
    }

    public String getExpectedUrl() { return data.getProperties("user2ProfileUrl");}

    public List<String> hoverOverElements() {

        List<WebElement> profilePics = getListElements(images);
        List<String> captionsText = new ArrayList<>();

        for (WebElement pic : profilePics) {
            hoverOverElement(pic);
            if (pic == profilePics.get(0)) {
                String caption1 = profilePics.get(0).getText();
                captionsText.add(caption1);
            } else if (pic == profilePics.get(1)) {
                String caption2 = profilePics.get(1).getText();
                captionsText.add(caption2);
            } else {
                String caption3 = profilePics.get(2).getText();
                captionsText.add(caption3);
            }
        }
        logger.info("Received captions are " + captionsText);
        return captionsText;
    }

    public void hoverOverSecondAndClick() {

        hoverOverElement(secondImage);
        By profileLink = By.xpath("//*[@id='content']/div/div[2]/div/a");
        click(profileLink);
        logger.info("Profile clicked");
    }
}
