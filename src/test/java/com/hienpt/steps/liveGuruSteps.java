package com.hienpt.steps;

import com.hienpt.page.commonElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Assert;

public class liveGuruSteps extends PageObject {
    private static final EnvironmentVariables environmentVariables =
            SystemEnvironmentVariables.createEnvironmentVariables();
    private static final String URL =
            EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("url");
    String a;
    String b;

    commonElements common;

    @Given("Open LiveGuru99 site")
    public void openLiveGuruSite() {
        openUrl(URL);
    }

    @When("Click on ACCOUNT menu")
    public void clickOnACCOUNTMenu() {
        common.clickAccountMenu();
    }

    @And("Choose Register link")
    public void chooseRegisterLink() {
        common.clickRegister();
    }

    @And("Input {string},{string},{string},{string},{string} to form")
    public void inputToForm(String firstname, String lastname, String email, String password, String repassword) {
        common.inputInformation(firstname, lastname, email, password, repassword);
    }

    @Then("Click REGISTER button")
    public void clickREGISTERButton() {
        common.clickRegisterButton();
    }

    @And("Verify text displayed after registerd")
    public void verifyTextDisplayedAfterRegisterd() {
        common.verifyMessage();
    }

    @And("Open my account page {string} and {string}")
    public void openMyAccountPageAnd(String email, String password) {
        common.clickMyAccount(email, password);
    }

    @Then("Verify dashboard header text displayed")
    public void verifyDashboardHeaderTextDisplayed() {
        common.verifyHeader();
    }

    @And("Open ACCOUNT INFORMATION page")
    public void openACCOUNTINFORMATIONPage() {
        common.clickAccountInfor();
    }

    @Then("Verify data in firstname, lastname and email are correctly")
    public void verifyDataInFirstnameLastnameAndEmailAreCorrectly() {
        common.verifyAccountInfor();
    }

    @When("Click on Mobile menu")
    public void clickOnMobileMenu() {
        common.clickMobileMenu();
    }

    @And("Get cost of Sony Xperia mobile in list page")
    public void getCostOfSonyXperiaMobileInListPage() {
        common.verifyPriceListPage();
    }

    @And("Click on Sony Xperia detail")
    public void clickOnSonyXperiaDetail() {
        common.clickDetailProduct();
    }

    @And("Get cost Sony Xperia mobile from detail page")
    public void getCostSonyXperiaMobileFromDetailPage() {
        common.verifyPriceDetailPage();
    }


    @Then("Compare value in list page and detail page")
    public void compareValueInListPageAndDetailPage() {
        common.comparePrice();
    }

    @When("Add Sony Xperia to cart")
    public void addSonyXperiaToCart() {
        common.clickAddtoCart();
    }

    @Then("Verify product added to cart")
    public void verifyProductAddedToCart() throws Throwable {
        common.verifyProductAdded();
    }

    @And("Enter Coupon code {string}")
    public void enterCouponCode(String coupon) throws Throwable {
        common.enterCouponCode(coupon);
    }

    @Then("Verify the discount generated")
    public void verifyTheDiscountGenerated() throws Throwable {
        common.verifyDiscount();
    }

    @When("Change Qty value to {string} and click update button")
    public void changeQtyValueToAndClickUpdateButton(String qty) throws Throwable {
        common.changeQuantity(qty);
    }

    @Then("Verify the error message")
    public void verifyTheErrorMessage() {
        common.verifyError();
    }

    @And("Click on Empty Cart link")
    public void clickOnEmptyCartLink() {
        common.clickEmptyLink();
    }

    @Then("Verify cart is empty")
    public void verifyCartIsEmpty() {
        common.verifyCartEmpty();
    }
}
