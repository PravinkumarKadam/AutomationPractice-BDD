@CreateAnAccountPageTest
Feature: User want to crate new account

  @tag1
  Scenario: User create new account on web aaplication
    Given user open Web application
    When user enter "http://automationpractice.com/index.php?" url
    Then click on SignIn button
    And user fill mail ID "AlexSamsung" and "@gmail.com"
    And click on Create and Account button
    And salect gender
    And user enter valid data on the page
      | Attributes                                    | Value                                                  |
      #YOUR PERSONAL INFORMATION
      | First name                                    | Thomas                                                 |
      | Last name                                     | Samsung                                                |
      | Password                                      | ThomasSamsung@123                                      |
      # Date of Birth
      | Day                                           |                                                     10 |
      | Month                                         |                                                      6 |
      | Year                                          |                                                   1992 |
      | Sign up for our newsletter!                   | click                                                  |
      | Receive special offers from our partners!     | click                                                  |
      #YOUR ADDRESS
      | First name                                    | Thomas                                                 |
      | Last name                                     | Samsung                                                |
      | Company                                       | Apple Inc.                                             |
      | Address                                       | One Apple Park Way, Cupertino                          |
      | City                                          | Cupertino, CA                                          |
      | State                                         |                                                      5 |
      | Zip/Postal Code                               |                                                  95014 |
      | Country                                       | United States                                          |
      | Additional information                        | Apple Park is the corporate headquarters of Apple Inc. |
      | Home phone                                    |                                                6927753 |
      | Mobile phone                                  |                                             8006920000 |
      | Assign an address alias for future reference. | Apple Park, US.                         |
    And click on Register button
    And assert registration form
    And close web application
