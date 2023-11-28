package pageFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class launchBrowser {

	public WebDriver driver;

	public launchBrowser(WebDriver driver) {
		this.driver = driver;
	}

	public void launchUrl() throws IOException {
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(file);
		driver.get(prop.getProperty("url"));
	}

	public void clickText(String textValue) {
		driver.findElement(By.xpath("//*[contains(text(),'" + textValue + "')]")).click();
	}

}
