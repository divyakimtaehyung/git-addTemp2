Feature : Onboarding a corporate user by entering valid Details in Ownership Details section

  Scenario Outline: Entering valid details for Ownership Details
    Given a corporate onboarding application which is at Input stage
    And a corporate onboarding web portal for RMInput role
    When staff user logs in with the role
    When user selects the new application
    And user fills Entity Details and clicks on continue <testcase>
    And user fills Product and user management and clicks on continue <testcase>
    And user fills ownership structure and percentage details <testcase>
    And user fills ownership details <testcase>
    Then Individual details page should be displayed <testcase>


    Examples:
      | testcase |
      | TestCase_001|