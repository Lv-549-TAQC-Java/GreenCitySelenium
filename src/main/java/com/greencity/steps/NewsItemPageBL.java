package com.greencity.steps;

import com.greencity.pages.NewsItemPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NewsItemPageBL {
    private NewsItemPage newsItemPage;
    protected WebDriver driver;

    public NewsItemPageBL(WebDriver driver) {
        this.driver = driver;
        newsItemPage = new NewsItemPage(driver);
    }

    public EcoNewsPageBL clickOnBackToNewsButton() {
        newsItemPage.getBackToNewsButton().click();
        return new EcoNewsPageBL(driver);
    }

    public String getItemCategoryName() {
        return newsItemPage.getItemCategoryTag().getText();
    }



}
