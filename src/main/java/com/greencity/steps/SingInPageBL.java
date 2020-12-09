package com.greencity.steps;

import com.greencity.pages.SingInPage;
import org.openqa.selenium.WebDriver;
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
        singInPage.getEmailForm().sendKeys("mishakaspar@gmail.com");
        return new SingInPageBL(driver);
    }

    public SingInPageBL putPassword(){
        singInPage.getPasswordForm().clear();
        singInPage.getPasswordForm().sendKeys(getPassword());
        return new SingInPageBL(driver);
    }

    public HeaderPageBL clickOnSingIn(){
        singInPage.getSingIn().click();
        return new HeaderPageBL(driver);
    }


}
