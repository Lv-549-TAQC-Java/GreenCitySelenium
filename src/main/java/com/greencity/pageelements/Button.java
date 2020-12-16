package com.greencity.pageelements;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button extends BaseElement{

    public Button(WebDriver driver, BaseLocator locator) {
        super(driver,locator );
    }

    public Button(WebElement webElement, BaseLocator locator) {
        super(webElement, locator);
    }

    public Button(WebElement webElement) {
        super(webElement);
    }

    public void click(){
        this.webElement.click();
    }

    public void isDisplayed(){
        webElement.isDisplayed();
    }

    public String getText(){
       return webElement.getText();
    }

    public String getAttribute(String str) {
         return webElement.getAttribute(str);
    }
}
