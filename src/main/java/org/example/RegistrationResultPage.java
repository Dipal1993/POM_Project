package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;
public class RegistrationResultPage extends Utils {
    LoadPage loadPage = new LoadPage();
    String expected =loadPage.getProperty("expectedResult");
    public void verifyRegistrationCompleted(){
        String Actual = getText(By.className("result"));
        //assertEquals for compare the actual and expected result if its fail then print message
        Assert.assertEquals(Actual,expected,"You are not Register Successfully");
        //click on continue button
        clickOnElement(By.xpath("//a[@class='button-1 register-continue-button']"));
    }
}
