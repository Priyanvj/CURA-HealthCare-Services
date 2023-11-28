package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.*;
import pageFiles.launchBrowser;
import utilis.driverObject;

public class launchBrowsers {

	public launchBrowser launch;
	public driverObject object;

	public launchBrowsers(driverObject object) {
		this.object = object;
		launch = object.pageObject.getLaunchBrowser();
	}

	@Given("user launches the browser")
	public void launchurl() throws IOException {
		launch.launchUrl();
	}

	@When("^user click on \"(.*)\" textbox$")
	public void clickTextBox(String textBox) {
		launch.clickText(textBox);
	}

}
