package com.test.assignment;

import org.openqa.selenium.WebDriver;

public class LoginPageAction extends LoginPageObject {
    public void clickOnLogin(WebDriver driver) {
        driver.findElement(loginObj).click();
    }

    public void fillLoginForm(WebDriver driver) {
        driver.findElement(loginNameBoxObj).sendKeys("Sonaly8");
        driver.findElement(loginPassBoxObj).sendKeys("password");
    }

    public void clickOnLoginButton(WebDriver driver) {
        driver.findElement(loginButtonObj).click();
    }
}
