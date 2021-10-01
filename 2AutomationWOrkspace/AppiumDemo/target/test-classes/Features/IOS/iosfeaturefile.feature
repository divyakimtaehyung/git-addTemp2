Feature: Login IOS mobile application and validating the screen

  @A
  Scenario Outline: login retail banking application and validating the screen
    Given user launch the IOS mobile app with valid capabilities
    When  mobile app is launched <testcase>
    When user fill the details <testcase>


    Examples:
      | testcase |
      | TestCase_000|

    @B
  Scenario Outline: login retail banking application and validating the screen
    Given user launch the IOS mobile app with valid capabilities
    When  mobile app is launched <testcase>
    When user set the dob field <testcase>


    Examples:
      | testcase |
      | TestCase_000|
