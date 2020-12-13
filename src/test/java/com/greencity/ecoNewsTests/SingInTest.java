package com.greencity.ecoNewsTests;

import com.greencity.steps.EcoNewsPageBL;
import com.greencity.steps.HeaderPageBL;
import com.greencity.steps.MainPageBL;
import com.greencity.steps.SingInPageBL;
import org.testng.annotations.Test;

public class SingInTest extends BaseTest {

    @Test
    public void testName() {

        MainPageBL mainPageBL = new MainPageBL(driver);

      HeaderPageBL ecoNewsPageBL = mainPageBL
                .getHeaderPageBL()
                .clickOnSignInButton()
                .putEmail()
                .putPassword()
                .clickOnSingIn();



    }

}
