package com.krak.steps;

import com.krak.framework.ParentScenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class StepsKra extends ParentScenario {

	@Then("in the homepage make click in the button to sign in")
	public void bigWaite22r() {
		homePageKra.makeClickInTheButtonSignIn();
	}

	@Then("make a success login")
	public void bigWaiter333() {
		loginKra.sendValueUserName();
		loginKra.sendValuePassword();
		loginKra.makeClickInLogin();
	}

	@Then("in the dashboard page make click in the dropdown, and select this coin \"(.*)?\"")
	public void bigWaiter4444(String coinName) {
		dashboardKra.makeClickInTheSkipForNowButton();
		dashboardKra.makeClickInTheDropDown(coinName);
	}

	@Then("select this option \"(.*)?\" from the menu")
	public void bigWaiter333333(String menuOptionText) {
		dashboardKra.selectOptionMenuWithParameter(menuOptionText);
	}

	@Then("validate if the values in the menu change")
	public void bigWaiter444444() {
		Assert.assertFalse(
				"Appear an issue at the moment to validate if the values "
						+ "in menu of the dashboard change after change the value in " + "the list.",
				dashboardKra.validateIfTheMenuesChangeTheValues());
	}

	@Given("I start the special browser \"(.*)?\"")
	public void accessToTheBrowserSpecial(boolean mobile) {
		System.out.println("Starting an special browser");
		startBrowserSpecial(mobile);
	}
}