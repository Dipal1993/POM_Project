package org.example;

import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

    public class BaseTest extends Utils{
    //create object of BrowserManager class
    BrowserManager browserManager = new BrowserManager();
    @BeforeMethod
    public void setup(){
        browserManager.openBrowser();
    }
   @AfterMethod
    public  void tearDown(ITestResult result){
        if(!result.isSuccess()){
            takeScreenShort(result.getName());
        }

        browserManager.closeBrowser();
    }
}
