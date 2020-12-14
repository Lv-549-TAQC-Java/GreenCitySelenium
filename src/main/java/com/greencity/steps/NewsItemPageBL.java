package com.greencity.steps;

import com.greencity.pages.NewsItemPage;
import org.openqa.selenium.WebDriver;

public class NewsItemPageBL {
    protected WebDriver driver;
    private NewsItemPage newsItemPage;

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

    public String getItemAuthorName() {
        return newsItemPage.getAuthorInfo().getText();
    }
}
