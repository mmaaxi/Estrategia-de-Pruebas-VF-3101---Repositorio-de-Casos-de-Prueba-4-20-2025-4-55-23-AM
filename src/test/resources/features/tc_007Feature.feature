Feature: Validar duplicidad en la carga de documentos

  Scenario: Verificar detección y notificación de documentos duplicados
    Given el usuario está en la página de carga de documentos
    When el usuario carga un documento que ya existe en el sistema
    Then el sistema reconoce la duplicación

    When el usuario intenta cargar el mismo documento nuevamente
    Then se notifica al usuario sobre la duplicidad y se previene la redundancia