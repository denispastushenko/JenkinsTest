import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BeforeTest {
    public static final String site = "https://www.google.com.ua/";
    protected HomePage homePage;
    protected TestPage testPage;
    protected  AssertPage assertPage;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denys\\Desktop\\chromedriver_win32\\chromedriver.exe");
        homePage = new HomePage(new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"), DesiredCapabilities.chrome()));
        Page.getDriver().manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        if (Page.getDriver() != null) {
            Page.getDriver().quit();
        }

    }
}
