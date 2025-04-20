Feature: Validar la integridad de los metadatos asociados al documento

  Scenario: Verificar la correcta carga y visualización de metadatos del documento
    Given I have uploaded a document with metadata name 'My Document', date '2023-10-01', and author 'John Doe'
    When I check the metadata on the UI
    Then I should see the metadata name 'My Document', date '2023-10-01', and author 'John Doe' correctly displayed