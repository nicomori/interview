package com.krak.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.krak.framework.ParentPage;

public class HomePageKra extends ParentPage {

	public HomePageKra(WebDriver driver) {
		super(driver);
	}
	// Variables section
	// Locator section
	By buttonLogin = By.xpath("(//a[@href='/login'])[2]");

	// Method section
	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	public void makeClickInTheButtonSignIn() {
		System.out.println("Starting to make click in the button login");
		waitForAnExplicitElement(buttonLogin);
		clickJS(buttonLogin);
	}
}
