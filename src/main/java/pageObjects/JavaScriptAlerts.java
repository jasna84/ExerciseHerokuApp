package main.java.pageObjects;

import main.java.config.BasePage;
import main.java.config.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class JavaScriptAlerts extends BasePage {

    private static final Logger logger = LogManager.getLogger(JavaScriptAlerts.class.getSimpleName());

    By jsAlertButton = By.cssSelector("button[onclick = 'jsAlert()']");
    By jsConfirmButton = By.cssSelector("button[onclick = 'jsConfirm()']");
    By jsPromptButton = By.cssSelector("button[onclick = 'jsPrompt()']");
    By result = By.id("result");

    public void clickOnJSAlertButton(){
        click(jsAlertButton);
        logger.info("JS Alert clicked");
    }
    public void clickOnJSConfirmButton(){
        click(jsConfirmButton);
        logger.info("JS Confirm clicked");
    }
    public void clickOnJSPromptButton(){
        click(jsPromptButton);
        logger.info("JS Prompt clicked");
    }
    public String getResultText() {
        return getElementText(result);
    }

}
