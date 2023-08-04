@smoke
Feature: Webtable app login
  User Story: User should be able to login webtable application

  Background: For each scenario user is on web table login page
  Given user is on the login page of webatable app

  @smoke @webTableLogin
  Scenario: Login scenario with valid credentials
    When user enters username Test
    And user enters password Tester
    And user clicks to login button
    Then user should see url contains orders

  @wip
  Scenario: Login scenario with invalid credentials
    When user enters username incorrect
    And user enters password incorrect
    And user clicks to login button
    Then user should see url contains login