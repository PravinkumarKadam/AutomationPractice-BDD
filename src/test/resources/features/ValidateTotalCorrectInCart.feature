
# Author:  Pravinkumar D Kadam
# Company: VisionIT
# Date:    12-September-2021
# Description: Test com.automationPractice-BDD FW development

@ValidateTotalCorrectInCart
Feature: Validate total is correct in cart
  
   Test Case :
        19. Validate total is correct in cart

  @tag1
  Scenario: Validate total is correct in cart
    Given user open Web application
    When user enter "http://automationpractice.com/index.php?" url
    And Short Sleeve T-shirts products Add To Cart form landing page
    And click on Continue shopping button
    Then Blouse products Add To Cart form landing page  form landing page
    And click on Continue shopping button
    Then Printed Chiffon Dress products Add To Cart form landing page  form landing page
    And click on Continue shopping button
    Then Check the total of all three individual products
    And assert product total is matching with the cart total
    And close web application
