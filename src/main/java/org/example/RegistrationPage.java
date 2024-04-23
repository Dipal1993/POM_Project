package org.example;
import org.openqa.selenium.By;
public class RegistrationPage extends Utils{
    public static String Email = "Anuja" + Date() + "@gmail.com";
    //Make variable to store password
    public static String Password = "Anuja@" + Date() + "3452";
    public void fillRegistrationDetails(){
        //select the Female Gender
        clickOnElement(By.id("gender-female"));
        // enter the first name
        sendKeyElement(By.name("FirstName"),"Anuja");
        //enter the last name
        sendKeyElement(By.name("LastName"),"Patel");
        //select the Day for Date of birth
        selectByVisibleText(By.xpath("//select[@name='DateOfBirthDay']"),"9");
        //select the Month for Date of birth
        selectBYIndex(By.xpath("//select[@name='DateOfBirthMonth']"),4);
        //select the Year for Date of birth
        selectByValue(By.xpath("//select[@name='DateOfBirthYear']"),"1925");
        //enter the Email-id
        sendKeyElement(By.xpath("//input[@id='Email']"),Email);
        //enter the password
        sendKeyElement(By.xpath("//input[@id='Password']"),Password);
        //enter the confirmation password
        sendKeyElement(By.xpath("//input[@id='ConfirmPassword']"),Password);
        //click on Register-submit button
        clickOnElement(By.xpath("//button[@id='register-button']"));
    }
}
