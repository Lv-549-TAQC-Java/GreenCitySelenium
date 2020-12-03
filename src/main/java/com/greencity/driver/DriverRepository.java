package com.greencity.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverRepository {
    public final static ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();
    public static WebDriver webDriver;

    private DriverRepository() {
    }

    public static void downloadWebDriver() {
        WebDriverManager.firefoxdriver().setup();
    }

    public static void instanceWebBrowser() {
        webDriver = new FirefoxDriver();
        DRIVERS.set(webDriver);
        webDriver.manage().window().maximize();
    }

    public static void closeBrowser() {
        webDriver.quit();
    }
}
