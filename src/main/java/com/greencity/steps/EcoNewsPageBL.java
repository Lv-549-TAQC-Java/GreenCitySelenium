package com.greencity.steps;

import com.greencity.pages.EcoNewsPage;
import com.greencity.pages.components.NewsItemComponent;
import com.greencity.utils.ScrollPageDown;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EcoNewsPageBL {
    protected WebDriver driver;
    private EcoNewsPage ecoNewsPage;

    public EcoNewsPageBL(WebDriver driver) {
        this.driver = driver;
        ecoNewsPage = new EcoNewsPage(driver);
    }

    public void verifySearchOfTheList() {
        Assert.assertTrue(findListOfEcoNewsItem());
    }

    public boolean findListOfEcoNewsItem() {
        new ScrollPageDown(driver).scrollToEndOfPage();
        if (!(ecoNewsPage.getNewsList().size() > 0)) {
            return false;
        }
        return true;
    }

    public int getNumbOfNewsItemOnThePage() {
        return ecoNewsPage.getNewsList().size();
    }

    /* Further we can use this methods from here or create FindItemsPageBL*/
    public NewsItemComponent findNewsItemByIndex(int index) {
        return ecoNewsPage.getNewsList().get(index);
    }

    public NewsItemComponent findNewsItemByTitle(String title) {
        for (NewsItemComponent newsItem : ecoNewsPage.getNewsList()) {
            if (newsItem.getTitle().getText().equals(title)) {
                return newsItem;
            }
        }
        throw new RuntimeException("there is no news on the page with such a title-" + title);
    }

    public CreateNewsPageBL clickOnCreateNewsButton(){
        ecoNewsPage.getCreateNewsButton().click();
        return new CreateNewsPageBL(driver);
    }

}
