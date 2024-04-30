package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
public class BuildyourowncomputerPage extends Utils{
    LoadPage loadPage=new LoadPage();
    public void selectSpecificationForComputer(){
        //select the second option for Processor
        selectByValue(By.cssSelector("select#product_attribute_1"),loadPage.getProperty("processorValue"));
        //select second option for RAM
        selectByValue(By.cssSelector("select#product_attribute_2"),loadPage.getProperty("ramValue"));
        //select second option for HDD
        clickOnElement(By.cssSelector("input#product_attribute_3_7"));
        //select second option for OS
        clickOnElement(By.xpath("//input[@id='product_attribute_4_9']"));
        //select second option for software
        clickOnElement(By.xpath("//input[@id='product_attribute_5_11']"));
        presenceOfElementLocated(By.xpath("//button[@id='add-to-cart-button-1']"));
        //Click on Add To Cart button
        clickOnElement(By.xpath("//button[@id='add-to-cart-button-1']"));
        //call the explicitWaitMethod for loading shopping cart button
        visibilityOfElementLocated(By.xpath("//*[@id='bar-notification']/div/p/a"));
        //click on shopping cart button from notification bar
        clickOnElement(By.xpath("//*[@id='bar-notification']/div/p/a"));
    }
}
