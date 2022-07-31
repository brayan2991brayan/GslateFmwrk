package pageObjectModel.pages.interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface IWaitHelper {
    void waitForPageReadyState();
    void waitForElementToBeDisplayed(By locator);
    void waitForElementToBeDisplayed(WebElement element);
    void waitForElementToBeClickable(WebElement element);
    WebElement waitUntilElementExists(By elementLocator);
}
