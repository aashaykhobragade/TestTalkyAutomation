@Test
Feature: talky.io validations
    Scenario: talky.io test Scenario
    
    Given User is already on talky page
    Then User clicks Start a Chat
    Then User Allow camera access
    And User Allow microphone access
    Then User clicks join the call
    