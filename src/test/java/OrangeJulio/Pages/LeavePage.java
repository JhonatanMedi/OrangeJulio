package OrangeJulio.Pages;

import org.openqa.selenium.WebDriver;

import OrangeJulio.Steps.ButtonPages;
import OrangeJulio.Steps.ListsPages;
import OrangeJulio.Steps.Questions;

public class LeavePage {

	private ButtonPages buttonPages;
	private Questions questions;
	private ListsPages listsPages;
	
	public LeavePage(WebDriver driver) {
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);
		this.listsPages = new ListsPages(driver);
	}
	
	public void buscarEmpleadoActions(String employee, String actions) {
		buttonPages.btnLeave();
		questions.scrollSeach(employee);
		listsPages.listActions(employee, actions );
	}
}
