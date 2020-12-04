package com.greencity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CreateNewsPage extends BasePage{
    private WebElement tagButtonsCreate;

    public CreateNewsPage(WebDriver driver) {
        super(driver);
    }
    public  List<WebElement> getTagButtonsCreate() {
        WebElement button = driver
                .findElement(By.tagName("button"));
         List<WebElement> tagButtonsCreate = button.findElements(By.className("ng-star-inserted"));
         System.out.println("tagButtons size:" + tagButtonsCreate.size());
         return tagButtonsCreate;
    }






}
