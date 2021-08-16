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
    And User assert "My Store" title with current page title
    Then user fetching title of landing page
    And close web application

  @LogoDisplayTest
  Scenario: User Landing Page Application Logo Display Test
    Then user check on landing page Logo is Display or not
    And close web application

@ValidatelogoSize
  Scenario: Validate Application logo Height on Landing Page
    Then user fetching Logo height and Width from Home page of application
    And  Assert Logo height and Width respectively "99" and "350"
    And close web application
    
    
    