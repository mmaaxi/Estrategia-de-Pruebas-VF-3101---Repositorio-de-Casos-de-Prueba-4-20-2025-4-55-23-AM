Feature: Validate UI messages and feedback during upload

  Scenario: Validate progress indicators and success message during document upload
    Given I start uploading a document
    Then the interface should show progress indicators
    When the upload is completed
    Then a success message should be displayed
    And the list of uploaded documents should be updated