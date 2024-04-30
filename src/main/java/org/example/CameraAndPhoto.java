package org.example;
import org.openqa.selenium.By;
public class CameraAndPhoto extends Utils{

    public void clickONNikonD5500DSLR(){
        //checking that an element is present on the DOM of a page.
        //This does not necessarily mean that the element is visible.
        presenceOfElementLocated(By.linkText("Nikon D5500 DSLR"));
        //click on Nikon D5500 DSLR
        clickOnElement(By.linkText("Nikon D5500 DSLR"));
    }
}
