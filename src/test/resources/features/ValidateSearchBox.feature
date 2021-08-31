
# Author:  Pravinkumar D Kadam
# Company: VisionIT
# Date:    19-August-2021
# Description: Test com.automationPractice-BDD FW development

@ValidateSearchBox
Feature: Validate the search box is enabled to perform sendkeys operation.
  
  Test No :
         9. Search by a keyword in the product search box and validate how many products are matching with the name.
    
  @tag1
  Scenario: Validate the search box is enabled to perform sendkeys operation.
    Given user open Web application
    When user enter "http://automationpractice.com/index.php?" url
    And Search for the product "Dress" in the given search box
    Then Fetch the result and print the result
    And close web application