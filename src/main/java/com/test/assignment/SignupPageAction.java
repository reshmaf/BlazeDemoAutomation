package com.test.assignment;

import org.openqa.selenium.WebDriver;

public class SignupPageAction extends SignupPageObject {

    public void clickOnSignup(WebDriver driver) {
        driver.findElement(signupObj).click();
    }

    public void fillSignupForm(WebDriver driver) {
        driver.findElement(nameBoxObj).sendKeys("Sonaly8");
        driver.findElement(passBoxObj).sendKeys("password");
    }

    public void clickOnSignupButton(WebDriver driver) {

        driver.findElement(signupButtonObj).click();
    }
}
