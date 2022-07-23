package OrangeJulio.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {

	
	@FindBy(how = How.ID, using = "btnLogin")
	private WebElement botnLogin;
	
	@FindBy(how = How.XPATH, using = "//a[@id = 'menu_pim_viewPimModule']")
	private WebElement btnPim;

	
	@FindBy(how = How.XPATH, using = "//input[@value = 'Add']")
	private WebElement btnAdd;
	
	
	
	public ButtonPages(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void botnLogin() {
		botnLogin.click();
	}
	
	public void btnPim() {
		btnPim.click();
	}
	
	public void btnAdd() {
		btnAdd.click();
	}
	
}
