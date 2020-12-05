package com.greencity.pages;

import com.greencity.pages.components.NewsItemComponentList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EcoNewsPage extends BasePage{
    private WebElement tagButtons;
    private WebElement CreateNews;
    private NewsItemComponentList newsItemComponentList;

    public EcoNewsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getTagButtons() {
         List<WebElement> tagButtons = driver
                .findElements(By.cssSelector("a li"));
        System.out.println("tagButtons size:" + tagButtons.size());
        return tagButtons;
    }

    public WebElement getCreateNews() {
        return CreateNews = driver
                .findElement(By.cssSelector("a div"));
    }


    public NewsItemComponentList getNewsItemComponentList() {
        return new NewsItemComponentList(driver);
    }
}
