package com.greencity.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ScrollPageDown {
    protected WebDriver driver;

    public ScrollPageDown(WebDriver driver) {
        this.driver = driver;
    }

    public ScrollPageDown scrollToEndOfPage() {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        while (true) {
            try {
                driver.findElement(By.cssSelector("div.description__title > h2"));
                break;
            } catch (Exception exception) {
                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return this;
    }
}
