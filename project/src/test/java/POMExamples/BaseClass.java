package POMExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	private WebDriver driver;

	private static BaseClass obj;
	
	private BaseClass() {
	}

	private WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "c:\\Browserdrivers_Selenium\\chromedriver.exe");
		this.driver = new ChromeDriver();
		return this.driver;
	}

	public static WebDriver getBrowser() {
		if(obj == null) {
			BaseClass obj = new BaseClass();
			return obj.getDriver();
		}
		return obj.getDriver();
	}
}
