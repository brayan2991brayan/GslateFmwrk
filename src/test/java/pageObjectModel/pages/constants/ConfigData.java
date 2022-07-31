package pageObjectModel.pages.constants;

public class ConfigData {

    //Implicit Wait Seconds
    public static int ImplicitWait = 3;

    //Waits
    public static class TimeOutSeconds
    {
        public static int One = 1;
        public static int Five = 5;
        public static int Ten = 10;
        public static int Fifteen = 15;
        public static int Thirty = 30;
        public static int Sixty = 60;
        public static int Hundred = 100;
        public static int ThreeHundred = 300;
    }

    //Urls
    public static String environmentAppCopy_Url = "https://app.gslate.com/";

    //Chrome Arguments
    public static class ChromeOptionsArgument
    {
        public static String StartMaximized = "--start-maximized";
        public static String EnableAutomation = "--enable-automation";
        public static String NoSandbox = "--no-sandbox";
        public static String DisableDevShm = "--disable-dev-shm-usage";
        public static String Headless = "--headless";
        public static String IgnoreSSLErrors = "--ignore-ssl-errors=yes";
        public static String IgnoreCertificateErrors = "--ignore-certificate-errors";
        public static String DisableNotification = "--disable-notifications";
    }
}
