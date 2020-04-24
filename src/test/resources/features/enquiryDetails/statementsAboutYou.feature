@ui
Feature: Home Insurance Enquiry Form - Statements About you section

  Scenario: Enquiry Details page - Statements about you agree button function correctly
    Given "John" is on the home insurance enquiry details page
    When he clicks "I agree" button in the statements about you section
    Then he should see "I agree" button is selected

  Scenario: Enquiry Details page - Statements about you disagree button function correctly
    Given "John" is on the home insurance enquiry details page
    When he clicks "I disagree" button in the statements about you section
    Then he should see "I disagree" button is selected

  @manual
  Scenario: Enquiry Details page - Statements about you disagree button questions
    Given "John" is on the home insurance enquiry details page
    When he clicks "I disagree" button in the statements about you section
    Then he should see the listed group statements