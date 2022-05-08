@wip
Feature: Currency Specs

  Background:
    Given the user is in the webPage

  Scenario: Sell and Buy Feature

    When the user enters a value into the sell box and buy box returns empty
    Then the user enters a value into the buy box the sell bux returns empty


  Scenario: Currency selection

    When the user selects "Ukraine"
    Then option should be changed to the respective default currency for that country

  Scenario: Exchange amount

    When the paysera amount bigger than bank amount
    Then the loss is displayed
