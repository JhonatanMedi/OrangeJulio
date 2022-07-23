#Proyecto de pruebas y cargado en Github
#23/07/2022
#Jhonatan Medina Blanco
@Regresion
Feature: Pim

  @AddEmploe @Sprint2
  Scenario Outline: Add Employee
    Given abrir el navegador
    And diligenciar usuario <userName> y password <pass>
    And llegar a la opcion agregar empleado
    When diligencie nombre <firstName> y apellido <lastName>

    Examples: 
      | userName | pass     | firstName | lastName |
      | Admin    | admin123 | Jhontana  | medina   |

  @Sprint3
  Scenario Outline: leave buscar
    Given abrir el navegador
    And diligenciar usuario <userName> y password <pass>
    When buscar el empleado <employee> y selecionar una accion <actions>

    Examples: 
      | userName | pass     | employee | actions |
      | Admin    | admin123 | Joe Root | Cancel  |
