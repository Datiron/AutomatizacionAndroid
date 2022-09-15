@Swag
Feature: Login en Swag


  Scenario: Login tienda Mobile
    Given estoy en la aplicacion Swag
    When inicio sesion con el usuario "standard_user"
    And contraseña "secret_sauce"
    Then le doy click a login
