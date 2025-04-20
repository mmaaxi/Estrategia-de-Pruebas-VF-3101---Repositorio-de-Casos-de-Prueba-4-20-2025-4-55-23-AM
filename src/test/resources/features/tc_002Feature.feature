Feature: Validar carga de documento con formato no permitido

  Scenario: Intentar cargar un documento con formato no soportado
    Given El usuario está en la página de carga de documentos
    When El usuario selecciona un documento con formato no soportado
    Then El sistema rechaza el archivo

  Scenario: Mostrar mensaje de error al intentar cargar documento no soportado
    Given Un documento con formato no soportado ha sido seleccionado
    When El usuario hace clic en 'Cargar documento'
    Then Se muestra un mensaje de error indicando formato no permitido

  Scenario: Intentar forzar la carga de un documento no soportado
    Given Un documento con formato no soportado ha sido seleccionado
    When El usuario intenta forzar la carga del documento
    Then El sistema bloquea la acción y no realiza la carga