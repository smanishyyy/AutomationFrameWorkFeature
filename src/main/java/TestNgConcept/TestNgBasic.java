package TestNgConcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasic {

	@BeforeSuite
	public void setUp() {
		System.out.println("Setup system property");
	}

	@BeforeTest
	public void LaunchBroser() {
		System.out.println("Launch Browser");
	}

	@BeforeClass
	public void Applogin() {
		System.out.println("App login");
	}

	@BeforeMethod
	public void enterUrl() {
		System.out.println("Enter Url");
	}

	@Test(priority = 2, groups = "test")
	public void test() {
		System.out.println("Tset 1");
	}

	@Test(priority = 1, groups = "test")
	public void test3() {
		System.out.println("Tset 2");
	}

	@Test(priority = 2, groups = "tite")
	public void test4() {
		System.out.println("Tset 1");
	}

	@Test(priority = 1, groups = "title")
	public void test2() {
		System.out.println("Tset 2");
	}

	@AfterMethod
	public void LogOut() {
		System.out.println("Logout");
	}

	@AfterClass
	public void CloseBrowser() {
		System.out.println("close Broswer");
	}

	@AfterTest
	public void deleteCookies() {
		System.out.println("Delete cookies");
	}

	@AfterSuite
	public void generateReport() {
		System.out.println("generate Report");
	}

}
