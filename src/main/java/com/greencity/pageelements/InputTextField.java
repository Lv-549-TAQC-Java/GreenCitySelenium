package com.greencity.pageelements;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputTextField extends BaseElement {

    public InputTextField(WebDriver driver, BaseLocator locator) {
        super(driver,locator );
    }

    public InputTextField(WebElement webElement, BaseLocator locator) {
        super(webElement, locator);
    }

    public InputTextField(WebElement webElement) {
        super(webElement);
    }

    public void click() {
        webElement.click();
    }

    public void clear() {
        webElement.clear();
    }

    public void sendText(String text){
        webElement.sendKeys(text);
    }
}
