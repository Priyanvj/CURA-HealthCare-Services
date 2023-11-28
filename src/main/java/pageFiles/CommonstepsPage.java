package pageFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonstepsPage {

	public WebDriver driver;

	public CommonstepsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void textAssertions(String textValue) {
		driver.findElement(By.xpath("//*[contains(text(),'" + textValue + "')]")).isDisplayed();
	}

	public void checkBox(String Value) {
		driver.findElement(By.xpath("//*[@class='checkbox-inline']//*[normalize-space(text()='" + Value + "')]"))
				.click();
	}

	public void radioButtonClick(String radioButton) {
		driver.findElement(By.xpath("//*[@*='" + radioButton + "']")).click();
	}

}
