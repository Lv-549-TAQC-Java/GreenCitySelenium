package com.greencity.pageelements;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Link extends BaseElement{
    public Link(WebDriver driver, BaseLocator locator) {
        super(driver, locator);
    }

    public Link(WebElement webElement, BaseLocator locator) {
        super(webElement, locator);
    }

    public Link(WebElement webElement) {
        super(webElement);
    }

    public void click(){
        this.webElement.click();
    }

    public String getLinkPath(){
        return webElement.getAttribute("href");
    }
}
