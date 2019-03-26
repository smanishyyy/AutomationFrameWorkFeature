package LaunchBrowser;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.facebook.reportinglog.Log;

public class LaunchBrowser {
	public static WebDriver driver;

	@Test

	public static WebDriver chromeBrowser(String url, String log) {

		try {
			DOMConfigurator.configure(log);

			System.setProperty("webdriver.chrome.driver",
					"D:/Software/eclipse-java-luna-SR2-win32-x86_64/eclipse/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();

			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(url);
			Log.info("Successfully entered into the application");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

}
