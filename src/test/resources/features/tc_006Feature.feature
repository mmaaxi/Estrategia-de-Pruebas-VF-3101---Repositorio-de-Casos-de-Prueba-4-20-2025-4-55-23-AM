Feature: Validate simultaneous upload of multiple documents
  As a user
  I want to upload multiple documents at once
  So that I can efficiently manage document uploads

  Scenario: Validate the simultaneous loading of multiple documents
    Given I have selected multiple valid documents
    When I execute the simultaneous upload
    Then the system accepts the multiple selection
    And all documents are uploaded concurrently without interference