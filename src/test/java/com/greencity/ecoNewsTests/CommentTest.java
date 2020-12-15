package com.greencity.ecoNewsTests;

import com.greencity.steps.EcoNewsPageBL;
import com.greencity.steps.MainPageBL;
import com.greencity.steps.NewsItemPageBL;
import org.testng.annotations.Test;

public class CommentTest extends BaseTest {
    @Test
    public void addComment() {
        MainPageBL mainPageBL = new MainPageBL(driver);
        NewsItemPageBL ecoNewsPageBL = mainPageBL
                .getHeaderPageBL()
                .clickOnSignInButton()
                .putEmail()
                .putPassword()
                .clickOnSingIn()
                .clickOnEcoNewsButton()
                .clickOnItemNewsById(0)
                .putComment()
                .clickOnCommentButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
