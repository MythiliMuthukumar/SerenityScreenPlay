@ui
Feature: Home Insurance Enquiry Form

  Scenario: Enquiry Details page shows correct information
    Given "John" is on the home insurance enquiry details page
    Then he should see the page title "Details - Policy Expert"
    Then he should see the following stages are disabled
      | Quotes  |
      | Extras  |
      | Summary |
      | Payment |
    Then he should see the following section headings
      | About you                      |
      | Statements about you           |
      | About your property            |
      | Statements about your property |
      | About safety and security      |
      | About the joint policyholders  |
      | About your insurance history   |
      | About the cover you want       |
    Then he should see "Go to compare quotes" button

  Scenario: Enquiry Details page should not allow empty form submission
    Given "John" is on the home insurance enquiry details page
    When he scroll to the bottom of the page without entering any values
    And he click the "Go to compare quotes" submit button
    Then he should see the validation messages for 31 fields