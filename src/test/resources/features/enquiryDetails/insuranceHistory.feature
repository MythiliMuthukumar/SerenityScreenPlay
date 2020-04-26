@ui
Feature: Home Insurance Enquiry Form - Insurance History Section

  Scenario: Enquiry Details page - Shows Insurance History question and consecutive years dropdown
    Given "John" is on the home insurance enquiry details page
    Then he should see the "How many consecutive years have you held home insurance?" question
    Then he should see the below insurance history dropdown options
      | Less than a year                     |
      | 1 year                               |
      | 2 years                              |
      | 3 years                              |
      | 4 years                              |
      | 5 years                              |
      | 6 years                              |
      | 7 years                              |
      | 8 years                              |
      | 9 years                              |
      | 10 or more years                     |
      | Not bought home insurance before     |
      | First time buyer / first time renter |


  Scenario: Enquiry Details page - Shows Cover details question, Today & Tomorrow option
    Given "John" is on the home insurance enquiry details page
    Then he should see the "In the past 3 years, has anyone living at the property made any home insurance claims or reported any losses to an insurer?" question