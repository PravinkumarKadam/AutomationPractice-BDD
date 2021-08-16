
@SignInPageTest
Feature: SignIn page Title Validation Test

 Background: 
    Given user open Web application
    When user enter "http://automationpractice.com/index.php?" url

  @SignInPageTitleTest
  Scenario: User Validate SignIn page Title 
  Then click on SignIn button
  And fetching SignIn page title and assert it
  And close web application
