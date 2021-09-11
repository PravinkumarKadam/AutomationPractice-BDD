
# Author:  Pravinkumar D Kadam
# Company: VisionIT
# Date:    12-September-2021
# Description: Test com.automationPractice-BDD FW development

@ValidateProductsAddedInCart
Feature: Validate same products added in cart
  
   Test Case :
         18. Validate same products added in cart
    
  @tag1
  Scenario: Validate same products added in cart
    Given user open Web application
    When user enter "http://automationpractice.com/index.php?" url
    And Short Sleeve T-shirts products Add To Cart form landing page
    And click on Continue shopping button
    Then Blouse products Add To Cart form landing page  form landing page
    And click on Continue shopping button
    Then Printed Chiffon Dress products Add To Cart form landing page  form landing page
    And click on Continue shopping button
    Then Validate items with same name got added in cart
    And close web application