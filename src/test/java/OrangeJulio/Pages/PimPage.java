package OrangeJulio.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import OrangeJulio.Steps.ButtonPages;

public class PimPage {

	private ButtonPages buttonPages;
	
	public PimPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	this.buttonPages = new ButtonPages(driver);
	}
	
	public void llegarAddEmployee() {
		buttonPages.btnPim();
		buttonPages.btnAdd();
	}
	
}
