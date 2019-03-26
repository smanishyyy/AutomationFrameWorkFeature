package com.facebook.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.facebook.page.FacebookLoginObj;

import CustomFunction.SelectAlldataFromDrpDwn;
import CustomFunction.cusToVerifyText;
import LaunchBrowser.LaunchBrowser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC01_FacebookHomePageVerify {
	static WebDriver driver;

	static WebElement element;

	@Test
	@When("^Verify if all the elemnet and text is presrnt on the login page$")
	public void main() {
		try {

			element = FacebookLoginObj.FacebokkTitleObj(driver);
			System.out.println("FacebokkTitleObj  is present");
			element = FacebookLoginObj.FaceDateDropDwnObj(driver);
			System.out.println("FaceDateDropDwnObj  is present");
			element = FacebookLoginObj.FaceEmailBoxObj(driver);
			System.out.println("FaceEmailBoxObj  is present");
			element = FacebookLoginObj.FaceFemaleRdioBtnObj(driver);
			String Xpath;
			System.out.println("FaceFemaleRdioBtnObj  is present");
			element = FacebookLoginObj.FaceFemaleRdioBtnObj(driver);
			System.out.println("FaceFemaleRdioBtnObj  is present");
			element = FacebookLoginObj.FaceFrstNameEdtBoxObj(driver);
			System.out.println("FaceFrstNameEdtBoxObj  is present");
			element = FacebookLoginObj.FaceLoginBtnObj(driver);
			System.out.println("FaceLoginBtnObj  is present");
			element = FacebookLoginObj.FaceMaleRdioBtnObj(driver);
			System.out.println("FaceMaleRdioBtnObj  is present");
			element = FacebookLoginObj.FaceMobNumbEdtBoxObj(driver);
			System.out.println("FaceMobNumbEdtBoxObj  is present");
			element = FacebookLoginObj.FaceMonthDwnObj(driver);
			System.out.println("FaceMonthDwnObj  is present");
			element = FacebookLoginObj.FaceNewPwdEdtBoxObj(driver);
			System.out.println("FaceNewPwdEdtBoxObj  is present");
			element = FacebookLoginObj.FaceSignUpBtnObj(driver);
			System.out.println("FaceSignUpBtnObj  is present");
			element = FacebookLoginObj.FaceSurNameEdtBoxObj(driver);
			System.out.println("FaceSurNameEdtBoxObj  is present");
			element = FacebookLoginObj.FaceYearDwnObj(driver);
			System.out.println("FaceYearDwnObj  is present");
			element = FacebookLoginObj.FaceNewPwdEdtBoxObj(driver);
			System.out.println("FaceNewPwdEdtBoxObj  is present");
			Xpath = "//*[@id='reg_form_box']//p";
			String disclaimer = "By clicking Sign Up, you agree to our Terms, Data Policy and Cookie Policy. You may receive SMS notifications from us and can opt out at any time.";
			String text = "Disclaimer text";
			cusToVerifyText.cusToVerifyTextp(driver, Xpath, disclaimer, text);

			Xpath = "//*[@title='Click for more information']";
			String Birthday = "Why do I need to provide my date of birth?";
			String text2 = "Birthday text";
			cusToVerifyText.cusToVerifyTextp(driver, Xpath, Birthday, text2);

			Xpath = "//div[@id='reg_pages_msg']";
			String BtmTxt = "Create a Page for a celebrity, band or business.";
			String text3 = "Bottom text";
			cusToVerifyText.cusToVerifyTextp(driver, Xpath, BtmTxt, text3);

			SelectAlldataFromDrpDwn.SelectAlldataDrpDownById(driver, "month");

			SelectAlldataFromDrpDwn.SelectAlldataDrpDownById(driver, "day");
			SelectAlldataFromDrpDwn.SelectAlldataDrpDownById(driver, "year");
			Reporter.log("All elemet is available as provided in story");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod

	@Given("^Launch the facebook url \"(.*)\" and \"(.*)\"$")
	@Parameters({ "url", "log4jPath","DriverPath" })
	public void before(String str, String log) {

		driver = LaunchBrowser.chromeBrowser(str, log);
		Reporter.log("Useris on the home page");
	}

	@AfterMethod
	@Then("^close the browser$")
	public void after() {

		driver.quit();
		Reporter.log("Close the browser");

	}
}
