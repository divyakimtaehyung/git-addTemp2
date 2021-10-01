Feature : Onboarding a corporate user by entering valid Details in Product and user management section

  Scenario Outline: Entering valid details for Product and user management
    Given a corporate onboarding application which is at Input stage
    And a corporate onboarding web portal for RMInput role
    When staff user logs in with the role
    When user selects the new application
    And user fills Entity Details and clicks on continue <testcase>
    And user fills product selection details <testcase>
    And user fills adminstation details <testcase>
    Then Build ownership structure page should be displayed

    Examples:
      | testcase |
      | TestCase_001|