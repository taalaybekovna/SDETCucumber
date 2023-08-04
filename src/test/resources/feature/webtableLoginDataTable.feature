Feature: Webtable app login with data table
  User Story: User should be able to login webtable application

  @webTableLoginDataTable
  Scenario: login web table app with using data table
    Given user is on the login page of webatable app
    When user enters below credentials
    |username|Test|
    |password|Tester|
    Then user should see url contains orders