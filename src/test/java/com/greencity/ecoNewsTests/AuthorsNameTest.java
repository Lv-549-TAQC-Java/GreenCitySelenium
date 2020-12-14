package com.greencity.ecoNewsTests;

import com.greencity.pages.components.NewsItemComponent;
import com.greencity.steps.EcoNewsPageBL;
import com.greencity.steps.MainPageBL;
import org.testng.annotations.Test;

public class AuthorsNameTest extends BaseTest{
    @Test
    public void authorsName(){
        EcoNewsPageBL ecoNewsPageBL=new MainPageBL(driver).getHeaderPageBL().clickOnEcoNewsButton();
        NewsItemComponent newsItem = ecoNewsPageBL.findNewsItemByTitle("У академії ІТ");
        ecoNewsPageBL.
    }
}
