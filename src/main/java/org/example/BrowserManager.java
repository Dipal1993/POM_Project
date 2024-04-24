package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class BrowserManager extends Utils{
    public  void openBrowser(){
        // initialize the chromeDriver object
        driver = new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();
// explicit wait - to wait for element
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //open the URL
        driver.get("https://demo.nopcommerce.com/");
    }
    public  void closeBrowser(){
        //close browser
        driver.quit();
    }
}
