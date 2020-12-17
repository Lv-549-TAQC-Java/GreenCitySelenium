package com.greencity.pageelements;

import com.greencity.locators.BaseLocator;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Button extends BaseElement {

    public Button(WebDriver driver, BaseLocator locator) {
        super(driver, locator);
    }

    public Button(WebElement webElement, BaseLocator locator) {
        super(webElement, locator);
    }

    public Button(WebElement webElement) {
        super(webElement);
    }

    public void click() {
        while (!(webElement.isDisplayed() && webElement.isEnabled())) ;
        this.webElement.click();
    }

    public String getText() {
        return webElement.getText();
    }

    public String getAttribute(String str) {
        return webElement.getAttribute(str);
    }

    public boolean isClickable() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(this.webElement));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
}
