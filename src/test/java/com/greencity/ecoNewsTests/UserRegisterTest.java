package com.greencity.ecoNewsTests;

import com.greencity.steps.MainPageBL;
import com.greencity.steps.RegisterPageBL;
import org.testng.annotations.Test;

public class UserRegisterTest extends BaseTest {
    @Test
    public void registerUserWithValidParameters() {

        MainPageBL mainPageBL = new MainPageBL(driver);
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnSignUpButton()
                .registerNewPerson();
        registerPageBL.verifyUserRegistration();
    }
}
