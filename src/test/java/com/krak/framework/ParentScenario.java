package com.krak.framework;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.krak.pages.DashboardKra;
import com.krak.pages.HomePageKra;
import com.krak.pages.LoginKra;
import com.krak.steps.StepsHelper;
import com.krak.util.SelectorBrowser;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * This Class is created for make a helper for all the pages, and all the parts
 * of the a native app, or for execute all the drivers. And for create all the
 * objects of pages, or objects created in all the pages.
 * 
 */

public class ParentScenario extends StepsHelper {

	protected static WebDriver driver;

	protected static HomePageKra homePageKra;
	protected static LoginKra loginKra;
	protected static DashboardKra dashboardKra;

	/**
	 * this method create the object driver for Android.
	 * 
	 * @param uuid of the device to use.
	 */
	@SuppressWarnings("rawtypes")
	public void startAndroidWebTest(String uuid) {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability("deviceName", "8575525242395141");

		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		} catch (Exception e) {
			System.out.println("Exeption at the moment to generate the driver = " + e);
		}

		homePageKra = new HomePageKra(driver);
		loginKra = new LoginKra(driver);
		dashboardKra = new DashboardKra(driver);

	}

	public void startBrowserSpecial(boolean mobile) {
		System.out.println("Starting driver for Browser Chrome Special");

		if (mobile) {
			driver = SelectorBrowser.createDriverWithoutCapabilities(mobile, driver);
		} else {
			driver = SelectorBrowser.createDriverWithoutCapabilities(mobile, driver);
		}

	}

	protected void navigateTo(String url) {
		System.out.println("Starting to go to the url: " + url);
		driver.navigate().to(url);
	}

	public void closeDriver() {
		driver.quit();
	}

}
