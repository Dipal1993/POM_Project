package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Text;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
public class Utils extends BasePage{
    //clickOnElement method
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }
    //SendKeyElement method
    public static void sendKeyElement(By by,String Text){
        driver.findElement(by).sendKeys(Text);
    }
    //GettextElement method
    public static String getText(By by){
        return driver.findElement(by).getText();
    }
    //timestamp
    public static String Date() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
        Date date = new Date();
        return dateFormat.format(date);
}
// selectByVisibleText for day
       public static void selectByVisibleText(By by,String Text){
        Select day = new Select(driver.findElement(by));
        day.selectByVisibleText(Text);
    }
// selectBYIndex method for month
    public static void selectBYIndex(By by, int Text){
        Select month = new Select(driver.findElement(by));
        month.selectByIndex(Text);
    }
    // selectByValue method for month
    public static void selectByValue(By by,String Text){
        Select year = new Select(driver.findElement(by));
        year.selectByValue(Text);
    }
}
