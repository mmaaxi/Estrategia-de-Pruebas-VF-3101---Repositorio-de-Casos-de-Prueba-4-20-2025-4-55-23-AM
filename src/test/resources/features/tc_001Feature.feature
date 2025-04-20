Feature: Validar carga de documento con formato permitido

  Scenario: Cargar un documento válido
    Given El usuario selecciona un documento válido con formato PDF o DOCX
    When El usuario hace clic en el botón 'Cargar documento'
    Then El sistema muestra una notificación de carga exitosa