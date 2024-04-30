package org.example;

import org.openqa.selenium.By;

public class EmailAFriendPage extends Utils{
   static LoadPage loadPage=new LoadPage();
    //store the friends email id
    public static String friendEmail = loadPage.getProperty("firstFriendEmail")+ Date() + loadPage.getProperty("lastPartEmail");
    public void EnterReferralDetail (){
        //Enter Friend's email
        sendKeyElement(By.xpath("//input[@class='friend-email']"),friendEmail);
        //enter Your email address
        sendKeyElement(By.xpath("//input[@class='your-email']"),"");
        //enter Personal message
        sendKeyElement(By.xpath("//textarea[@name='PersonalMessage']"),loadPage.getProperty("personalMessage"));
        //click on Send email button
        clickOnElement(By.xpath("//button[@name='send-email']"));
    }
}
