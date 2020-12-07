package com.greencity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SingInPage extends BasePage {

    private WebElement emailForm;
    private WebElement passwordForm;
    private WebElement singInButton;


    public SingInPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getEmailForm() {
        WebElement emailForm = driver.findElement(By.id("email"));
        return emailForm;
    }

    public WebElement getPasswordForm() {
        WebElement passwordForm = driver.findElement(By.id("password"));
        return passwordForm;
    }

    public WebElement getSingInButton() {
        WebElement singInButton = driver.findElement(By.cssSelector("form button"));
        return singInButton;
    }






}


