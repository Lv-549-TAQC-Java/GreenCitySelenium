package com.greencity.pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownList extends BaseElement {

    public DropDownList(WebDriver driver, String cssSelector) {
        super(driver, cssSelector);
    }

    public void click(){
        webElement.click();
    }

    public void selectByVisibleText(String text){
        List<WebElement> options = driver.findElements(By.cssSelector("li"));
        for (WebElement opt : options) {
            if (opt.getText().equals(text)) {
                opt.click();
                return;
            }
        }

    }

}
