
Feature: Búsqueda en ML

  @ML
  Scenario: Búsqueda simple de producto

    Given que me encuentro en el mercado libre
    When busco el producto "Celulares xiaomi"
    Then valido el texto ""
    And selecciono producto ""
    And compro producto ""