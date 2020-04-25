@ui
Feature: Home Insurance Enquiry Form - Property Details

  Scenario: Enquiry Details page - Property Address field shows text message
    Given "John" is on the home insurance enquiry details page
    Then he should see "Start typing a postcode or address" text in the address of property field

  Scenario: Enquiry Details page - Property Address field shows validation message
    Given "John" is on the home insurance enquiry details page
    When he click the property address field without entering value
    Then he should see the "Please start to type in your address" validation message

  Scenario: Enquiry Details page - Property Address field shows enter manual address button & suggestion dropdown
    Given "John" is on the home insurance enquiry details page
    When he starts to enter the address "EC" in the property address field
    Then he should see the "Enter address manually" button
    Then he should see the address suggestion dropdown

  @manual
  Scenario: Enquiry Details page - Shows Property details manual entry address fields
    Given "John" is on the home insurance enquiry details page
    When he starts to enter the address "EC" in the property address field
    And he click the "Enter address manually" button
    Then he should see the label and empty field for "Address line 1"
    Then he should see the label and empty field for "Address line 2"
    Then he should see the label and empty field for "Address line 3"
    Then he should see the label and empty field for "Address line 4"
    Then he should see the label and empty field for "Town"
    Then he should see the label and empty field for "Postcode"

  @manual
  Scenario: Enquiry Details page - Property manual address field cancel/save button
    Given "John" is on the home insurance enquiry details page
    When he starts to enter the address "EC" in the property address field
    And he click the "Enter address manually" button
    Then he should see the address section "cancel" button
    Then he should see the address section "save" button


