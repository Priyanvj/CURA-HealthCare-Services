package pageFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	public WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterText(String textBoxValue, String value) {
		driver.findElement(By.xpath("//*[@*='" + textBoxValue + "']")).sendKeys(value);
	}

	public void loginButton() {
		driver.findElement(By.xpath("//*[text()='Password']/following::button")).click();
	}

}
