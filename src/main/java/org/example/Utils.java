package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Text;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Year;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    //implicit wait
    public static void implicitWait()
    {
        // Set the implicit wait time for the driver
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    //explicit wait method for visibilityOfElement
    public static void explicitWaitMethod(By by)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }
}
