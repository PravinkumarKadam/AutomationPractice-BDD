@landingPageTest
Feature: All test on landing page of web application

  Background: 
    Given user open Web application
    When user enter "http://automationpractice.com/index.php?" url

  @tag1
  Scenario: User want to check url of web application
    Then user assert "http://automationpractice.com/index.php?" url to current home page url
    And close web application

  @test2
  Scenario: user doing Landing Page Title Test
    Then user faching title of landing page
    And User assert "My Store" titile with corrent page titale
    And close web application
