package com.greencity.ecoNewsTests;

import com.greencity.pages.components.NewsItemComponent;
import com.greencity.steps.EcoNewsPageBL;
import com.greencity.steps.MainPageBL;
import com.greencity.steps.NewsItemPageBL;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorsNameTest extends BaseTest {
    @Test
    public void authorsName() {
        EcoNewsPageBL ecoNewsPageBL = new MainPageBL(driver).getHeaderPageBL().clickOnEcoNewsButton();
        NewsItemComponent newsItem = ecoNewsPageBL.findNewsItemByTitle("У академії IT");
        ecoNewsPageBL.scrollToWebElement(newsItem.getImg());
        Assert.assertEquals("temp", newsItem.getAuthor().getText());
        NewsItemPageBL newsItemPage = ecoNewsPageBL.clickOnItemNewsByTitle("У академії IT");
        Assert.assertEquals("by temp", newsItemPage.getItemAuthorName());
    }
}
