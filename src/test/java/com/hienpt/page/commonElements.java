package com.hienpt.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class commonElements extends PageObject {
  final static Logger logger = LoggerFactory.getLogger(commonElements.class);
//  @FindBy(xpath = "//a[text()='Input Forms']")
//  public WebElementFacade sb_inputForm;
//
//  @FindBy(xpath = "//a[text()='Input Forms']/..//a[text()='Simple Form Demo']")
//  public WebElementFacade sb_simpleFormDemo;
//
//  @FindBy(xpath = "//a[text()='No, thanks!']")
//  public WebElementFacade closePopupBtn;
//
//  @FindBy(id = "user-message")
//  public WebElementFacade messageField;
//
//  @FindBy(xpath = "//button[text()='Show Message']")
//  public WebElementFacade showMessageButton;
//
//  @FindBy(id= "display")
//  public WebElementFacade verifyMessage;
//
//  @FindBy(id= "displayvalue")
//  public WebElementFacade totalValue;
//
//  @FindBy(id = "sum1")
//  public WebElementFacade firstField;
//
//  @FindBy(id = "sum2")
//  public WebElementFacade secondField;
//
//  @FindBy(xpath = "//button[text()='Get Total']")
//  public WebElementFacade getTotalButton;
//
//  @FindBy(id = "displayvalue")
//  public WebElementFacade verifyGetTotal;
//
//  @FindBy(xpath = "//a[text()='Input Forms']/..//a[text()='Radio Buttons Demo']")
//  public WebElementFacade radioButtonDemo;
//
//  @FindBy(xpath = "//a[text()='Input Forms']/..//a[text()='Checkbox Demo']")
//  public WebElementFacade checkboxDemo;
//
//  @FindBy(xpath = "//a[text()='Input Forms']/..//a[text()='Input Form Submit']")
//  public WebElementFacade inputFormSubmit;
//
//  @FindBy(xpath = "//input[@name='email']")
//  public WebElementFacade emailField;
//
//  @FindBy(xpath = "//small[contains(text(),'supply a valid email')]")
//  public WebElementFacade emailError;
//
//  @FindBy(xpath = "//input[@name=\"phone\"]")
//  public WebElementFacade phoneField;
//
//  @FindBy(xpath = "//textarea[@name='comment']")
//  public WebElementFacade projectDescription;
//
//  @FindBy(xpath = "//small[contains(text(),'enter at least 10 characters')]")
//  public WebElementFacade projectDescriptionError;
//
//  public void clickInputForm(){
//    sb_inputForm.waitUntilVisible().click();
//  }
//
//  public void clickSimpleForm() throws Throwable {
//    sb_simpleFormDemo.waitUntilVisible().click();
//  }
//
//  public void closeAdsPopup() {
//    try {
//      closePopupBtn.waitUntilVisible().click();
//    } catch (Exception ignored) {
//    }
//
//  }
//
//  //    public void clickOnSidebarMenu(String sidebarMenu) {
//////        waitFor(closePopupBtn).waitUntilNotVisible();
////        find(By.xpath(String.format("//li[@class='tree-branch']//a[contains(text(), '%s')]", sidebarMenu))).waitUntilClickable().click();
////    }
//  public void enterYourMessage() throws Throwable {
//    Random generator = new Random();
//    int i = generator.nextInt(99);
//
//    String s = RandomStringUtils.randomAlphabetic(2).toLowerCase(Locale.ROOT);
//
//    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
//    Date date = new Date();
//    String currentDate= dateFormat.format(date);
//
//    String message = String.format("%02d", i)+s+currentDate;
//    messageField.waitUntilVisible().sendKeys(message);
//  }
//  public void showMessage(){
//    showMessageButton.waitUntilVisible().click();
//  }
//  public boolean verifyMessage(){
//    if (verifyMessage.waitUntilVisible().isDisplayed()) {
////      System.out.println(verifyMessage.getText());
//        logger.info("input message: " + verifyMessage.getText());
//    }
//
//    return false;
//  }
//  public void enterFirstValue(String firstValue){
//    firstField.waitUntilVisible().sendKeys(firstValue);
//  }
//  public void enterSecondValue(String secondValue){
//    secondField.waitUntilVisible().sendKeys(secondValue);
//  }
//  public void getTotal(){
//    getTotalButton.waitUntilVisible().click();
//  }
//  public boolean verifyTotal(){
//    if (verifyGetTotal.waitUntilVisible().isDisplayed()){
////      System.out.println(verifyGetTotal.getText());
//      logger.info("input message: " + verifyMessage.getText());
//    }
//    return false;
//
//  }
//  //    public void verifySum(){
////        int sum = 8;
////        switch (sum){
////            case 6:
////                sb_inputForm.waitUntilVisible().click();
////                radioButtonDemo.waitUntilVisible().click();
////                break;
////            case 8:
////                sb_inputForm.waitUntilVisible().click();
////                checkboxDemo.waitUntilVisible().click();
////                break;
////            default:
////                break;
////        }
////    }
//  public void clickInputFormSubmit(){
//    inputFormSubmit.waitUntilVisible().click();
//  }
//  public void enterEmail(String email) throws Throwable {
//    emailField.waitUntilVisible().sendKeys(email);
//    Thread.sleep(1000);
//    if (emailError.waitUntilVisible().isDisplayed()){
//      emailField.waitUntilVisible().clear();
//      String s = RandomStringUtils.randomAlphabetic(5).toLowerCase(Locale.ROOT);
//      emailField.sendKeys(s +"@gmail.com");
//      Thread.sleep(2000);
//    }
//
//  }
//  public void verifyEmailError(){
//    emailError.waitUntilNotVisible();
//  }
//  public void enterPhone(String phoneNumb) throws Throwable {
//    String s = RandomStringUtils.randomNumeric(8);
//    phoneField.waitUntilVisible().sendKeys(phoneNumb+s);
//    Thread.sleep(2000);
//  }
//  public void enterProjectDescription(String letter){
//    projectDescription.waitUntilVisible().sendKeys(letter);
//    projectDescriptionError.waitUntilVisible().isDisplayed();
////    System.out.println(projectDescriptionError.getText());
//    logger.info("error: " + projectDescriptionError.getText());
//  }
//  public void verifyProjectDescription() throws Throwable {
//    int n = 2;
//    while (n<=10) {
//      projectDescription.waitUntilVisible().sendKeys("a");
//      n++;
//    }
//    Thread.sleep(5000);
//    projectDescriptionError.waitUntilNotVisible();
//  }
//
//  public String getTotalValue() {
//    String sum = waitFor(totalValue).waitUntilVisible().getText();
//    logger.info("Total: " + sum);
//    return sum;
//  }
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

  @FindBy(xpath = "//a[text()='Sony Xperia']/../..//span[text()='Add to Cart']")
  public WebElementFacade addToCart;

  public void clickAddtoCart(){
    mobileLink.waitUntilVisible().click();
    addToCart.waitUntilVisible().click();
  }

  @FindBy(xpath = "//span[contains(text(),'Xperia was added')]")
  public WebElementFacade addedMessage;
  @FindBy(xpath = "//input[@name='cart[186431][qty]']")
  public WebElementFacade quantity;
  @FindBy(xpath = "//span[text()='Update']")
  public WebElementFacade updateButton;
  public void verifyProductAdded(){
    addedMessage.waitUntilVisible().isDisplayed();
    System.out.println(addedMessage.getText());
    quantity.waitUntilVisible().clear();
    quantity.waitUntilVisible().sendKeys("1");
    updateButton.waitUntilVisible().click();
    couponCode.waitUntilVisible().clear();
  }
  @FindBy(id = "coupon_code")
  public WebElementFacade couponCode;
  @FindBy(xpath = "//span[text()='Apply']")
  public WebElementFacade applyButton;

  public void enterCouponCode(String coupon) throws Throwable {
    couponCode.waitUntilVisible().sendKeys(coupon);
    applyButton.waitUntilVisible().click();
    Thread.sleep(3000);
  }
  @FindBy(xpath = "//td[contains(text(),'Discount (GURU50)')]/..//span[@class='price']")
  public WebElementFacade discountField;

  @FindBy(xpath = "//strong[contains(text(),'Grand Total')]/../..//span[@class='price']")
  public WebElementFacade grandTotal;

  public void verifyDiscount(){
    String expectedDiscount = "-$5.00";
    String expectedGrandTotal = "$95.00";
    String actualDiscount = discountField.getText();
    String actualGrandTotal = grandTotal.getText();
    Assert.assertEquals("correct discount",expectedDiscount,actualDiscount);
    Assert.assertEquals("correct Grantotal",expectedGrandTotal,actualGrandTotal);
  }
}
