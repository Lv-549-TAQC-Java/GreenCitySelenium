package com.greencity.ecoNewsTests;

import com.greencity.pages.components.NewsItemComponent;
import com.greencity.steps.EcoNewsPageBL;
import com.greencity.steps.MainPageBL;
import com.greencity.steps.NewsItemPageBL;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DateCreatedTest extends BaseTest {

    @Test
    public void createdDate(){
        EcoNewsPageBL ecoNewsPageBL = new MainPageBL(driver).getHeaderPageBL().clickOnEcoNewsButton();
        NewsItemComponent newsItem = ecoNewsPageBL.findNewsItemByTitle("Trump accepts US presidency transition");
        Assert.assertEquals("Nov 24, 2020",newsItem.getCreatedDate().getText());
        NewsItemPageBL newsItemPageBL = ecoNewsPageBL.clickOnItemNewsByTitle("Trump accepts US presidency transition");
        Assert.assertEquals("Nov 24, 2020", newsItemPageBL.getCreatedDate());
    }
}
