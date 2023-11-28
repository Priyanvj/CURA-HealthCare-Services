package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utilis.driverObject;

public class Hooks {

	public driverObject object;

	public Hooks(driverObject object) {
		this.object = object;
	}

	@AfterStep
	public void waits() throws InterruptedException {
		Thread.sleep(1000);
	}

	@After
	public void closeBrowser() {
		object.pageObject.driver.quit();
	}

	@AfterStep
	public void addScreenshot(Scenario scen) throws IOException {
		WebDriver driver = object.pageObject.driver;
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] filecontent = FileUtils.readFileToByteArray(source);
		scen.attach(filecontent, "image/png", "img");
	}

}
