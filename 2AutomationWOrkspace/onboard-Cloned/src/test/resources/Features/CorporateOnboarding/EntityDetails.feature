Feature : Onboarding a corporate user by entering valid Details in Entity Details section

  Scenario Outline: Entering valid details for Entity Details
    Given a corporate onboarding application which is at Input stage
    And a corporate onboarding web portal for RMInput role
    When staff user logs in with the role
    When user selects the new application
    And user fills new application with the name address & contact details <testcase>
    And user fills new application with the entity name & type details <testcase>
    And user fills new application with the entity contact & address details <testcase>
    And user fills new application with business details <testcase>
    And user fills new application with Industry details <testcase>
    And user fills  Industry incorporation date details <testcase>
    And user fills  commercial license issue date details <testcase>
    And user fills  Source fund details <testcase>
    And user fills  Source wealth details <testcase>
    Then Product selection page should be displayed

    Examples:
      | testcase |
      | TestCase_001|