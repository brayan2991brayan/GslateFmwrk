package pageObjectModel.pages.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjectModel.pages.constants.ConfigData;
import pageObjectModel.pages.locators.Login;

public class HelperBase {

    static WebDriver driver;
    static WaitHelper waitHelper;

    public HelperBase(WebDriver remoteDriver){
        driver = remoteDriver;
        waitHelper = new WaitHelper(driver);
    }
    public static void logout()
    {
        try
        {
            var logoutLink = ConfigData.environmentAppCopy_Url + "/#/authentication/logout";
            driver.navigate().to(logoutLink);
            waitHelper.waitForElementToBeDisplayed(By.cssSelector(Login.loginButton));
        }
        catch (Exception ex)
        {
            throw new RuntimeException("The logout action could not be executed successfully.");
        }
    }
}
