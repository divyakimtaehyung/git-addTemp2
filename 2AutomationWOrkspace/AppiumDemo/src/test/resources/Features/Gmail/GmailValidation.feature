Feature: Login gmail application and validating the screen

  @A
  Scenario Outline: login gmail application and validating the screen
    Given user launch the gmail mobile app with valid capabilities
    When  gmail app is launched <testcase>
    Then  user send the message <testcase>

    Examples:
      | testcase |
      | TestCase_000|


