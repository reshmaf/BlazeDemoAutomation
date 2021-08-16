package com.test.assignment;

import org.openqa.selenium.By;

public class CartPageObject {
    public By cartObj = By.id("cartur");
    public By placeOrderObj = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
    public By nameOrderObj = By.id("name");
    public By countryOrderObj = By.id("country");
    public By cityOrderObj = By.id("city");
    public By cardOrderObj = By.id("card");
    public By monthOrderObj = By.id("month");
    public By yearOrderObj = By.id("year");
    public By purchaseObj = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    public By okButtonObj = By.xpath("/html/body/div[10]/div[7]/div/button");
}
