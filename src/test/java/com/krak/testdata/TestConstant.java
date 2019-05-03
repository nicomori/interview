package com.krak.testdata;

import org.openqa.selenium.WebDriver;

import com.krak.framework.ParentPage;

public class TestConstant extends ParentPage {

	public TestConstant(WebDriver driver) {
		super(driver);
	}

	/**
	 * Test Groups
	 */
	public static final class UserData {
		public static final String USERNAME = "nmori2";
		public static final String PASSWORD = "A45224610b$";
	}

}
