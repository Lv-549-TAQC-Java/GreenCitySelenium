package com.greencity.utils;

import com.greencity.steps.EcoNewsPageBL;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollPageToTheWebElement {
    public EcoNewsPageBL scrollToWebElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();"
                , element);
        return new EcoNewsPageBL(driver);
    }
}
