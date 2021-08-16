package com.test.assignment;

import org.openqa.selenium.By;

public class SignupPageObject {
    public By signupObj = By.id("signin2");
    public By nameBoxObj = By.id("sign-username");
    public By passBoxObj = By.id("sign-password");
    public By signupButtonObj = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
}
