package TestNgConcept;

import org.testng.annotations.Test;

public class TestNgFeature {

	@Test
	public void loginTest() {
		System.out.println("Login test");
		// int i = 9 / 0;
	}

	@Test(dependsOnMethods = "loginTest")
	public void Homepagetest() {
		System.out.println("Home page test");
	}

	@Test(dependsOnMethods = "loginTest")
	public void searchPagetest() {
		System.out.println("SearchPage test");
	}

	@Test(dependsOnMethods = "loginTest")
	public void regPagetest() {
		System.out.println("Reg Page test");
	}

}
