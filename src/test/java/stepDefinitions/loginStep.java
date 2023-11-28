package stepDefinitions;

import io.cucumber.java.en.When;
import pageFiles.loginPage;
import utilis.driverObject;

public class loginStep {

	public loginPage login;
	public driverObject object;

	public loginStep(driverObject object) {
		this.object = object;
		login = object.pageObject.getLoginPage();
	}

	@When("^user enters \"(.*)\" into field \"(.*)\"$")
	public void enterTextValue(String Value, String textField) {
		login.enterText(textField, Value);
	}

	@When("user clicks on login Button")
	public void clickLoginButton() {
		login.loginButton();
	}

}
