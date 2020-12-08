package com.greencity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CreateNewsPage extends BasePage{
    //private WebElement tagButtonsCreate;
    private WebElement CreateNews;

    public CreateNewsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCreateNews() {
        return CreateNews = driver
                .findElement(By.cssSelector("a div"));
    }





}
