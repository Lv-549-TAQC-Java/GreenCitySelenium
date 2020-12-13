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

    public void verifyItemCategoryName(){
       String actualItemCategoryName = newsItemPage.getItemCategoryTag().getText();
       String correctItemCategoryName = "Education";
        Assert.assertEquals(actualItemCategoryName,correctItemCategoryName);
    }

    public void verifyItemDate(){
        String actualItemDate = newsItemPage.getDateInfo().getText();
        String correctItemDate = "Dec 9, 2020";
        Assert.assertEquals(actualItemDate,correctItemDate);
    }

}
