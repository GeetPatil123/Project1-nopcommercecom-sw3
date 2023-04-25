package electronics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ElectronicsTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/ ";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }//Opening the browser

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        //Mouse Hover on “Electronics” Tab
        mouseHoverToElement(By.linkText("Electronics"));
        //Mouse Hover on “Cell phones” and click
        mouseHoverAndClickOnElement(By.linkText("Cell phones"));
        //Verify the text “Cell phones”
        isTextDisplayed(By.linkText("Cell phones"), "Cell phones");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException  {
        //Mouse Hover on “Electronics” Tab
        mouseHoverToElement(By.linkText("Electronics"));
        //Mouse Hover on “Cell phones” and click
        mouseHoverAndClickOnElement(By.linkText("Cell phones"));
        //Verify the text “Cell phones”
        isTextDisplayed(By.linkText("Cell phones"), "Cell phones");
        Thread.sleep(1000);
        //Click on List View Tab
        clickOnElement(By.xpath("//a[contains(text(),'List')]"));
        //Click on product name “Nokia Lumia 1020” link
        clickOnElement(By.linkText("Nokia Lumia 1020"));
        //Verify the text “Nokia Lumia 1020”
        isTextDisplayed(By.linkText("Nokia Lumia 1020"), "Nokia Lumia 1020");
        Thread.sleep(1000);
        //Verify the price “$349.00”
        isTextDisplayed(By.id("price-value-20"), "$349.00");
        //Change quantity to 2
        driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']")).clear();
        driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']")).sendKeys("2");
        //Click on “ADD TO CART” tab
        clickOnElement(By.id("add-to-cart-button-20"));
        Thread.sleep(1000);
        //Verify the Message "The product has been added to your shopping cart" on Top green Bar
        isTextDisplayed(By.linkText("content"), "The product has been added to your ");
        //After that close the bar clicking on the cross button
        clickOnElement(By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]"));
        //MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        mouseHoverToElement(By.linkText("Shopping cart"));
        clickOnElement(By.xpath("//button[contains(text(),'Go to cart')]"));
        Thread.sleep(1000);
        //Verify the message "Shopping cart"
        isTextDisplayed(By.linkText("Shopping cart"), "Shopping cart");
        //Verify the quantity is 2
        isTextDisplayed(By.id("itemquantity11226"), "2");
        //Verify the Total $698.00
        isTextDisplayed(By.xpath("//tbody/tr[1]/td[6]/span[1]"), "$698.00");
        Thread.sleep(1000);
        //click on checkbox “I agree with the terms of service”
        clickOnElement(By.id("termsofservice"));
        //Click on “CHECKOUT”
        clickOnElement(By.id("checkout"));
        Thread.sleep(1000);
        //Verify the Text “Welcome, Please Sign In!”
        isTextDisplayed(By.linkText("Welcome, Please Sign In!"), "Welcome, Please Sign In!");
        //Click on “REGISTER”
        clickOnElement(By.linkText("Register"));
        Thread.sleep(1000);
        //Verify the text “Register”
        isTextDisplayed(By.linkText("Register"), "Register");
        //Fill the mandatory fields
        //Enter First Name
        sendTextToElement(By.id("FirstName"), "Bhreina");
        Thread.sleep(1000);
        //Enter Last Name
        sendTextToElement(By.id("LastName"), "Patel");
        //Enter Date
        sendTextToElement(By.xpath("//select[@name='DateOfBirthDay']"), "30");
        //Enter Month
        sendTextToElement(By.xpath("//select[@name='DateOfBirthMonth']"), "March");
        Thread.sleep(1000);
        //Enter Year
        sendTextToElement(By.xpath("//select[@name='DateOfBirthYear']"), "1990");
        //Enter Email
        sendTextToElement(By.id("Email"), getRandomEmail());
        Thread.sleep(1000);
        //Enter Password
        sendTextToElement(By.id("Password"), "Abc123");
        //Enter Confirm password
        sendTextToElement(By.id("ConfirmPassword"), "abc123");
        Thread.sleep(1000);
        //Click on “REGISTER” Button
        clickOnElement(By.id("register-button"));
        //Verify the message “Your registration completed”
        isTextDisplayed(By.xpath("//div[contains(text(),'Your registration completed')]"), "Your registration completed");
        Thread.sleep(1000);
        //Click on “CONTINUE” tab
        clickOnElement(By.xpath("//a[contains(text(),'Continue')]"));
        //Verify the text “Shopping card”
        isTextDisplayed(By.xpath("//h1[contains(text(),'Shopping cart')]"), "Shopping card");
        Thread.sleep(1000);
        //click on checkbox “I agree with the terms of service”
        clickOnElement(By.xpath("//input[@id='termsofservice']"));
        //Click on “CHECKOUT”
        clickOnElement(By.xpath("//button[@id='checkout']"));
        Thread.sleep(1000);
        //Fill the Mandatory fields
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "United States");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='BillingNewAddress_StateProvinceId']"), "Texas");
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_City']"), "Houston");
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_Address1']"), "1234 Raleigh St.");
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"), "77021");
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"), "3952724");
        Thread.sleep(1000);
        //Click on “CONTINUE”
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]"));
        //Click on Radio Button “2nd Day Air ($0.00)”
        clickOnElement(By.xpath("//input[@id='shippingoption_2']"));
        //Click on “CONTINUE”
        clickOnElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));
        Thread.sleep(1000);
        //Select Radio Button “Credit Card”
        clickOnElement(By.xpath("//input[@id='paymentmethod_1']"));
        //Click on “CONTINUE”
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]"));
        Thread.sleep(1000);
        //Select “Visa” From Select credit card dropdown
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='CreditCardType']"), "Visa");
        Thread.sleep(1000);
        //Fill all the details
        sendTextToElement(By.xpath("//input[@id='CardholderName']"), "Mr HELLO PATEL");
        sendTextToElement(By.xpath("//input[@id='CardNumber']"), "5555555555554444");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='ExpireMonth']"), "05");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='ExpireYear']"), "2025");
        sendTextToElement(By.xpath("//input[@id='CardCode']"), "123");
        Thread.sleep(1000);
        //Click on “CONTINUE”
        clickOnElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']"));
        //Verify “Payment Method” is “Credit Card”
        isTextDisplayed(By.xpath("//span[contains(text(),'Credit Card')]"), "Credit Card");
        Thread.sleep(1000);
        //Verify “Shipping Method” is “2nd Day Air”
        isTextDisplayed(By.xpath("//li[@class='shipping-method']/span[@class='value']"), "2nd Day Air");
        //Verify Total is “$698.00”
        isTextDisplayed(By.xpath("//tbody/tr[1]/td[6]/span[1]"), "$698.00");
        Thread.sleep(1000);
        //Click on “CONFIRM”
        clickOnElement(By.xpath("//button[contains(text(),'Confirm')]"));
        //Verify the Text “Thank You”
        isTextDisplayed(By.xpath("//h1[text()='Thank you']"), "Thank You");
        Thread.sleep(1000);
        //Verify the message “Your order has been successfully processed!”
        isTextDisplayed(By.xpath("//strong[text()='Your order has been successfully processed!']"), "Your order has been successfully processed!");
        //Click on “CONTINUE”
        clickOnElement(By.xpath("//button[@class='button-1 order-completed-continue-button']"));
        Thread.sleep(1000);
        //Verify the text “Welcome to our store”
        isTextDisplayed(By.xpath("//h2[text()='Welcome to our store']"), "Welcome to our store");
        //Click on “Logout” link
        clickOnElement(By.xpath("//a[contains(text(),'Log out')]"));
        Thread.sleep(1000);
        //Verify the URL is “https://demo.nopcommerce.com/”
        String expectedMessage17 = "https://demo.nopcommerce.com/";
        //Actual Message
        String actualMessage17 = driver.getCurrentUrl();
        Thread.sleep(1000);
        //Validate actual and Expected message
        Assert.assertEquals(expectedMessage17, actualMessage17);
    }

    @After
    public void tearDown() {
        //closeBrowser();//Closing all the Browser instance
    }

}
