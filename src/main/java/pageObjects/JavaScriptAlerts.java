package main.java.pageObjects;

import main.java.config.BasePage;
import org.openqa.selenium.By;

public class JavaScriptAlerts extends BasePage {

    By jsAlertButton = By.cssSelector("button[onclick = 'jsAlert()']");
    By jsConfirmButton = By.cssSelector("button[onclick = 'jsConfirm()']");
    By jsPromptButton = By.cssSelector("button[onclick = 'jsPrompt()']");
    By result = By.id("result");

    public void clickOnJSAlertButton(){
        click(jsAlertButton);
    }
    public void clickOnJSConfirmButton(){
        click(jsConfirmButton);
    }
    public void clickOnJSPromptButton(){
        click(jsPromptButton);
    }
    public String getResultText() { return getElementText(result); }

}
