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
        System.out.println(newsItem.getCreatedDate());
        String s = newsItem.getCreatedDate().getText();
        System.out.println(s);
        NewsItemPageBL newsItemPageBL = ecoNewsPageBL.clickOnItemNewsByTitle("Trump accepts US presidency transition");
        String s1 = newsItemPageBL.getCreatedDate();
        System.out.println(s1);
        Assert.assertEquals(s1, s);

    }
}
