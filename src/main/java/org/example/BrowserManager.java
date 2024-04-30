package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class BrowserManager extends Utils {
    // create object of LoadPage
    LoadPage loadPage=new LoadPage();
    public void openBrowser() {
        //use getProperty method to get browser from testDataConfig
        if (loadPage.getProperty("browser").equalsIgnoreCase("Chrome")) {
            // initialize the chromeDriver object
            driver = new ChromeDriver();
        } else if (loadPage.getProperty("browser").equalsIgnoreCase("Firefox")) {
            // initialize the FirefoxDriver object
            driver = new FirefoxDriver();
        } else if (loadPage.getProperty("browser").equalsIgnoreCase("Edge")) {
            // initialize the EdgeDriver object
            driver = new EdgeDriver();
        } else {
            System.out.println("Your Browser is not available");
        }
        //maximize the window
        driver.manage().window().maximize();

        //open the URL
        driver.get(loadPage.getProperty("url"));
    } public void closeBrowser() {
        //close browser
        driver.quit();
    }
}
