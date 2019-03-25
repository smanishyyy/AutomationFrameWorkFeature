package LaunchBrowser;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.facebook.reportinglog.Log;

public class LaunchBrowser {
	public static WebDriver driver;

	public static WebDriver chromeBrowser() {

		try {
			DOMConfigurator.configure("D://Workspace//AutomationDemoMaven//LOG4J.XML");

			System.setProperty("webdriver.chrome.driver",
					"D:/Software/eclipse-java-luna-SR2-win32-x86_64/eclipse/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();

			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com");
			Log.info("Successfully entered into the application");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

}
