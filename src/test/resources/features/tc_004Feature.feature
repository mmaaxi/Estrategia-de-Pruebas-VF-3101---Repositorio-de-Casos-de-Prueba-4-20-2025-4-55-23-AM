Feature: Validar carga de documento vacío o corrupto

  Scenario: Validar carga de documento dañado o vacío
    Given el usuario ha seleccionado un documento dañada o vacío
    When el usuario procede con la carga
    Then el sistema detecta la corrupción o ausencia de contenido
    And el sistema muestra un mensaje de error de archivo corrupto o vacío