package org.example;
import org.openqa.selenium.By;
public class ElectronicsCategoryPage extends Utils {
    public void clickOnCameraAndPhotoButton(){
        clickOnElement(By.xpath("//a[@title='Show products in category Camera & photo']"));
    }
}
