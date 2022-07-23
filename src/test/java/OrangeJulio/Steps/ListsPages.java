package OrangeJulio.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListsPages {

	private WebDriver driver;
	
	public ListsPages(WebDriver driver) {
		this.driver = driver;
	}
	
public void listActions(String employee, String actions) {
		
		WebElement searchTable = driver.findElement(By.xpath("//tr/td/a[contains(text(),'" + employee
				+ "')]/../../td[8]//select/option[text() = '" + actions + "']"));
		searchTable.click();
	}
}
