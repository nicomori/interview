package com.krak.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenBrowserChrome {

	private static final String WIN_DRIVER_PATH = "src/test/resources/drivers/win/chromedriver.exe";
	private static final String MAC_DRIVER_PATH = "src/test/resources/drivers/mac/chromedriver";

	public static WebDriver openBowserWithCapabilities(DesiredCapabilities capabilities) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/nico/Documents/github/example_demo_nicolasmori/chromedriver222");

		WebDriver driver = new ChromeDriver(capabilities);

		driver.manage().window().maximize();

		return driver;
	}

	public static WebDriver openBowserWithOutCapabilities(WebDriver driver) {

		String oS = System.getProperty("os.name").toLowerCase();

		if (oS.contains("windows")) {
			System.setProperty("webdriver.chrome.driver", WIN_DRIVER_PATH);

		} else if (oS.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", MAC_DRIVER_PATH);
		} else {
			System.out.println("This is the OS: " + oS);
			System.out.println("OS is not compatible, you need define the path of the chromedriver again");
			System.exit(0);
		}

		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("--js-flags=--expose-gc");
		options.addArguments("--enable-precise-memory-info");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-default-apps");
		options.addArguments("test-type=browser");
		options.addArguments("disable-infobars");
		options.addArguments("--disable-notifications");
		options.addArguments("window-size=1400,1024");

		// aca agrego la extencion para poder bloquear las imagenes que se carguen en la
		// ejecucion
		options.addExtensions(new File("Block-image_v1.0.crx"));
		// aca agrego la extencion para poder bloquear las publicidades

		try {
			if (System.getProperty("block_ads").equals("true")) {
				options.addExtensions(new File("AdBlock_v3.15.0.crx"));
			} else if (System.getProperty("block_ads").equals("false")) {
				System.out.println("The value into the parameter block_ads is false");
			} else {
				System.out.println("\nAppear a problem in the variable \"block_ads\" you set this value:"
						+ System.getProperty("block_ads") + ", but we can work with true or false");
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println(
					"\nPlease define correctly the Maven variables \"-Dblock_ads\", you need include in this true or false");
			System.exit(0);
		}

		driver = new ChromeDriver(options);

		if (System.getProperty("block_ads").contains("true")) {
			System.out.println("Starting to close the tab for the ads block.");
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			driver.close();
			driver.switchTo().window(tabs2.get(0));
			System.out.println("Finished the close of the tab for the ads block.");
		}

		Point point = new Point(500, 4);
		driver.manage().window().setPosition(point);
		return driver;
	}

	public static WebDriver openBowserWithOutCapabilitiesForEmulateMobile(WebDriver driver, boolean mobile) {
		String oS = System.getProperty("os.name").toLowerCase();

		if (oS.contains("windows")) {
			System.setProperty("webdriver.chrome.driver", "C:/DriversBrowser/chromedriver.exe");

		} else if (oS.contains("mac")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/nico/Documents/github/example_demo_nicolasmori/chromedriver");
		} else {
			System.out.println("This is the OS: " + oS);
			System.out.println("OS is not compatible, you need define the path of the chromedriver again");
			System.exit(0);
		}

		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Google Nexus 5");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

		driver = new ChromeDriver(capabilities);

		return driver;
	}

}
