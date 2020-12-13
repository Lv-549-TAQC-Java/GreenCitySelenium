package com.greencity.steps;

import com.greencity.pageelements.Button;
import com.greencity.pages.CreateNewsPage;
import com.greencity.pages.EcoNewsPage;
import com.greencity.pages.components.NewsItemComponent;
import com.greencity.utils.ScrollPageDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;

public class EcoNewsPageBL {
    protected WebDriver driver;
    private EcoNewsPage ecoNewsPage;
    private CreateNewsPage createNewsPage;

    public EcoNewsPageBL(WebDriver driver) {
        this.driver = driver;
        createNewsPage = new CreateNewsPage(driver);
        ecoNewsPage = new EcoNewsPage(driver);
    }

    public EcoNewsPageBL clickOnFilterTagButton(FiltersTeg filterTeg) {
        List<Button> filterTegList = ecoNewsPage.getFilterTegList();
        for (Button teg : filterTegList)
            if (teg.getText().equals(filterTeg)) {
                teg.click();
            }
        return new EcoNewsPageBL(driver);
    }


    public CreateNewsPageBL clickOnCreateNewsButton() {
        ecoNewsPage.getCreateNews().click();
        return new CreateNewsPageBL(driver);
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

    //need to delete
    public NewsItemPageBL clickOnItemNews(){
        driver.findElement(By.cssSelector("li:nth-of-type(1) > .ng-star-inserted > .list-gallery")).click();
        return new NewsItemPageBL(driver);
    }
}
