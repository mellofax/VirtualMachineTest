package core;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverConfiguration {
    public static void setDriver() {
        Configuration.browserSize = "1700x1100";
        Configuration.headless = false;
        Configuration.timeout = 10000;
        Configuration.baseUrl = "https://www.saucedemo.com";
        Configuration.remote = "http://192.168.31.226:4444/wd/hub";
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setCapability("enableVNC", true);
        cap.setCapability("enableVideo", false);
        Configuration.browserCapabilities = cap;
    }
}
