package stepDefinitions;

import io.cucumber.java.en.*;
import pageFiles.CommonstepsPage;
import utilis.driverObject;

public class commonSteps {

	public CommonstepsPage common;
	public driverObject object;

	public commonSteps(driverObject object) {
		this.object = object;
		common = object.pageObject.getCommonstepsPage();
	}

	@Then("^assert that \"(.*)\" is displayed$")
	public void assertions(String textValue) {
		common.textAssertions(textValue);
	}

	@When("^user clicks on \"(.*)\" radio button$")
	public void radioButton(String button) {
		common.radioButtonClick(button);
	}

	@When("^user click on \"(.*)\" checkbox$")
	public void checkBox(String Value) {
		common.checkBox(Value);
	}

}
