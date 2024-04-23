package org.example;
import org.openqa.selenium.By;
public class LoginPage extends Utils{
    public void verifyTheLoginFunctionality(){
        //access the email variable of RegistrationPage by using class name and enter the email id
        sendKeyElement(By.xpath("//input[@class='email']"),RegistrationPage.Email);
        //access the password variable of RegistrationPage by using class name and enter password
        sendKeyElement(By.xpath("//input[@class='password']"),RegistrationPage.Password);
        //click on login button
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
    }
}
