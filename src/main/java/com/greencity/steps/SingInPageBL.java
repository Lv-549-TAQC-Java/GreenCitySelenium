package com.greencity.steps;

import com.greencity.locators.HeaderPageLocators;
import com.greencity.pageelements.Button;
import com.greencity.pages.SingInPage;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.util.Properties;

public class SingInPageBL {
    private SingInPage singInPage;
    protected WebDriver driver;

    public SingInPageBL(WebDriver driver) {
        this.driver = driver;
        singInPage = new SingInPage(driver);
    }

    private String getPassword() {
        final Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("src/main/resources/password.properties"));
            String password = prop.getProperty("eco.news.password");
            return password;
        } catch (Exception error) {
            System.out.println("File password not found");
        }
        return null;
    }

    public SingInPageBL putEmail(){
        singInPage.getEmailForm().clear();
        singInPage.getEmailForm().sendText("mishakaspar@gmail.com");
        return new SingInPageBL(driver);
    }

    public SingInPageBL putPassword(){
        singInPage.getPasswordForm().clear();
        singInPage.getPasswordForm().sendText(getPassword());
        return new SingInPageBL(driver);
    }

    public HeaderPageBL clickOnSingIn(){
        singInPage.getSingIn().click();
        return new HeaderPageBL(driver);
    }

    public HeaderPageBL isClickable(){
       // WebDriverWait webDriverWait = new WebDriverWait(driver, 3);
        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(HeaderPageLocators.ECO_NEWS_BUTTON.getPath()));
            System.out.println("Element is clickable");
        }
        catch(TimeoutException e) {
            System.out.println("Element isn't clickable");
        }
        return new HeaderPageBL(driver);
    }
}