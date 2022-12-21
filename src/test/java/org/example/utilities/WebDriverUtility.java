package org.example.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtility {
    public static WebDriver getDriver(){
        System.setProperty("chrome.driver", "src/test/java/org/example/utilities/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        return driver;
    }
}
