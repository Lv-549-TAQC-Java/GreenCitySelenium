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
            prop.load(new FileInputStream("src/main/resources/singIn.properties"));
            String password = prop.getProperty("eco.news.password");
            return password;
        } catch (Exception error) {
            System.out.println("Password not found in file");
        }
        return null;
    }

    private String getEmail() {
        final Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("src/main/resources/singIn.properties"));
            String email = prop.getProperty("eco.news.email");
            return email;
        } catch (Exception error) {
            System.out.println("Email not found in file");
        }
        return null;
    }

    public SingInPageBL putEmail(){
        singInPage.getEmailForm().clear();
        singInPage.getEmailForm().sendText(getEmail());
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
}