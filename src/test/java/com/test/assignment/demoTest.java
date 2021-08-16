package com.test.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demoTest extends BaseClass {

    @Test
    public void launch() throws InterruptedException {

        Assert.assertEquals(driver.getTitle(), "STORE", "Title text expected STORE but found" + driver.getTitle());

        SignupPageAction signupPageAction = new SignupPageAction();
        LoginPageAction loginPageAction = new LoginPageAction();
        CartPageAction cartPageAction = new CartPageAction();

        signupPageAction.clickOnSignup(driver);
        signupPageAction.fillSignupForm(driver);
        signupPageAction.clickOnSignupButton(driver);

        Thread.sleep(5000);
        driver.switchTo().alert().accept();

        loginPageAction.clickOnLogin(driver);
        loginPageAction.fillLoginForm(driver);
        loginPageAction.clickOnLoginButton(driver);

        Thread.sleep(4000);

        WebElement category = driver.findElement(By.linkText("Monitors"));
        category.click();

        driver.findElement(By.linkText("Apple monitor 24")).click();
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();

        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        cartPageAction.clickOnCart(driver);
        cartPageAction.clickOnPlaceOrderButton(driver);
        cartPageAction.fillOrderForm(driver);
        cartPageAction.clickOkButton(driver);

        Thread.sleep(10000);//
        driver.close();
    }
}
