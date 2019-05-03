package com.krak.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.krak.framework.ParentPage;
import com.krak.testdata.TestConstant;

public class LoginKra extends ParentPage {

	public LoginKra(WebDriver driver) {
		super(driver);
	}
	
	// Variables section
	// Locator section
	By editfieldUserName = By.xpath("//input[@name='username']");
	By editfieldPassword = By.xpath("//input[@name='password']");
	By buttonLogin = By.xpath("//button[@id='btn-login']");

	// Method section
	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	public void sendValueUserName() {
		System.out.println("Starting to send some value of the username");
		waitForAnExplicitElement(editfieldUserName);
		sendStringToLocator(editfieldUserName, TestConstant.UserData.USERNAME);
	}

	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	public void sendValuePassword() {
		System.out.println("Starting to send some value of the password");
		sendStringToLocator(editfieldPassword, TestConstant.UserData.PASSWORD);
	}

	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	public void makeClickInLogin() {
		System.out.println("starting to complete the login");
		clickJS(buttonLogin);
	}

}
