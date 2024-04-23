package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class BrowserManager extends Utils{
    public  void openBrowser(){
        // initialize the chromeDriver object
        driver = new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();
        // Set the implicit wait time for the driver
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //open the URL
        driver.get("https://demo.nopcommerce.com/");
    }
    public  void closeBrowser(){
        //close browser
        driver.quit();
    }
}
