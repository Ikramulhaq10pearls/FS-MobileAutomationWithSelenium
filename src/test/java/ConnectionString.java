import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ConnectionString {

    AppiumDriver driver;

    @BeforeTest
    public void initializer() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName","emulator-5554");
        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("app", System.getProperty("user.dir") + "/app/ApiDemos-debug.apk");

        driver = new AndroidDriver(new URL("http://localhost:4723"),cap);
        System.out.println("Opening Appium Server");

    }

    @Test
    public  void sampleTest(){
        System.out.println("This is my First Test");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
