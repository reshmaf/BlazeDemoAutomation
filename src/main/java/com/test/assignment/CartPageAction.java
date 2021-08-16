package com.test.assignment;

import org.openqa.selenium.WebDriver;

public class CartPageAction extends CartPageObject {

    public void clickOnCart(WebDriver driver) {
        driver.findElement(cartObj).click();
    }

    public void clickOnPlaceOrderButton(WebDriver driver) {
        driver.findElement(placeOrderObj).click();
    }

    public void fillOrderForm(WebDriver driver) {
        driver.findElement(nameOrderObj).sendKeys("Reshma");
        driver.findElement(countryOrderObj).sendKeys("India");
        driver.findElement(cityOrderObj).sendKeys("Chennai");
        driver.findElement(cardOrderObj).sendKeys("367889");
        driver.findElement(monthOrderObj).sendKeys("09");
        driver.findElement(yearOrderObj).sendKeys("2022");
        driver.findElement(purchaseObj).click();
    }

    public void clickOkButton(WebDriver driver) {
        driver.findElement(okButtonObj).click();
    }
}
