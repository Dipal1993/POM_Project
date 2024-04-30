package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends Utils{
    //create object of loadPage
    static LoadPage loadPage=new LoadPage();
    public static String Email = loadPage.getProperty("firstPartEmail") + Date() + loadPage.getProperty("lastPartEmail");
    //Make variable to store password
    public static String Password = loadPage.getProperty("firstname") + Date() + "3452";
    public void fillRegistrationDetails(){
        // use the explicit wait method for checking the title of a page
        titleIs("nopCommerce demo store. Register");
        //select the Female Gender
        clickOnElement(By.id("gender-female"));
        //takeScreenShort("gender");
        // enter the first name
        sendKeyElement(By.name("FirstName"),loadPage.getProperty("firstname"));
        //enter the last name
        sendKeyElement(By.name("LastName"),loadPage.getProperty("lastname"));
        //select the Day for Date of birth
        selectByVisibleText(By.xpath("//select[@name='DateOfBirthDay']"),loadPage.getProperty("day"));
        //select the Month for Date of birth
        selectByVisibleText(By.xpath("//select[@name='DateOfBirthMonth']"),loadPage.getProperty("month"));
        //select the Year for Date of birth
        selectByValue(By.xpath("//select[@name='DateOfBirthYear']"),loadPage.getProperty("year"));
        //enter the Email-id
        sendKeyElement(By.xpath("//input[@id='Email']"),Email);
        //enter the password
        sendKeyElement(By.xpath("//input[@id='Password']"),Password);
        //enter the confirmation password
        sendKeyElement(By.xpath("//input[@id='ConfirmPassword']"),Password);
        //checking an element is visible and enabled such that can click it.
        elementToBeClickable(By.xpath("//button[@id='register-button']"));
        //click on Register-submit button
        clickOnElement(By.xpath("//button[@id='register-button']"));
    }
}
