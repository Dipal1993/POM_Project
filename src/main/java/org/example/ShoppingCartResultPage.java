package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;
public class ShoppingCartResultPage extends Utils{
//store the showing product on shopping cart page
   public static String expectedProduct="Build your own computer";
   public void verifyingTheNameofCartProducts(){

       //store the gettext value
       String actual = getText(By.xpath("//a[@class='product-name']"));
       //compare the product of shopping cart page and selected product
       Assert.assertEquals(actual,expectedProduct,"Your product is not match in shopping cart page");
   }
}
