package stepDefinitions;

import io.cucumber.java.en.*;
import pageFiles.AppointmentPage;
import utilis.driverObject;

public class appointmentsteps {

	public AppointmentPage appoint;
	public driverObject object;

	public appointmentsteps(driverObject object) {
		this.object = object;
		appoint = object.pageObject.getAppointmentPage();
	}

	@When("^user selects \"(.*)\" from \"(.*)\" dropdown$")
	public void selectDropDown(String value, String dropDown) {
		appoint.dropDown(dropDown, value);
	}

	@When("^I enter the date \"([^\"]*)\" in the date field \"(.*)\"$")
	public void iEnterTheDateInTheDateField(String datePlaceholder, String value) {
		appoint.selectDates(value, datePlaceholder);
	}

}
