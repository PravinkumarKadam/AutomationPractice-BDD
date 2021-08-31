
# Author:  Pravinkumar D Kadam
# Company: VisionIT
# Date:    19-August-2021
# Description: Test com.automationPractice-BDD FW development

@AllProductPriceAndTotal
Feature: Fetch the all product price and get its total

  Test No :
        10. Fetch the all product price and get its total
   
  @tag1
  Scenario: Fetch the all product price and get its total
    Given user open Web application
    When user enter "http://automationpractice.com/index.php?" url
    And Validate "DRESSES" option is displayed with all characters in Uppercase
    And Click on the DRESS section
    Then Fetch all the prices Make the sum of all products.
    And close web application
