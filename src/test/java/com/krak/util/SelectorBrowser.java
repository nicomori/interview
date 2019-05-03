package com.krak.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SelectorBrowser {

	public static DesiredCapabilities capabilities;

	public static WebDriver createDriverWithoutCapabilities(boolean isMobileEmulator, WebDriver driver) {
		if (isMobileEmulator) {
			driver = OpenBrowserChrome.openBowserWithOutCapabilitiesForEmulateMobile(driver, true);
		} else {
			driver = OpenBrowserChrome.openBowserWithOutCapabilities(driver);
		}
		return driver;
	}

	public static WebDriver createDriverWithoutCapabilities(String browser, WebDriver driver) {

//		switch (browser) {
//		case "chrome":
//			driver = OpenBrowserChrome.openBowserWithOutCapabilities(driver);
//			break;
//		case "chromeEmulationMobile":
//			driver = OpenBrowserChrome.openBowserWithOutCapabilitiesForEmulateMobile(driver, true);
//			break;
//		default:
//			driver = OpenBrowserChrome.openBowserWithOutCapabilities(driver);
//			break;
//		}
		return driver;
	}
}
