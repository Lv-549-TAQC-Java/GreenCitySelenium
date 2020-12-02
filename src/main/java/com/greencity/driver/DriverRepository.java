package com.greencity.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverRepository {
    public final static ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();
    public static WebDriver webDriver;

    private DriverRepository() {
    }

    public static void downloadWebDriver() {
        WebDriverManager.chromiumdriver().setup();
    }

    public static void instanceWebBrowser() {
        webDriver = new ChromeDriver();
        DRIVERS.set(webDriver);
        webDriver.manage().window().maximize();
    }

    public static void closeBrowser() {
        webDriver.quit();
    }
}
