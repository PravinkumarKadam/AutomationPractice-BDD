
# Author:  Pravinkumar D Kadam
# Company: VisionIT
# Date:    12-September-2021
# Description: Test com.automationPractice-BDD FW development

@NewsletterSubscription
Feature: Newsletter subscription
  
   Test Case :
      16. Newsletter subscription

  @tag1
  Scenario: User doing Newsletter subscription
    Given user open Web application
    When user enter "http://automationpractice.com/index.php?" url
    Then Send a random email id "alexSon" and "@gmail.com" in newsletter subscription text box
    And Click on proceed button
    And Validate the message text for successful email subscription
    And close web application
    
    