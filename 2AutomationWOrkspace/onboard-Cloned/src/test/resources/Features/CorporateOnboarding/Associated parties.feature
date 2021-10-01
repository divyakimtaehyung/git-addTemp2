Feature : Onboarding a corporate user by entering valid Details in Associated parties section

  Scenario Outline: Entering valid details for Associated parties
    Given a corporate onboarding application which is at Input stage
    And a corporate onboarding web portal for RMInput role
    When staff user logs in with the role
    When user selects the new application
    And user fills Entity Details and clicks on continue <testcase>
    And user fills Product and user management and clicks on continue <testcase>
    And user fills Ownership Details and clicks on continue <testcase>
    And user fills assoiciated party details <testcase>
    And user fills assoiciated entity details <testcase>
    Then Corporate entity documents page should be displayed

    Examples:
      | testcase |
      | TestCase_001|