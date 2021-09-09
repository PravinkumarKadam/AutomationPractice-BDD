
# Author:  Pravinkumar D Kadam
# Company: VisionIT
# Date:    08-Sept-2021
# Description: Test com.automationPractice-BDD FW development

@ValidateFacebookHandle
Feature: Validate Facebook Social Media Handle
  Test No :
  13. Validate Facebook Social Media Handle

  @test1
  Scenario: User Change in the image using Color Feature
    Given user open Web application
    When user enter "http://automationpractice.com/index.php?" url
    Then Click on the Facebook link
    And Validate the Facebook page name
    And close web application
