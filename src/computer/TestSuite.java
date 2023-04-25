package computer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TestSuite extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/ ";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }//Opening the browser

    @Test
    public void verifyProductArrangeInAlphaBeticalOrder() throws InterruptedException {
        //Click on Computer Menu.
        clickOnElement(By.linkText("Computers"));
        //Click on Computer Menu.
        clickOnElement(By.linkText("Desktops"));
        //Select Sort By position "Name: Z to A"
        isTextDisplayed(By.id("products-orderby"), "Name: Z to A");
        //Verify the Product will arrange in Descending order.
        isTextDisplayed(By.id("products-orderby"), "Price: High to Low");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //Click on Computer Menu.
        clickOnElement(By.linkText("Computers"));
        //Click on Computer Menu.
        clickOnElement(By.linkText("Desktops"));
        Thread.sleep(1000);
        //Select Sort By position "Name: Z to A"
        isTextDisplayed(By.id("products-orderby"), "Name: A to Z");
        //Click on "Add To Cart"
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        Thread.sleep(1000);
        //2.2 GHz Intel Pentium Dual-Core E2200
        isTextDisplayed(By.linkText("Build your own computer"), "Build your own computer");
        //Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        selectByVisibleTextFromDropDown(By.id("product_attribute_1"), "2.2 GHz Intel Pentium Dual-Core E2200");
        Thread.sleep(1000);
        //Select "8GB [+$60.00]" using Select class.
        selectByVisibleTextFromDropDown(By.id("product_attribute_2"), "8GB [+$60.00]");
        //Select HDD radio "400 GB [+$100.00]"
        clickOnElement(By.id("product_attribute_3_7"));
        Thread.sleep(1000);
        //Select OS radio "Vista Premium [+$60.00]"
        clickOnElement(By.id("product_attribute_4_9"));
        Thread.sleep(1000);
        //Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        clickOnElement(By.id("product_attribute_5_10"));
        clickOnElement(By.id("product_attribute_5_12"));
        Thread.sleep(1000);
        //Verify the price "$1,475.00"
        //  isTextDisplayed(By.id("price-value-1"),"$1,475.00");
        // Click on "ADD TO CARD" Button.
        clickOnElement(By.id("add-to-cart-button-1"));
        Thread.sleep(1000);
        //Verify the Message "The product has been added to your shopping cart" on Top green Bar
        //   isTextDisplayed(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]"),"13 Verify the Message \"The product has been added to your shopping cart\" on Top green Bar ");
        //After that close the bar clicking on the cross button.
        clickOnElement(By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]"));
        Thread.sleep(1000);
        //Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        mouseHoverToElement(By.linkText("Shopping cart"));
        clickOnElement(By.xpath("//button[contains(text(),'Go to cart')]"));
        //Verify the message "Shopping cart"
        isTextDisplayed(By.linkText("Shopping cart"), "Shopping cart");
        Thread.sleep(1000);
        //Change the Qty to "2" and Click on "Update shopping cart"
        driver.findElement(By.xpath("//input[@class='qty-input']")).clear();
        sendTextToElement(By.xpath("//input[@class='qty-input']"), "2");
        clickOnElement(By.xpath("//button[@class='button-2 update-cart-button']"));
        Thread.sleep(1000);
        //Verify the Total"$2,950.00"
        isTextDisplayed(By.xpath("//tbody/tr[1]/td[6]/span[1]"), "$2,960.00");
        //Click on checkbox “I agree with the terms of service”
        clickOnElement(By.id("termsofservice"));
        Thread.sleep(1000);
        //Click on “CHECKOUT”
        clickOnElement(By.id("checkout"));
        //Verify the Text “Welcome, Please Sign In!”
        isTextDisplayed(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"), "Welcome, Please Sign In!");
        Thread.sleep(1000);
        //Click on “CHECKOUT AS GUEST” Tab
        clickOnElement(By.xpath("//button[contains(text(),'Checkout as Guest')]"));
        Thread.sleep(1000);
        //Fill the all mandatory field
        sendTextToElement(By.id("BillingNewAddress_FirstName"), "Xyz");
        sendTextToElement(By.id("BillingNewAddress_LastName"), "Patel");
        sendTextToElement(By.id("BillingNewAddress_Email"), "abcxyz@gmail.com");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "United Kingdom");
        sendTextToElement(By.id("BillingNewAddress_City"), "London");
        sendTextToElement(By.id("BillingNewAddress_Address1"), "77 Pinner Road");
        sendTextToElement(By.id("BillingNewAddress_ZipPostalCode"), "NW11AD");
        sendTextToElement(By.id("BillingNewAddress_PhoneNumber"), "01234567890");
        Thread.sleep(1000);
        //Click on “CONTINUE
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]"));
        //Click on Radio Button “Next Day Air($0.00)”
        clickOnElement(By.id("shippingoption_1"));
        Thread.sleep(1000);
        //Click on “CONTINUE”
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]"));
        //Select Radio Button “Credit Card”
        clickOnElement(By.xpath("//input[@id='paymentmethod_1']"));
        Thread.sleep(1000);
        //Select “Master card” From Select credit card dropdown
        clickOnElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']"));
        //Select “Master card” From Select credit card dropdown
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='CreditCardType']"), "Master card");
        Thread.sleep(1000);
        //Fill all the details
        sendTextToElement(By.id("CardholderName"), "MR NO ONE");
        sendTextToElement(By.id("CardNumber"), "5100 0000 0000 0511");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='ExpireMonth']"), "01");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='ExpireYear']"), "2026");
        sendTextToElement(By.xpath("//input[@id='CardCode']"), "123");
        Thread.sleep(1000);
        //Click on “CONTINUE”
        clickOnElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']"));
        //Verify “Payment Method” is “Credit Card”
        isTextDisplayed(By.xpath("//li[@class='payment-method']/span[@class='value']"), "Credit Card");
        //Verify “Shipping Method” is “Next Day Air”
        isTextDisplayed(By.xpath("//li[@class='shipping-method']/span[@class='value']"), "Next Day Air");
        Thread.sleep(1000);
        //Verify Total is “$2,950.00”
        isTextDisplayed(By.xpath("//span[@class='product-subtotal']"), "$2,950.00");
        //Click on “CONFIRM”
        clickOnElement(By.xpath("//button[@class='button-1 confirm-order-next-step-button']"));
        Thread.sleep(1000);
        //Verify the Text “Thank You”
        isTextDisplayed(By.xpath("//div[@class='page-title']/h1"), "Thank You");
        //Verify the message “Your order has been successfully"
        isTextDisplayed(By.xpath("//div[@class='section order-completed']/div[@class='title']/strong"), "Your order has been successfully");
        Thread.sleep(1000);
        //Click on "CONTINUE"
        clickOnElement(By.xpath("//button[@class='button-1 order-completed-continue-button']"));
        //Verify the text “Welcome to our store”
        isTextDisplayed(By.xpath("//div[@class='topic-block-title']/h2"), "Welcome to our store");
    }

    @After
    public void tearDown() {
        //closeBrowser();//Closing all the Browser instance
    }
}
