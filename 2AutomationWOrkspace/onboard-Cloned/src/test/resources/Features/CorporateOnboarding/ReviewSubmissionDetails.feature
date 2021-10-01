Feature : Onboarding a corporate user by entering valid Details in Sanction section

  Scenario Outline: Entering valid details for Associated parties
    Given a corporate onboarding application which is at Input stage
    And a corporate onboarding web portal for RMInput role
    When staff user logs in with the role
    When user selects the new application
    And user fills Entity Details and clicks on continue <testcase>
    And user fills Product and user management and clicks on continue <testcase>
    And user fills Ownership Details and clicks on continue <testcase>
    And user fills Associated party details and clicks on continue <testcase>
    And user fills upload the Document details and click on continue <testcase>
    And  user fills Tax declaration Details and clicks on continue <testcase>
    And  user fills sanction details and clicks on continue <testcase>
    Then user click the submit button <testcase>

    Examples:
      | testcase |
      | TestCase_001|