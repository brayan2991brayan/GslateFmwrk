package pageObjectModel.pages.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjectModel.pages.constants.ConfigData;


import java.time.Duration;

public class WaitHelper {
    protected static WebDriver driver;

    public WaitHelper(WebDriver remoteDriver){
        driver=remoteDriver;
    }

    public void waitForPageReadyState()
    {
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(ConfigData.TimeOutSeconds.Sixty));
            wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return (document.readyState == 'complete' && jQuery.active == 0)"));
        }
        catch (Exception ex)
        {
            throw new RuntimeException("Error trying to wait for page ready state. The reasons: due to errors in the vpn connection. Internet connection or site problems.");
        }
    }

    public void waitForElementToBeDisplayed(By locator)
    {
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(ConfigData.TimeOutSeconds.Sixty));
            //Wait until the element is visible
            wait.until(driver -> ExpectedConditions.visibilityOfElementLocated(locator).apply(driver));
        }
        catch (Exception ex)
        {
            throw new RuntimeException(ex.getMessage());
        }
    }
    public void waitForElementToBeDisplayed(WebElement element)
    {
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(ConfigData.TimeOutSeconds.Sixty));
            //Wait until the element is visible
            wait.until(driver -> ExpectedConditions.visibilityOf(element).apply(driver));
        }
        catch (Exception ex)
        {
            throw new RuntimeException(ex.getMessage());
        }
    }
    public void waitForElementToBeClickable(WebElement element)
    {
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(ConfigData.TimeOutSeconds.Sixty));
            //Wait until the element is clickable
            wait.until(driver -> ExpectedConditions.elementToBeClickable(element).apply(driver));
        }
        catch (Exception ex)
        {
            throw new RuntimeException(ex.getMessage());
        }
    }

    public WebElement waitUntilElementExists(By elementLocator)
    {
        try
        {
            var wait = new WebDriverWait(driver, Duration.ofSeconds(ConfigData.TimeOutSeconds.Sixty));
            //Wait until the element is clickable
            return wait.until(driver -> ExpectedConditions.presenceOfElementLocated(elementLocator).apply(driver));
        }
        catch (Exception ex)
        {
            throw new RuntimeException(ex.getMessage());
        }
    }
}
