package pageFiles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AppointmentPage {

	public WebDriver driver;

	public AppointmentPage(WebDriver driver) {
		this.driver = driver;
	}

	public void dropDown(String dropDown, String Value) {
		WebElement dropdownElement = driver.findElement(By.name(dropDown));
		Select select = new Select(dropdownElement);
		select.selectByValue(Value);
	}

	private String replaceDynamicDatePlaceholder(String input) {
		if (input.matches(".*\\{\\{\\d+-days-(after|before)-today}}.*")) {
			String[] parts = input.split("-days-");
			int days = Integer.parseInt(parts[0].split("\\{\\{")[1]);
			String operator = parts[1].split("-today")[0].trim();
			LocalDate currentDate = LocalDate.now();
			LocalDate newDate;
			if (operator.equalsIgnoreCase("after")) {
				newDate = currentDate.plusDays(days);
			} else if (operator.equalsIgnoreCase("before")) {
				newDate = currentDate.minusDays(days);
			} else {
				newDate = currentDate;
			}
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			return newDate.format(formatter);
		} else {
			return input;
		}
	}

	public void selectDates(String fieldLabel, String date) {
		WebElement dateInputField = driver.findElement(By.xpath("//*[@*='" + fieldLabel + "']"));
		dateInputField.sendKeys(replaceDynamicDatePlaceholder(date));
	}

}
