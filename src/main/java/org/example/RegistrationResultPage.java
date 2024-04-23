package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;
import static org.example.Utils.getText;
public class RegistrationResultPage extends Utils {
    String expected = "Your registration completed";
    public void verifyRegistrationCompleted(){
        String Actual = getText(By.className("result"));
        Assert.assertEquals(Actual,expected,"You are not Register Successfully");
        //click on continue button
        clickOnElement(By.xpath("//a[@class='button-1 register-continue-button']"));
    }
}
