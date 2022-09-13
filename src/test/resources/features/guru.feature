Feature: Live Guru Frontend

  Background:
    Given Open LiveGuru99 site

  Scenario Outline: Register success to system
    When Click on ACCOUNT menu
    And Choose Register link
    And Input "<firstname>","<lastname>","<email>","<password>","<repassword>" to form
    Then Click REGISTER button
    And Verify text displayed after registerd
#  Case02&03: Verify user information is correct after registered successfully
    And Open my account page "<email>" and "<password>"
    Then Verify dashboard header text displayed
    And Open ACCOUNT INFORMATION page
    Then Verify data in firstname, lastname and email are correctly

    Examples:
      | firstname | lastname | email                | password | repassword |
      | Guru12    | demo12   | livedemo12@gmail.com | 111222   | 111222     |
  Scenario: Verify that cost of product in list page and details page are equal
    When Click on Mobile menu
    And Get cost of Sony Xperia mobile in list page
    And Click on Sony Xperia detail
    And Get cost Sony Xperia mobile from detail page
    Then Compare value in list page and detail page

  Scenario: Verify Discount Coupon works correctly
    When Add Sony Xperia to cart
    Then Verify product added to cart
    And Enter Coupon code "GURU50"
    Then Verify the discount generated

  Scenario: Verify that you can't add more 500 items of product
    When Change Qty value to "501" and click update button
    Then Verify the error message
    And Click on Empty Cart link
    Then Verify cart is empty

  Scenario: Verify that you are able to compare two products
  2. Click on ‘MOBILE’ menu
  3. In mobile products list , click on ‘Add To Compare’ for 2 mobiles (Sony Xperia & Iphone)
  4. Click on ‘COMPARE’ button (A popup window opens)
  5. Verify the pop-up window and check that the products are reflected in it
  Heading "COMPARE PRODUCTS" with selected products in it.
  6. Close the Popup Windows






