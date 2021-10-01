Feature: Creating corporate onboard application using RMInput role

  @A
  Scenario Outline: Create an application with corporate onboard using RMInput role
    Given a corporate onboarding application which is at Input stage
    And a corporate onboarding web portal for RMInput role
    When staff user logs in with the role
    When user selects the new application
    And  user fills Entity Details and clicks on continue <testcase>
    And  user fills Product and user management and clicks on continue <testcase>
    And  user fills Ownership Details and clicks on continue <testcase>
    And  user fills Associated party details and clicks on continue <testcase>
    And  user fills upload the Document details and click on continue<testcase>
    And  user fills Tax declaration Details and clicks on continue <testcase>
    And  user fills sanction details and clicks on continue <testcase>
    Then user click the submit button <testcase>


    Examples:
      | testcase |
      | TestCase_001|



  @B
  Scenario Outline: Login Compilance Review role and check the Created application
    Given a corporate onboarding application which is at Input stage
    And a corporate onboarding web portal for CompilanceReview role
    When staff user logs in with the role
    And user acquires the application under unclaimed application dashboard
    Then user acquire the submited application <testcase>
    And user click on acquired application under my application dashboard
    And user selects EDD Rating as D-Default or risk of default and selects outcome as Approve <testcase>
    And user clicks on sumbit
    And application should be in sanction screening stage

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


