
# Author:  Pravinkumar D Kadam
# Company: VisionIT
# Date:    12-September-2021
# Description: Test com.automationPractice-BDD FW development

@ValidateCartValueUpdating
Feature: Validate cart value is updating
  
   Test Case :
     17. Validate cart value is updating
    

  @tag1
  Scenario: Validate cart value is updating
    Given user open Web application
    When user enter "http://automationpractice.com/index.php?" url
    And Short Sleeve T-shirts products Add To Cart form landing page
    And click on Continue shopping button
    Then Blouse products Add To Cart form landing page  form landing page
    And click on Continue shopping button
    Then Printed Chiffon Dress products Add To Cart form landing page  form landing page
    And click on Continue shopping button
    And validate the cart is showing up count as 3
    And close web application
  
  
  