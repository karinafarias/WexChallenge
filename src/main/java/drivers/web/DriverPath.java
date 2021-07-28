package drivers.web;

import org.openqa.selenium.WebDriver;


public final class DriverPath {

	static String sistema = System.getProperty("os.name").toLowerCase();
	private static final String chrome = "CHROME";
	private static final String firefox = "FIREFOX";
	private static final String explorer = "EXPLORER";
	private static final String message = "Browser not found";
	static DriverChrome driverChrome;
	static DriverFirefox driverFirefox;
	static DriverInternetExplorer driverInternet;
	
	private DriverPath() {}
	
	public static void pathOfDriver(String browser,  WebDriver driver, Boolean headless){
		switch (operatingSystem()) {
		case "Windows":
			pathWindows(browser, driver , headless);
			break;
		
		case "Mac":
			pathMac(browser, driver , headless);
			break;
		
		case "Linux":
			pathLinux(browser, driver , headless);
			break;
			
		default:
			System.err.println(message);
			break;
		}
	}
	
	public static WebDriver startedDriver(String browser) {
		switch (browser) {
		case chrome:
			return driverChrome.getDriver();
		case firefox:
			return driverFirefox.getDriver();
		case explorer:
			return driverInternet.getDriver();
		default:
			System.err.println(message);
			break;
		}
		return null;
	}
	
	private static void pathWindows(String browser, WebDriver driver, Boolean headless) {
		switch (browser) {
		case chrome:
			driverChrome = new DriverChrome(headless);
			break;
		case firefox:
			driverFirefox = new DriverFirefox(headless);
			break;
		case explorer:
			driverInternet = new DriverInternetExplorer(driver);
			break;
		default:
			System.err.println(message);
			break;
		}
	} 
	
	private static void pathMac(String browser, WebDriver driver, Boolean headless) {
		switch (browser) {
		case chrome:
			driverChrome = new DriverChrome(headless);
			break;
		case firefox:
			driverFirefox = new DriverFirefox(headless);
			break;
		case explorer:
			driverInternet = new DriverInternetExplorer(driver);
			break;
		default:
			System.err.println(message);
			break;
		}
	} 
	
	private static void pathLinux(String browser, WebDriver driver, Boolean headless) {
		switch (browser) {
		case chrome:
			driverChrome = new DriverChrome(headless);
			break;
		case firefox:
			driverFirefox = new DriverFirefox(headless);
			break;
		case explorer:
			driverInternet = new DriverInternetExplorer(driver);
			break;
		default:
			System.out.println(message);
			break;
		}
	} 
	
	private static String operatingSystem() {
		if (sistema.contains("windows")) {
			return "Windows";	
		}else if(sistema.contains("mac")) {
			return "Mac";
		}
		else {
			return "Linux";
		}
	}	
}
