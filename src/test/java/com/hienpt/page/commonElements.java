package com.hienpt.page;

import junit.framework.AssertionFailedError;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class commonElements extends PageObject {
  final static Logger logger = LoggerFactory.getLogger(commonElements.class);

  @FindBy(xpath = "//a[@class='skip-link skip-account']/..//span[text()='Account']")
  public WebElementFacade accountMenu;

  public void clickAccountMenu(){
    accountMenu.waitUntilVisible().click();
  }
  @FindBy(xpath = "//a[text()='Register']")
  public WebElementFacade registerLink;

  public void clickRegister(){
    registerLink.waitUntilVisible().click();
  }
  @FindBy(id = "firstname")
  public WebElementFacade firstNameField;

  @FindBy(id = "lastname")
  public WebElementFacade lastNameField;

  @FindBy(id = "email_address")
  public WebElementFacade emailField;

  @FindBy(id = "password")
  public WebElementFacade passwordFieldl;

  @FindBy(id = "confirmation")
  public WebElementFacade rePasswordField;

  public void inputInformation(String firstName, String lastName,
                               String email, String password, String rePassword){
    firstNameField.waitUntilVisible().sendKeys(firstName);
    lastNameField.waitUntilVisible().sendKeys(lastName);
    emailField.waitUntilVisible().sendKeys(email);
    passwordFieldl.waitUntilVisible().sendKeys(password);
    rePasswordField.waitUntilVisible().sendKeys(rePassword);
  }

  @FindBy(xpath = "//button[@type='submit']/..//span[text()='Register']")
  public WebElementFacade registerButton;

  public void clickRegisterButton() {
    registerButton.waitUntilVisible().click();
  }

  @FindBy(xpath = "//span[contains(text(),'Main Website Store')]")
  public WebElementFacade messageSuccess;

  @FindBy(xpath = "//span[contains(text(),'already an account')]")
  public WebElementFacade existAccountMessage;

  public boolean verifyMessage() {
    boolean check = messageSuccess.isPresent();
    if (check){
      System.out.println(messageSuccess.getText());
      logger.info("info1 is: " + messageSuccess.getText());
    }else {
      System.out.println(existAccountMessage.getText());
      logger.info("info2 is: " + existAccountMessage.getText());
    }
    return check;
  }

  @FindBy(xpath = "(//a[text()='My Account'])[2]")
  public WebElementFacade myAccountLink;
  @FindBy(name = "login[username]")
  public WebElementFacade emailAddressField;
  @FindBy(name = "login[password]")
  public WebElementFacade passwordBox;
  @FindBy(id = "send2")
  public WebElementFacade loginButton;

  public void clickMyAccount(String email, String password){
    if (messageSuccess.isPresent()){
      myAccountLink.waitUntilVisible().click();
    }else {
      myAccountLink.waitUntilVisible().click();
      emailAddressField.waitUntilVisible().sendKeys(email);
      passwordBox.waitUntilVisible().sendKeys(password);
      loginButton.waitUntilVisible().click();
    }
  }
  @FindBy(xpath = "//div[@class='page-title']")
  public WebElementFacade headerTitle;
  @FindBy(xpath = "//p[@class='hello']")
  public WebElementFacade welcomeMessage;

  public void verifyHeader(){
    headerTitle.waitUntilVisible().isDisplayed();
    System.out.println(headerTitle.getText());
    welcomeMessage.waitUntilVisible().isDisplayed();
    System.out.println(welcomeMessage.getText());
    logger.info("welcome message is: " + welcomeMessage.getText());
  }

  @FindBy(xpath = "//a[text()='Account Information']")
  public WebElementFacade accountInforLink;

  public void clickAccountInfor(){
    accountInforLink.waitUntilVisible().click();
  }

  @FindBy(id = "firstname")
  public WebElementFacade firstNameInfor;
  @FindBy(id = "lastname")
  public WebElementFacade lastNameInfor;
  @FindBy(id = "email")
  public WebElementFacade emailInfor;

  public void verifyAccountInfor(){
    firstNameInfor.waitUntilVisible().isDisplayed();
    System.out.println(firstNameInfor.getValue());
    logger.info("info1: " + firstNameInfor.getValue());
    lastNameInfor.waitUntilVisible().isDisplayed();
    System.out.println(lastNameInfor.getValue());
    logger.info("info2: " + lastNameInfor.getValue());
    emailInfor.waitUntilVisible().isDisplayed();
    System.out.println(emailInfor.getValue());
    logger.info("infor3: " + emailInfor.getValue());
  }

  @FindBy(xpath = "//a[text()='Mobile']")
  public WebElementFacade mobileMenu;

  public void clickMobileMenu(){
    mobileMenu.waitUntilVisible().click();
  }

  @FindBy(xpath = "//a[@title='Xperia']/..//span[@class='price']")
  public static WebElementFacade priceListPage;

  String p1;
  String p2;
  public void verifyPriceListPage(){
    priceListPage.waitUntilVisible().isDisplayed();
    p1 = priceListPage.getText();
    System.out.println(p1);
    logger.info("price in list page is: "+priceListPage.getText());

  }
  @FindBy(id = "product-collection-image-1")
  public static WebElementFacade detailProduct;

  public void clickDetailProduct(){
    detailProduct.waitUntilVisible().click();
  }
  @FindBy(xpath = "//span[text()='Sony Xperia']/../..//span[text()='$100.00']")
  public static WebElementFacade priceDetailPage;

  public void verifyPriceDetailPage(){
    priceDetailPage.waitUntilVisible().isDisplayed();
    p2 = priceDetailPage.getText();
    System.out.println(p2);
    logger.info("price in detail page is: "+ priceDetailPage.getText());

  }
  public void comparePrice(){
    if (p1.equals(p2)){
      System.out.println("Two prices equal");
    }else {
      System.out.println("Two prices not equal");
    }
  }

  @FindBy(xpath = "//nav[@id='nav']//a[text()='Mobile']")
  public WebElementFacade mobileLink;
  @FindBy(xpath = "//a[@title='Sony Xperia']/../..//span[text()='Add to Cart']")
  public WebElementFacade addToCart;
  @FindBy(xpath = "//span[text()='Cart']")
  public WebElementFacade cart;

  @FindBy(xpath = "//input[@data-cart-item-id='MOB001']")
  public WebElementFacade qtyCart;

  @FindBy(xpath = "//a[@title='Remove This Item']")
  public WebElementFacade removeItem;

  public void clickAddtoCart(){
    mobileLink.waitUntilVisible().click();
    addToCart.waitUntilVisible().click();
  }

  @FindBy(xpath = "//span[contains(text(),'Xperia was added')]")
  public WebElementFacade addedMessage;
  @FindBy(xpath = "//input[@title='Qty']")
  public WebElementFacade quantity;
  @FindBy(xpath = "//span[text()='Update']")
  public WebElementFacade updateButton;

  public void verifyProductAdded() {
    addedMessage.waitUntilVisible().isDisplayed();
    System.out.println(addedMessage.getText());

  }
  @FindBy(id = "coupon_code")
  public WebElementFacade couponCode;
  @FindBy(xpath = "//span[text()='Apply']")
  public WebElementFacade applyButton;
  int qty;
  public void enterCouponCode(String coupon) throws Throwable {
    qty = Integer.parseInt(quantity.getAttribute("value"));
    if(qty != 1){
      quantity.waitUntilVisible().clear();
      quantity.waitUntilVisible().sendKeys("1");
      couponCode.waitUntilVisible().clear();
    }
    couponCode.waitUntilVisible().sendKeys(coupon);
    applyButton.waitUntilVisible().click();
    Thread.sleep(3000);
  }
  @FindBy(xpath = "//td[contains(text(),'Discount (GURU50)')]/..//span[@class='price']")
  public WebElementFacade discountField;

  @FindBy(xpath = "//strong[contains(text(),'Grand Total')]/../..//span[@class='price']")
  public WebElementFacade grandTotal;

  public void verifyDiscount() {

      String expectedDiscount = "-$5.00";
      String expectedGrandTotal = "$95.00";
      String actualDiscount = discountField.getText();
      String actualGrandTotal = grandTotal.getText();
      Assert.assertEquals("correct discount",expectedDiscount,actualDiscount);
      Assert.assertEquals("correct Grantotal",expectedGrandTotal,actualGrandTotal);
  }
  public void changeQuantity(String qty) throws Throwable {
      mobileLink.waitUntilVisible().click();
      addToCart.waitUntilVisible().click();
      quantity.waitUntilVisible().clear();
      quantity.waitUntilVisible().sendKeys(qty);
      updateButton.waitUntilVisible().click();
      Thread.sleep(3000);
  }
  @FindBy(xpath = "//span[contains(text(),'requested quantity')]")
  public WebElementFacade messageError1;
  @FindBy(xpath = "//p[contains(text(),'maximum quantity')]")
  public WebElementFacade messageError2;
  public void verifyError(){
    messageError1.waitUntilVisible().isDisplayed();
    System.out.println(messageError1.getText());
    messageError2.waitUntilVisible().isDisplayed();
    System.out.println(messageError2.getText());
  }
  @FindBy(xpath = "//span[contains(text(),'Empty Cart')]")
  public WebElementFacade emptyLink;

  public void clickEmptyLink(){
    emptyLink.waitUntilVisible().click();
  }

  @FindBy(xpath = "//h1[contains(text(),'Shopping Cart is Empty')]")
  public WebElementFacade cartEmptyMeassage;

  @FindBy(xpath = "//div[@class='cart-empty']//p[contains(text(),'You have no items')]")
  public WebElementFacade noItems;

  public void verifyCartEmpty(){
    cartEmptyMeassage.waitUntilVisible().isDisplayed();
    System.out.println(cartEmptyMeassage.getText());
    noItems.waitUntilVisible().isDisplayed();
    System.out.println(noItems.getText());
  }
}
