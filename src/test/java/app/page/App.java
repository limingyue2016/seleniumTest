package app.page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class App {
    public AndroidDriver driver;

    public MainPage start() {
        driver = setDriver();
        return new MainPage(driver);
    }

    public void quit() {
        driver.quit();
    }

    //初始化apk配置
    public DesiredCapabilities setCa() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "zlizk7bi7pjfyhvc");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10.0");
        capabilities.setCapability("appPackage", "com.tencent.wework");
        capabilities.setCapability("appActivity", ".launch.WwMainActivity");
        capabilities.setCapability("noReset", true);
        return capabilities;
    }

    //初始化driver
    public AndroidDriver setDriver() {
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), this.setCa());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

}