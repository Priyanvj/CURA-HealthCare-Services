package utilis;

import java.io.IOException;
import pageFiles.pageObjectManager;

public class driverObject {

	public testBase base;
	public pageObjectManager pageObject;

	public driverObject() throws IOException {
		base = new testBase();
		pageObject = new pageObjectManager(base.getWebDriver());
	}

}
