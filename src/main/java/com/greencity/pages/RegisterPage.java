package com.greencity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage{
    private WebElement email;
    private WebElement firstName;
    private WebElement password;
    private WebElement repeatPassword;
    private WebElement submitButton;

    public WebElement getEmail() {
        return email = driver.findElement(By.id("email"));
    }

    public WebElement getFirstName() {
        return firstName = driver.findElement(By.id("firstName"));
    }

    public WebElement getPassword() {
        return password = driver.findElement(By.id("password"));
    }

    public WebElement getRepeatPassword() {
        return repeatPassword = driver.findElement(By.id("repeatPassword"));
    }

    public WebElement getSubmitButton() {
        return submitButton = driver.findElement(By.xpath(".//*[@type='submit']"));
    }
}
