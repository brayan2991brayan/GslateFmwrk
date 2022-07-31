package pageObjectModel.suiteTests;

import org.testng.annotations.Test;
import pageObjectModel.pages.LoginPage;
import pageObjectModel.weaver.WeaverBase;


public class LoginTest  extends WeaverBase {

    @Test()
    public void validateLoginRegression() throws InterruptedException {
        //Enter code to call the page object methods and complete the test
        LoginPage.DisableNotifications();
        LoginPage.enterCredentials(driver);
        LoginPage.DisableNotifications();
        LoginPage.sendCredentials(driver);
    }


}
