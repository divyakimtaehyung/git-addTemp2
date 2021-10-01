Feature : Onboarding a corporate user by entering valid Details in Tax Declartion section

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
    And user fills value added tax declaration details <testcase>
    And user fills tax residency details <testcase>
    And user fills foreign account tax details <testcase>
    And user fills common reporting declaration details <testcase>
    Then Sanction page should be displayed

    Examples:
      | testcase |
      | TestCase_001|