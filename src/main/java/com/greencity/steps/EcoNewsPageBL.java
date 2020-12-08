package com.greencity.steps;

import com.greencity.pages.EcoNewsPage;
import com.greencity.pages.components.NewsItemComponent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EcoNewsPageBL {
    protected WebDriver driver;
    private EcoNewsPage ecoNewsPage;
    public EcoNewsPageBL(WebDriver driver){
        this.driver = driver;
        ecoNewsPage = new EcoNewsPage(driver);
    }

    public int numbOfNewsItemOnThePage() {
        return ecoNewsPage.getNewsItemComponentList().getNumbOfNewsItemOnThePage();
    }

    public EcoNewsPageBL scrollToWebElement(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,element);
        return new EcoNewsPageBL(driver);
    }
    public NewsItemComponent getItemNewsByTitle(String title){
       return ecoNewsPage.getNewsItemComponentList().findNewsItemByTitle(title);
    }
}
