package com.test.assignment;

import org.openqa.selenium.By;

public class LoginPageObject {

    public By loginObj = By.id("login2");
    public By loginNameBoxObj = By.id("loginusername");
    public By loginPassBoxObj = By.id("loginpassword");
    public By loginButtonObj = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
}