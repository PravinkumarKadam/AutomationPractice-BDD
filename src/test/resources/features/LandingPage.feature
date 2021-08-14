@LandingPageTest
Feature: All test on landing page of web application

  Background: 
    Given user open Web application
    When user enter "http://automationpractice.com/index.php?" url

  @AssertUrl
  Scenario: User want to check url of web application
    Then user assert "http://automationpractice.com/index.php?" url to current home page url
    And close web application

  @ProductVlidationTest
  Scenario: user Product category validation Test
    Then user fetching product category list
    And close web application

  @LandingPageTitleTest
  Scenario: user doing Landing Page Title Test
    And User assert "My Store" title with corrent page title
    Then user fetching title of landing page
    And close web application
