package pageObjectModel.weaver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import pageObjectModel.pages.constants.ConfigData;
import pageObjectModel.pages.helpers.HelperBase;

import java.time.Duration;

public class WeaverBase {
    public WebDriver driver;
    public HelperBase helperBase;

    @BeforeTest
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments(ConfigData.ChromeOptionsArgument.EnableAutomation);
        options.setAcceptInsecureCerts(true);
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigData.ImplicitWait));
        driver.get(ConfigData.environmentAppCopy_Url);

        //Initialize Helper Base
        helperBase = new HelperBase(driver);
    }

    @BeforeGroups(groups = {"Smoke", "Regression"})
    public void setUpGroups(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments(ConfigData.ChromeOptionsArgument.EnableAutomation);
        options.setAcceptInsecureCerts(true);
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigData.ImplicitWait));
        driver.get(ConfigData.environmentAppCopy_Url);

        //Initialize Helper Base
        helperBase = new HelperBase(driver);
    }
    @AfterTest
    public void close(){
        driver.close();
        driver.quit();
    }
    @AfterGroups(groups = {"Smoke", "Regression"})
    public void closeGroups(){
        driver.close();
        driver.quit();
    }
}
