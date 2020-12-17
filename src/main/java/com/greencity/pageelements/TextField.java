package com.greencity.pageelements;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextField extends BaseElement{

    public TextField(WebDriver driver, BaseLocator locator) {
        super(driver,locator );
    }

    public TextField(WebElement webElement, BaseLocator locator) {
        super(webElement, locator);
    }

    public TextField(WebElement webElement) {
        super(webElement);
    }

    public String getText(){
        return webElement.getText();
    }
}
