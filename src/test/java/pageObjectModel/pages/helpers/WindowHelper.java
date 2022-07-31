package pageObjectModel.pages.helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowHelper{

    protected static WebDriver driver;
    WaitHelper waitHelper;

    public WindowHelper(WebDriver remoteDriver){
        driver = remoteDriver;
        waitHelper = new WaitHelper(driver);
    }

    public void scrollIntoView(WebElement element)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'})", element);
        waitHelper.waitForElementToBeDisplayed(element);
    }
}
