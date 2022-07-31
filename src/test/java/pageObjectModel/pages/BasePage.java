package pageObjectModel.pages;

import org.openqa.selenium.WebDriver;
import pageObjectModel.pages.helpers.ActionHelper;
import pageObjectModel.pages.helpers.WaitHelper;
import pageObjectModel.pages.helpers.WindowHelper;


public class BasePage<IWaitHelper, IActionHelper, IWindowHelper>{
    WebDriver driver;
    IWaitHelper waitHelper ;
    IActionHelper actionHelper;
    IWindowHelper windowHelper;

    protected BasePage(WebDriver remoteDriver){
        driver = remoteDriver;
        waitHelper = (IWaitHelper) new WaitHelper(driver);
        actionHelper = (IActionHelper) new ActionHelper(driver);
        windowHelper = (IWindowHelper) new WindowHelper(driver);
    }
}
