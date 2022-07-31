package pageObjectModel.data;

import org.testng.annotations.DataProvider;

public class LoginTestData {
    @DataProvider(name = "data-emails-login-regression")
    public static Object[][] dataSetRegression(){
        Object[][] obj = {
                {"fakeUser", "fake_Password"},
                {"fakeUser", "fakeUser"}
        };
        return obj;
    }
    @DataProvider(name = "data-emails-login-smoke")
    public static Object[][] dataSetSmoke(){
        Object[][] obj = {
                {"fakeUser", "fakeUser"},
        };
        return obj;
    }
}
