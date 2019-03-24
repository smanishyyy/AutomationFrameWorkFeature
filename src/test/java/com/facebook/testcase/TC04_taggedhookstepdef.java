package com.facebook.testcase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC04_taggedhookstepdef {

	// global hooks

	/*
	 * @Before(order = 0) public void setup() { System.out.println("Search ff");
	 * System.out.println("Enter url for free crm app"); }
	 * 
	 * @After(order = 0) public void tearDown() {
	 * System.out.println("Close the browser");
	 * 
	 * }
	 * 
	 * @Before(order = 1) public void setup1() {
	 * 
	 * System.out.println("Enter url2 for free crm app"); }
	 */

	@After(order = 1)
	public void tearDown2() {
		System.out.println("Close the browser2");

	}

	@Before("@First")

	public void beforefirst() {
		System.out.println("beforefirst");

	}

	@After("@First")
	public void Afterfirst() {
		System.out.println("Afterfirst");

	}

	@Before("@Second")
	public void beforeSecond() {
		System.out.println("beforeSecond");

	}

	@After("@Second")
	public void AfterSecond() {
		System.out.println("AfterSecond");

	}

	@Before("@Third")
	public void beforeThird() {
		System.out.println("beforeThird");

	}

	@After("@Third")
	public void AfterThird() {
		System.out.println("AfterThird");

	}

	@Given("^this is test first step$")
	public void this_is_test_first_step() {
		System.out.println("1st Step");
	}

	@When("^this is test second step$")
	public void this_is_test_second_step() {
		System.out.println("2nd Step");
	}

	@Then("^this is test third step$")
	public void this_is_test_third_step() {
		System.out.println("3rd Step");
	}
}
