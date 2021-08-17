@CreateAnAccountPageTest
Feature: User want to crate new account

  @tag2
  Scenario Outline: User create new account on web aaplication
    Given user open Web application
    When user enter "http://automationpractice.com/index.php?" url
    Then click on SignIn button
    And user fill mail ID "AlexSamsung" and "@gmail.com"
    And click on Create and Account button
    And start fill personal information "<Attributes>" and "<Value>"
    And click on Register button
    And close web application

    Examples: 
      | Attributes                                    | Value                                                                        |
      #YOUR PERSONAL INFORMATION
      | Title                                         | Mr                                                                           |
      | First name                                    | Thomas                                                                       |
      | Last name                                     | Samsung                                                                      |
      | Password                                      | ThomasSamsung@123                                                            |
      # Date of Birth
      | Day                                           |                                                                           10 |
      | Month                                         | Jun                                                                          |
      | Year                                          |                                                                         1992 |
      | Sign up for our newsletter!                   | click                                                                        |
      | Receive special offers from our partners!     | click                                                                        |
      #YOUR ADDRESS
      | First name                                    | Thomas                                                                       |
      | Last name                                     | Samsung                                                                      |
      | Company                                       | Apple Inc.                                                                   |
      | Address                                       | One Apple Park Way, Cupertino                                                |
      | City                                          | Cupertino, CA                                                                |
      | State                                         | Cupertino                                                                    |
      | Zip/Postal Code                               |                                                                        95014 |
      | Country                                       | United States                                                                |
      | Additional information                        | Apple Park is the corporate headquarters of Apple Inc.,located at Cupertino. |
      | Home phone                                    |                                                                      6927753 |
      | Mobile phone                                  |                                                                   8006920000 |
      | Assign an address alias for future reference. | One Apple Park Way, Cupertino , California, CA 95014, United States.         |
