Feature: Validate document size limit

  Scenario: Attempt to upload a document exceeding the maximum size limit
    Given A document larger than the maximum allowed size
    When The user attempts to upload the document
    Then The system displays a file size error
    And The document upload is rejected
    And The user is informed of the size limit