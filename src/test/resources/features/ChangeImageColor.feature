
# Author:  Pravinkumar D Kadam
# Company: VisionIT
# Date:    08-Sept-2021
# Description: Test com.automationPractice-BDD FW development

@ChangeImageColor
Feature: Change in the image using Color Feature
  Test No :
  12. Change in the image using Color Feature

  @test1
  Scenario: User Change in the image using Color Feature
    Given user open Web application
    When user enter "http://automationpractice.com/index.php?" url
    And user Select the category as T-Shirts
    And Click on Color Blue link
    Then Check the Image is changed
    And close web application
