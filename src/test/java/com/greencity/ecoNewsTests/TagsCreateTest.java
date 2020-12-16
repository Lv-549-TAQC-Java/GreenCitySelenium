package com.greencity.ecoNewsTests;

import com.greencity.enums.FiltersTeg;
import com.greencity.locators.HeaderPageLocators;
import com.greencity.steps.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class TagsCreateTest extends BaseTest {

    @BeforeMethod
    public void beforeTest() {
        MainPageBL mainPageBL = new MainPageBL(driver);
        mainPageBL.getHeaderPageBL()
                .clickOnSignInButton()
                .putEmail()
                .putPassword()
                .clickOnSingIn();
    }

    @Test
    public void createNewsTagTest() {
        HeaderPageBL headerPageBL = new HeaderPageBL(driver);
        CreateNewsPageBL clickOnTag = headerPageBL
                .isClickable(HeaderPageLocators.ECO_NEWS_BUTTON)
                .clickOnEcoNewsButton()
                .clickOnCreateNewsButton()
                .clickOnTagCreateButton(FiltersTeg.NEWS);
        Assert.assertTrue(clickOnTag.isTagActive(FiltersTeg.NEWS));

        clickOnTag.clickOnTagCreateButton(FiltersTeg.NEWS);
        Assert.assertFalse(clickOnTag.isTagActive(FiltersTeg.NEWS));

        clickOnTag.clickOnTagCreateButton(FiltersTeg.NEWS);
        Assert.assertTrue(clickOnTag.isTagActive(FiltersTeg.NEWS));

    }
}
