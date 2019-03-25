package TestNgConcept;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.reportinglog.Log;

public class Assert {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		try {
			DOMConfigurator.configure("D://Workspace//AutomationDemoMaven//LOG4J.XML");

			System.setProperty("webdriver.chrome.driver",
					"D:/Software/eclipse-java-luna-SR2-win32-x86_64/eclipse/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();

			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.google.com");
			Log.info("Successfully entered into the application");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test()
	public void googleTitleTest() {
		String title = driver.getTitle();
		org.testng.Assert.assertEquals(title, "Google123", "itle is not matched");
	}

	@Test()
	public void logoTest()

	{
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		org.testng.Assert.assertTrue(b);
	}

	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}
}
