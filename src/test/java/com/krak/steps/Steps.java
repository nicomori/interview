package com.krak.steps;

import com.krak.framework.ParentScenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Steps extends ParentScenario {

	@Given("I start the android web test with this device \"(.*)?\"")
	public void accessTheAndroidWebTest(String uuid) {
		startAndroidWebTest(uuid);
	}

	@And("navigate to this \"(.*)?\" in the mobile web")
	public void navigateToSomeUrlInTheMobileWeb(String url) {
		System.out.println("Navigate to the url: " + url);
		navigateTo(url);
	}
}