package com.greencity.pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseElement {
    protected WebDriver driver;
    public WebElement webElement;
    protected String cssSelector;

    public BaseElement(WebDriver driver,String cssSelector){
        this.driver=driver;
        this.cssSelector = cssSelector;
        webElement = driver.findElement(By.cssSelector(cssSelector));
    }

}
