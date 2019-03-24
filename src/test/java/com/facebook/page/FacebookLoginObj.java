package com.facebook.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.facebook.XpathRepository.XpathRepository;

public class FacebookLoginObj {
	private static WebElement element = null;

	public static WebElement FacebokkTitleObj(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("//*[text()='Facebook']"));

		return element;

	}

	public static WebElement FaceEmailBoxObj(WebDriver driver) {
		// WebDriverWait w=new WebDriverWait(driver, 20);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("//input[@type='email']"));
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));

		return element;

	}

	public static WebElement FacePasswrdBoxObj(WebDriver driver) {
		// WebDriverWait w=new WebDriverWait(driver, 20);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("//input[@type='email']//ancestor::tr//td/input[@type='password']"));
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']//ancestor::tr//td/input[@type='password']]")));

		return element;

	}

	public static WebElement FaceLoginBtnObj(WebDriver driver) {
		// WebDriverWait w=new WebDriverWait(driver, 20);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("//input[@type='email']//ancestor::tr//td/input[@type='password']"));
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']//ancestor::tr//td/input[@type='password']]")));

		return element;

	}

	public static WebElement FaceFrstNameEdtBoxObj(WebDriver driver) {
		// WebDriverWait w=new WebDriverWait(driver, 20);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("//div[text()='First name']//following::input[1]"));
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='First
		// name']//following::input[1]")));

		return element;

	}

	public static WebElement FaceSurNameEdtBoxObj(WebDriver driver) {
		// WebDriverWait w=new WebDriverWait(driver, 20);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("//div[text()='Surname']//following::input[1]"));
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Surname']//following::input[1]")));

		return element;

	}

	public static WebElement FaceMobNumbEdtBoxObj(WebDriver driver) {
		// WebDriverWait w=new WebDriverWait(driver, 20);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("//div[text()='Mobile number or email address']"));
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Mobile
		// number or email address']")));

		return element;

	}

	public static WebElement FaceNewPwdEdtBoxObj(WebDriver driver) {
		// WebDriverWait w=new WebDriverWait(driver, 20);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("//div[text()='New password']"));
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='New
		// password']")));

		return element;

	}

	public static WebElement FaceDateDropDwnObj(WebDriver driver) {
		// WebDriverWait w=new WebDriverWait(driver, 20);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("//select[@id='day']"));
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='day']")));

		return element;

	}

	public static WebElement FaceMonthDwnObj(WebDriver driver) {
		// WebDriverWait w=new WebDriverWait(driver, 20);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("//select[@id='month']"));
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='month']")));

		return element;

	}

	public static WebElement FaceYearDwnObj(WebDriver driver) {
		// WebDriverWait w=new WebDriverWait(driver, 20);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("//select[@id='year']"));
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='year']")));

		return element;

	}

	public static WebElement FaceFemaleRdioBtnObj(WebDriver driver) {
		// WebDriverWait w=new WebDriverWait(driver, 20);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("//*[text()='Female']//../input"));
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Female']//../input")));

		return element;

	}

	public static WebElement FaceMaleRdioBtnObj(WebDriver driver) {
		// WebDriverWait w=new WebDriverWait(driver, 20);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("//*[text()='Male']//../input"));
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Male']//../input")));

		return element;

	}

	public static WebElement FaceSignUpBtnObj(WebDriver driver) {
		// WebDriverWait w=new WebDriverWait(driver, 20);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath("//*[@type='submit'  and @name='websubmit']"));
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='submit'
		// and @name='websubmit']")));

		return element;

	}

	public static boolean FaceDisclaimerElement(WebDriver driver) {
		boolean flag = isElemetExist(XpathRepository.disclaimerXpath, driver);
		if (flag) {
			element = driver.findElement(By.xpath(XpathRepository.disclaimerXpath));
			return true;
		} else {

			return false;
		}

	}

	public static boolean FaceBirthdayElement(WebDriver driver) {
		// WebDriverWait w=new WebDriverWait(driver, 20);

		boolean flag = isElemetExist(XpathRepository.BirthdayXpath, driver);
		if (flag) {
			element = driver.findElement(By.xpath(XpathRepository.BirthdayXpath));
			return true;
		} else {

			return false;
		}
	}

	public static boolean FaceBottomTextElement(WebDriver driver) {
		// WebDriverWait w=new WebDriverWait(driver, 20);
		boolean flag = isElemetExist(XpathRepository.BottomXpathFalse, driver);
		if (flag) {
			element = driver.findElement(By.xpath(XpathRepository.BottomXpathFalse));
			return true;
		} else {

			return false;
		}

	}

	private static boolean isElemetExist(String bottomXpath, WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
			driver.findElement(By.xpath(bottomXpath));

			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

}
