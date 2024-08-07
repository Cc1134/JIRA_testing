Feature:
  Scenario: Login into JIRA
    Given I am on the login page
    When I enter the username "cassie"
    And I enter the password "123654"
    And I click login button
    Then I am directed to the dashboard


#  Scenario: Create a new user
#    Given
#    When
#    Then
#
#  Scenario: Deactivate a new user
#    Given
#    When
#    Then
#
#  Scenario: assign the current user to different user groups
#    Given
#    When
#    Then