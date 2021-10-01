Feature: Creating corporate onboard application using RMInput role

  @A
  Scenario Outline: Create an application with corporate onboard using RMInput role
    Given a corporate onboarding application which is at Input stage
    And a corporate onboarding web portal for RMInput role
    When staff user logs in with the role
    When user selects the new application
    And  user fills new application with allEntityDetails <testcase>
    And  user fills new application with product and management details <testcase>
    And  user fills new application with OwnershipDetails details <testcase>
    And  user fills new application with Associated party details <testcase>
#    And  user fills upload the Document details <testcase>
    And  user fills tax declaration details <testcase>
    And  user fills sanction details <testcase>
    Then user click the submit button <testcase>
#    Then user acquire the submited application <testcase>

    Examples:
      | testcase |
      | TestCase_001|



  @B
  Scenario Outline: Login Compilance Review role and check the Created application
    Given a corporate onboarding application which is at Input stage
    And a corporate onboarding web portal for CompilanceReview role
    When staff user logs in with the role
    Then user acquire the submited application <testcase>

    Examples:
      | testcase |
      | TestCase_001|


   #editt
  @1
  Scenario Outline: Create an application and filling product & user management details ,Ownershipdetails and Associtrd party details with corporate onboard using RMInput role
    Given a corporate onboarding application which is at Input stage
    And a corporate onboarding web portal for RMInput role
    When staff user logs in with the role
    And  user enter application number <testcase>
    And  user fills  Source wealth details <testcase>


    Examples:
      | testcase |
      | TestCase_001|


