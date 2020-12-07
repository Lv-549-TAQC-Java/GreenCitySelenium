package com.greencity.steps;

import com.greencity.pages.SingInPage;
import org.openqa.selenium.WebDriver;

public class SingInPageBL {
    private SingInPage singInPage;
    protected WebDriver driver;


    public SingInPageBL(WebDriver driver){
        this.driver = driver;
        singInPage = new SingInPage(driver);
    }

    public SingInPageBL putEmail(){
        singInPage.getEmailForm().sendKeys("mishakaspar@gmail.com");
        return new SingInPageBL(driver);
    }

    public SingInPageBL putPassword(){

        singInPage.getPasswordForm().sendKeys(PASSWORD);
        return new SingInPageBL(driver);
    }

    public SingInPageBL clickOnSingInButton(){
        singInPage.getSingInButton().click();
        return new SingInPageBL(driver);
    }


}
