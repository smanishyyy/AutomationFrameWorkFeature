package com.facebook.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.XpathRepository.XpathRepository;
import com.facebook.page.FacebookLoginObj;
import com.facebook.text.Stringtext;

import CustomFunction.cfunIsEleExixt;
import CustomFunction.cfunVerifyString;
import LaunchBrowser.LaunchBrowser;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC02_ValidationOfStaticCharacterWise {
	static WebDriver driver;

	static WebElement element;

	static String str;
	public static boolean flag;

	@Test(priority = 1)
	@When("^check if disclaimer birthday and bottom text element is available$")
	public void main() {
		try {

			flag = FacebookLoginObj.FaceDisclaimerElement(driver);
			System.out.println("FaceDisclaimerElement  is " + cfunIsEleExixt.IsEleExist(flag));
			Reporter.log("\n" + "Disclaimer element is " + cfunIsEleExixt.IsEleExist(flag));
			flag = FacebookLoginObj.FaceBirthdayElement(driver);
			System.out.println("Birthday element is " + cfunIsEleExixt.IsEleExist(flag));
			Reporter.log("\n" + "Bottom text " + cfunIsEleExixt.IsEleExist(flag) + "\n");
			flag = FacebookLoginObj.FaceBottomTextElement(driver);
			System.out.println("Bottom element is " + cfunIsEleExixt.IsEleExist(flag));
			Reporter.log("\n" + "Bottom text " + cfunIsEleExixt.IsEleExist(flag) + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	@And("^Pass the input text of disclaimer$")
	public void Pass__input_text_disclaimer() {
		str = Stringtext.disclaimer;
	}

	@Test(priority = 3)
	@Then("^verify if disclaimer text on application is same as passed in input$")
	public void Verify_disclaimer_text()

	{
		cfunVerifyString.cfunVerifyCharWise(driver, str, XpathRepository.disclaimerXpath);
		Reporter.log("Disclaimer text is verified successfully");
	}

	@Test(priority = 4)
	@And("^Pass the input text of birthday$")
	public void Pass__input_text_birthday() {
		str = Stringtext.birthday;
	}

	@Test(priority = 5)
	@Then("^verify if birthday text on application is same as passed in input$")
	public void Verify_birthday_text()

	{
		cfunVerifyString.cfunVerifyCharWise(driver, str, XpathRepository.BirthdayXpath);
		Reporter.log("birthday text is verified successfully");
	}

	@Test(priority = 6)
	@And("^Pass the input text of bottom text$")
	public void Pass__input_text_bottom() {
		str = Stringtext.bottom;
	}

	@Test(priority = 7)
	@Then("^verify if bottom text on application is same as passed in input$")
	public void Verify_bbottom_text()

	{
		cfunVerifyString.cfunVerifyCharWise(driver, str, XpathRepository.BottomXpathTrue);
		Reporter.log("bottom text is verified successfully");
	}

	@BeforeMethod

	@Given("^Launch the facebook url2$")
	public void before() {
		driver = LaunchBrowser.chromeBrowser();
		Reporter.log("Useron the home page");
	}

	@AfterMethod
	@And("^close the browserr$")
	public void after() {
		driver.close();
		driver.quit();

	}
}
