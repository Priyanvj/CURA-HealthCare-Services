package pageFiles;

import org.openqa.selenium.WebDriver;

public class pageObjectManager {

	public WebDriver driver;
	public launchBrowser launch;
	public loginPage login;
	public AppointmentPage appoint;
	public CommonstepsPage common;

	public pageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public launchBrowser getLaunchBrowser() {
		launch = new launchBrowser(driver);
		return launch;
	}

	public loginPage getLoginPage() {
		login = new loginPage(driver);
		return login;
	}

	public AppointmentPage getAppointmentPage() {
		appoint = new AppointmentPage(driver);
		return appoint;
	}

	public CommonstepsPage getCommonstepsPage() {
		common = new CommonstepsPage(driver);
		return common;
	}

}
