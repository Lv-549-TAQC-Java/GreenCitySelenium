package com.greencity.pages;

import com.greencity.pages.components.NewsItemComponentList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

    public EcoNewsPage scrollToEndOfPage(){
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        while (true) {
            try {
                driver.findElement(By.cssSelector("div.description__title > h2"));
                break;
            } catch (Exception exception) {
                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return new EcoNewsPage(driver);
    }

}
