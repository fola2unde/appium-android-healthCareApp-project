package utility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.time.Duration;

public class DriverManager {
    private static AppiumDriver driver;

    public static AppiumDriver getDriver() {
        if (driver == null) {
            initializeDriver();
        }
        return driver;
    }

    private static void initializeDriver() {
        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("platformName", "Android");
            cap.setCapability("appium:platformVersion", "15");
            cap.setCapability("appium:deviceName", "sdk_gphone64_x86_64");
            cap.setCapability("appium:udid", "emulator-5554");
            cap.setCapability("appium:automationName", "UiAutomator2");
            cap.setCapability("appium:appPackage", "org.simple.clinic.staging");
            cap.setCapability("appium:appActivity", "org.simple.clinic.setup.SetupActivity");
            cap.setCapability("appium:autoGrantPermissions", true);

            URL url = new URL("http://127.0.0.1:4723/");
            driver = new AndroidDriver(url, cap);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize driver: " + e.getMessage(), e);
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}