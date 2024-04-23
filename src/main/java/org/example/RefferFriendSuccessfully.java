package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RefferFriendSuccessfully extends Utils {

    String expectedresult = "Your message has been sent.";

    public void verifyReferFriendResult(){
        String actualOutCome = getText(By.xpath("//div[@class='result']"));
        Assert.assertEquals(actualOutCome,expectedresult,"You can not refer friend.");


    }
}
