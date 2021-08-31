
# Author:  Pravinkumar D Kadam
# Company: VisionIT
# Date:    19-August-2021
# Description: Test com.automationPractice-BDD FW development

@SendAFriendFeature
Feature: Send a Friend Feature
  
  Test No :
        11. Send a Friend Feature

  @tag1
  Scenario Outline: Send a Friend Feature
    Given user open Web application
    When user enter "http://automationpractice.com/index.php?" url
    And Use already created username "AlexSamsung1630156653163@gmail.com" and password "ThomasSamsung@123" to login into the application
    And Select the category as T-Shirts
    Then Click on the product: Faded Short Sleeve T-shirts More option
    And Click Send to a Friend Link
    And Fill the details "<Freind Name>" and "<Freind Maild ID>" click on Send button.
    And Validate the Message appeared in the Email sent in a pop up.
    And close web application

    Examples: 
      | Freind Name | Freind Maild ID   |
      | Alex        | alex123@gmail.com |
