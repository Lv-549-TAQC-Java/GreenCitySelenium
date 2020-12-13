package com.greencity.pageelements;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Image extends BaseElement {

    public Image(WebDriver driver, BaseLocator locator) {
        super(driver,locator );
    }

    public Image(WebElement webElement, BaseLocator locator) {
        super(webElement, locator);
    }

    public Image(WebElement webElement) {
        super(webElement);
    }

    public void click(){
        webElement.click();
    }
    public String getImageSource(){
        return webElement.getAttribute("src");
    }
}
