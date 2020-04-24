@ui
Feature: Home Insurance Enquiry Form - About you section

  Scenario: Enquiry Details page - First Name field verification
    Given "John" is on the home insurance enquiry details page
    When he enters first name as "John"
    Then he should see the "John" in the first name field

  Scenario: Enquiry Details page - First Name validation message verification
    Given "John" is on the home insurance enquiry details page
    When he click the first name field without entering value
    Then he should see the "Please let us know your first name" validation message

  Scenario: Enquiry Details page - Personal Details Help buttons are visible
    Given "John" is on the home insurance enquiry details page
    Then he should see all the available personal details help button