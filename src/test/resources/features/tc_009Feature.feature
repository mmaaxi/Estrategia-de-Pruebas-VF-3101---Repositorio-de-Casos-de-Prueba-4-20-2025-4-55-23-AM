Feature: Validar integración con servicio de procesamiento posterior a la carga

  Scenario: Integración y procesamiento de documento cargado
    Given El usuario ha iniciado sesión y está en la página de carga de documentos
    When El usuario carga un documento válido
    Then El documento se guarda y se envía al servicio de procesamiento
    And El servicio confirma el procesamiento del documento a través de una notificación o mensaje