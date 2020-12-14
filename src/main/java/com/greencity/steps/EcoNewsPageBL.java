package com.greencity.steps;

import com.greencity.pageelements.Button;
import com.greencity.pages.CreateNewsPage;
import com.greencity.pages.EcoNewsPage;
import com.greencity.pages.components.NewsItemComponent;
import com.greencity.utils.ScrollPageDown;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public EcoNewsPageBL scrollToWebElement(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,element);
        return new EcoNewsPageBL(driver);
    }

    public NewsItemPageBL clickOnItemNewsByTitle(String title){
        findNewsItemByTitle(title).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new NewsItemPageBL(driver);
    }
}
