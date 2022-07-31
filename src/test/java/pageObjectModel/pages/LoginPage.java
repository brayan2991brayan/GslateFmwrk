package pageObjectModel.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjectModel.pages.constants.ConfigData;

import java.time.Duration;


public class LoginPage{

    public static String usernameField = "input[name=Username]";
    public static String passwordField = "input[name=Password]";
    public static String loginButton = "Log In";
    SoftAssert oSoftAssert = new SoftAssert();



    public static void DisableNotifications(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments(ConfigData.ChromeOptionsArgument.DisableNotification);
    }

    public static void enterCredentials(WebDriver driver) throws InterruptedException {

        //Enter Code to identify Username field with validation
        WebElement elementUsername = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(usernameField))));
        elementUsername.clear();
        elementUsername.sendKeys("brayanTest123@mail.com");

        elementUsername.sendKeys(Keys.TAB);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(ConfigData.TimeOutSeconds.Sixty));
        wait.until(webDriver -> ((JavascriptExecutor) webDriver));

        //Enter Code to identify Password field with validation
        //WebElement elementPassword = driver.findElement(By.cssSelector(passwordField));
        //WebElement elementPassword = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement elementPassword = driver.findElement(By.cssSelector(passwordField));

        //elementPassword.clear();
        elementPassword.sendKeys("Test123");
        //expected error text
        String exp = "Email is required";
        //identify actual error message
        WebElement usernameErrorMessage = driver.findElement(By.id("Username-error"));
        String act = usernameErrorMessage.getText();
        System.out.println("Error message is: "+ act);
        //verify error message with Assertion
        Assert.assertEquals(exp, act);
        driver.quit();

    }

    public static void sendCredentials(WebDriver driver)
    {
        // Enter Code to submit the credentials with validation
        WebElement elementLoginBtn = driver.findElement(By.linkText("Log In"));
        elementLoginBtn.click();
    }
}
