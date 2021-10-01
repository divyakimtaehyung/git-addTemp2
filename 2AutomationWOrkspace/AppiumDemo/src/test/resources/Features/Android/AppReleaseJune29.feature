Feature: Login mobile application and validating the screen

  @A
  Scenario Outline: login retail banking application and validating the screen
    Given user launch the mobile app with valid capabilities
    When  mobile app is launched
    Then  user click the register button
    And   user enter mailid,monilenumber and DoB <testcase>
    And   user enter otp and click on continue <testcase>
    And   user fill the personal & contact details <testcase>
    And   user fill the identity details <testcase>
    Examples:
      | testcase |
      | TestCase_000|


@B
Scenario Outline: login retail banking application and validating the screen
  Given user launch the mobile app with valid capabilities
  When  mobile app is launched
  Then  user click the register button
  And   user enter DoB <testcase>

  Examples:
    | testcase |
    | TestCase_000|
    | TestCase_001|