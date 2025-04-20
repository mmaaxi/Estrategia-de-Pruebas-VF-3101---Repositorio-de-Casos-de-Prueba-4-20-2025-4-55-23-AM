Feature: Validar comportamiento al interrumpir la carga

  Scenario: Validar interrupción de carga de documento al interrumpir conexión a internet
    Given el usuario inicia la carga de un documento de gran tamaño
    When el usuario interrumpe la conexión a internet durante la carga
    Then el proceso de carga se cancela y se indica un error de conexión