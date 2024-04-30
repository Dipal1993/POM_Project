package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Utils extends BasePage
    {
        //clickOnElement method
        public static void clickOnElement(By by)
        {
            driver.findElement(by).click();
        }
        //SendKeyElement method
        public static void sendKeyElement(By by, String Text) {

            driver.findElement(by).sendKeys(Text);
        }
        //GettextElement method
        public static String getText(By by) {
            return driver.findElement(by).getText();
        }
        //timestamp
        public static String Date() {
            DateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
            Date date = new Date();
            return dateFormat.format(date);
        }
        public static void takeScreenShort(String Text) {
            //Convert web driver object to TakeScreenshot
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            //Call getScreenshotAs method to create image file
            File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
            //Move image file to new destination
            File DestFile = new File("src\\ScreenShort\\" + Text + Date() + ".png");
            //Copy file at destination
            try {
                FileUtils.copyFile(SrcFile, DestFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        // selectByVisibleText for day
            public static void selectByVisibleText(By by, String Text)
            {
                Select day = new Select(driver.findElement(by));
                day.selectByVisibleText(Text);
            }
            // selectBYIndex method for month
            public static void selectBYIndex(By by, int Text) {
                Select month = new Select(driver.findElement(by));
                month.selectByIndex(Text);
            }
            // selectByValue method for month
            public static void selectByValue(By by, String Text) {
                Select year = new Select(driver.findElement(by));
                year.selectByValue(Text);
            }
            //implicit wait
            public static void implicitWait() {
                // Set the implicit wait time for the driver
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            }
            //explicit wait methods
            // wait until visibility of element
            public static void visibilityOfElementLocated(By by) {
                wait = new WebDriverWait(driver, Duration.ofSeconds(30));
                wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            }
            //explicit wait methods
            // An expectation for checking an element is visible and enabled such that can click it.
            public static void elementToBeClickable(By by)
            {
                wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.elementToBeClickable(by));
            }
            //explicit wait methods
            //checking if the given element is selected.
            public static void elementToBeSelected(By by){
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeSelected(by));
            }
            //explicit wait methods
            // checking the title of a page
            public static void titleIs(String Text){
            wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.titleIs(Text));
            }
            //explicit wait methods
            //checking that an element is present on the DOM of a page. This does not necessarily mean that the element is visible.
            public static void presenceOfElementLocated(By by){
            wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            }
            //checking WebElement with given locator has specific text
            public static void textToBe(By by,String Text){
                wait.until(ExpectedConditions.textToBe(by,Text));
            }
            //checking WebElement with given locator has attribute which contains specific value
            public static void attributeToBeNotEmpty(WebElement element,String Attribute){
                wait.until(ExpectedConditions.attributeToBeNotEmpty(element,Attribute));
            }
            public static void visibilityOf(WebElement webElement){
            wait.until(ExpectedConditions.visibilityOf(webElement));
            }
            //checking child WebElement as a part of parent element to be visible
            public static void urlContains(String Text)
            {
            wait.until(ExpectedConditions.urlContains(Text));
            }
            //URL to match a specific regular expression
            public static void urlMatches(String Text){
            wait.until(ExpectedConditions.urlMatches(Text));
            }
    }

