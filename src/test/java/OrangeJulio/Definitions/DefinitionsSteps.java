package OrangeJulio.Definitions;

import org.openqa.selenium.WebDriver;

import OrangeJulio.Pages.LeavePage;
import OrangeJulio.Pages.LoginPage;
import OrangeJulio.Pages.PimPage;
import OrangeJulio.Steps.Conexion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;



public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(driver);
	private PimPage pimPage = new PimPage(driver);
	private LeavePage leavePage = new LeavePage(driver);
	

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}
	
	
	@And("^diligenciar usuario (.*) y password (.*)$")
	public void ingresarLogin(String userName, String pass) {
		this.loginPage = new LoginPage(driver);
		this.loginPage.ingresarLogin(userName, pass);
	}
	
	@And("^llegar a la opcion agregar empleado$")
	public void llegarAddEmployee() {
		this.pimPage = new PimPage(driver);
		this.pimPage.llegarAddEmployee();
	}
	
	@When("^diligencie nombre (.*) y apellido (.*)$")
	public void diligenciaEmpleado(String firstName, String lastName) {
		this.pimPage = new PimPage(driver);
		this.pimPage.diligenciaEmpleado(firstName, lastName);
	}
	
	@When("^buscar el empleado (.*) y selecionar una accion (.*)$")
	public void buscarEmpleadoActions(String employee, String actions) {
		this.leavePage = new LeavePage(driver);
		this.leavePage.buscarEmpleadoActions(employee, actions);
	}
}