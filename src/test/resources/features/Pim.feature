#Proyecto de pruebas y cargado en Github
#23/07/2022
#Jhonatan Medina Blanco
@Regresion
Feature: Pim

  @AddEmploe
  @Sprint2
  Scenario Outline: Add Employee
    Given abrir el navegador
    And diligenciar usuario <userName> y password <pass>
    And llegar a la opcion agregar empleado

    Examples: 
      | userName | pass     |
      | Admin    | admin123 |

  @Pepito
  @Sprint2
  Scenario Outline: Add
    Given abrir el navegador
    And diligenciar usuario <userName> y password <pass>
    And llegar a la opcion agregar empleado

    Examples: 
      | userName | pass     |
      | Admin    | admin123 |
