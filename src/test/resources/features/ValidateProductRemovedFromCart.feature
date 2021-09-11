
# Author:  Pravinkumar D Kadam
# Company: VisionIT
# Date:    12-September-2021
# Description: Test com.automationPractice-BDD FW development

@ValidateProductRemovedFromCart
Feature: Validate a product can be removed from cart feature
  
   Test Case :
        20. Validate a product can be removed from cart feature

  @tag1
  Scenario: Validate a product can be removed from cart feature
    Given user open Web application
    When user enter "http://automationpractice.com/index.php?" url
    And Short Sleeve T-shirts products Add To Cart form landing page
    And click on Continue shopping button
    Then Blouse products Add To Cart form landing page  form landing page
    And click on Continue shopping button
    Then Printed Chiffon Dress products Add To Cart form landing page  form landing page
    And click on Continue shopping button
    Then Click on the cross button to remove product from cart
    And Check the cart value updated with 2
    And close web application
