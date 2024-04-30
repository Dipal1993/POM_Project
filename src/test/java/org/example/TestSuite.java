package org.example;
import org.testng.annotations.Test;
public class TestSuite extends BaseTest {
    //create object for homPage
    HomePage homePage = new HomePage();
    //Create object for registrationPage
    RegistrationPage registrationPage = new RegistrationPage();
    //Create object for registrationResultPage
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    //create object for loginPage
    LoginPage loginPage = new LoginPage();
    //create object for Electronics Category Page
    ElectronicsCategoryPage electronicsCategoryPage = new ElectronicsCategoryPage();
    //create object for CameraAndPhotoPAge
    CameraAndPhoto cameraAndPhoto = new CameraAndPhoto();
    //create object for NikonD5500DSLR
    NikonD5500DSLR nikonD5500DSLR = new NikonD5500DSLR();
    //create object for EmailAFriendPage
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    //create object of RefferFriendSuccessfully
    RefferFriendSuccessfully refferFriendSuccessfully = new RefferFriendSuccessfully();
    //create object of BuildyourowncomputerPage
    BuildyourowncomputerPage buildyourowncomputerPage = new BuildyourowncomputerPage();
    //create object for shopping cart page
    ShoppingCartResultPage shoppingCartResultPage = new ShoppingCartResultPage();
    @Test(priority = 2)
    public void verifyusershouldregistersucessfully() {

        //click on Register button from homepage
        homePage.clickOnRegisterButton();
        //enter the registration details
        registrationPage.fillRegistrationDetails();
        // compare the expected and actual result
        registrationResultPage.verifyRegistrationCompleted();
    }
    @Test(priority = 3)
    public void registeredUserReferProductsuccessfully() {

        //click on Register button from homepage
        homePage.clickOnRegisterButton();
        //enter the registration details
        registrationPage.fillRegistrationDetails();
        // compare the expected and actual result
        registrationResultPage.verifyRegistrationCompleted();
        //click on login button of homepage
       // homePage.clickOnLoginButton();
        //enter the login details
        //loginPage.verifyTheLoginFunctionality();
        //click on electronics category
        homePage.clickOnElectronics();
        //click on clickOnCamera And Photo Button
        electronicsCategoryPage.clickOnCameraAndPhotoButton();
        //click NikonD5500DSLR
        cameraAndPhoto.clickONNikonD5500DSLR();
        //click on Email a Friend button
        nikonD5500DSLR.clickOnEmailFriend();
        //enter the details for refer
        emailAFriendPage.EnterReferralDetail();
        //compare the result for refer friend
        refferFriendSuccessfully.verifyReferFriendResult();
    }
    @Test(priority = 1)
    public void userAddProductINShoppingCartSuccessfully() {

        //click on built your computer
        homePage.clickOnBuildYourOwnComputer();
        //select the second option for Processor
        buildyourowncomputerPage.selectSpecificationForComputer();
        //compare the resulting product on shopping cart page
        shoppingCartResultPage.verifyingTheNameofCartProducts();
    }
}

