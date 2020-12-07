package com.greencity.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Properties;

public class BasePage {
    public Properties prop;
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }




}
