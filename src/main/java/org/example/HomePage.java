package org.example;
import org.openqa.selenium.By;
    public class HomePage extends Utils{
        //click on Register button
    public void clickOnRegisterButton()
    {
        //click on register button
        clickOnElement(By.linkText("Register"));
    }
        //click on login button
    public void clickOnLoginButton(){

        clickOnElement(By.xpath("//a[@class='ico-login']"));
    }
        //click on Electronics category
    public  void clickOnElectronics(){
        clickOnElement(By.linkText("Electronics"));
    }
    //click on Build Your Own Computer
    public void  clickOnBuildYourOwnComputer(){
        clickOnElement(By.linkText("Build your own computer"));
    }
}
