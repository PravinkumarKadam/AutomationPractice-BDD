@SignInPageTest
Feature: SignIn page Title Validation Test

 Background: 
    Given user open Web application
    When user enter "http://automationpractice.com/index.php?" url
    Then click on SignIn button 

  @SignInPageTitleTest
  Scenario: User Validate SignIn page Title 
    And fetching SignIn page title and assert it
    And close web application

  @UserResisterTest
  Scenario: User Resister with New Email Id on SignIn Page
    And user fill mail ID "AlexSamsung" and "@gmail.com"
    And click on Create and Account button
    And close web application
