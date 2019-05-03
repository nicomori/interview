package com.krak.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.krak.framework.ParentPage;

public class DashboardKra extends ParentPage {

	public DashboardKra(WebDriver driver) {
		super(driver);
	}

	// Variables section
	Map<String, String> mapFirstList = new HashMap<String, String>();
	Map<String, String> mapSecondList = new HashMap<String, String>();

	// Locator section
	By popupButtonSkipForNow = By.xpath("//div[contains(@class,'kraken-modal')]//button");
	By buttonOpenListOfCoins = By.xpath("//a[@id='pairselect-button']");

	String tableOfTopKeys = "//div[@id='ticker-top']/ul/li/div[@class='key']";
	String tableOfTopValues = "//div[@id='ticker-top']/ul/li/div[@class='val mono']";
	String menuOptionWithParameter = "//div[@class='clearfix']//*[contains(text(),'%s')]";
	String optionListOfCoins = "(//ul[@class='dropdown-menu currencylist']//*[contains(text(),'%s')])[1]";

	
	// Method section
	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	public void makeClickInTheSkipForNowButton() {
		System.out.println("making click in the button skip for now");
		waitForAnExplicitElement(popupButtonSkipForNow);
		clickJS(popupButtonSkipForNow);
	}

	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	public void makeClickInTheDropDown(String coinname) {
		System.out.println("starting to make click in the dropdown of the differents coins.");
		waitForAnExplicitElement(buttonOpenListOfCoins);

		mapFirstList = integrate2ListInAHashMap(tableOfTopKeys, tableOfTopValues);

		clickJS(buttonOpenListOfCoins);
		waitForAnExplicitElement(By.xpath(String.format(optionListOfCoins, coinname)));
		clickJS(By.xpath(String.format(optionListOfCoins, coinname)));
		
		mapSecondList = integrate2ListInAHashMap(tableOfTopKeys, tableOfTopValues);
	}

	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	@SuppressWarnings("unlikely-arg-type")
	public boolean validateIfTheMenuesChangeTheValues() {
		System.out.println("Starting to validate if the values in the menu change.");

		if (mapFirstList.containsValue(mapSecondList)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * this method make the change the selector of flight type to one way
	 * 
	 */
	public void selectOptionMenuWithParameter(String menuOptionText) {
		System.out.println("Starting to select the option of the menu with the text: " + menuOptionText);
		clickJS(By.xpath(String.format(menuOptionWithParameter, menuOptionText)));
	}

}
