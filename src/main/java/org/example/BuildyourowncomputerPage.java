package org.example;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class BuildyourowncomputerPage extends Utils{
    public void selectSpecificationForComputer(){
        // Set the implicit wait time for the driver
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //select the second option for Processor
        selectByValue(By.cssSelector("select#product_attribute_1"),"2");
        //select second option for RAM
        selectByValue(By.cssSelector("select#product_attribute_2"),"4");
        //select second option for HDD
        clickOnElement(By.cssSelector("input#product_attribute_3_7"));
        //select second option for OS
        clickOnElement(By.xpath("//input[@id='product_attribute_4_9']"));
        //select second option for software
        clickOnElement(By.xpath("//input[@id='product_attribute_5_11']"));
        //Click on Add To Cart button
        clickOnElement(By.xpath("//button[@id='add-to-cart-button-1']"));
        //click on notification
        clickOnElement(By.cssSelector(".close"));
        //click on shopping cart button
        clickOnElement(By.xpath("//span[@class='cart-label']"));
    }
}
