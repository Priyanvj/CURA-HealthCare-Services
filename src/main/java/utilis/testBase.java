package utilis;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testBase {

	public WebDriver driver;

	public WebDriver getWebDriver() throws IOException {
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(file);
		String lbrowser = prop.getProperty("browser");
		String cbrowser = System.getProperty("browser");
		String browser = cbrowser != null ? cbrowser : lbrowser;

		if (driver == null) {
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromiumdriver().setup();
				driver = new ChromeDriver();
			}
			if (browser.equalsIgnoreCase("safari")) {
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
			}

		}
		return driver;
	}

}
