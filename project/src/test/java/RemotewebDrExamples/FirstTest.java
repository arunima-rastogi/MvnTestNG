package RemotewebDrExamples;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirstTest {
	
	@Test
	public void myFunction() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "c:\\Browserdrivers_Selenium\\chromedriver.exe");
		DesiredCapabilities desCap = DesiredCapabilities.chrome();
		desCap.setPlatform(Platform.ANY);
		WebDriver remoteWebDriver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), desCap);
		remoteWebDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		remoteWebDriver.get("http://www.google.com");
		System.out.println(remoteWebDriver.getTitle());
		remoteWebDriver.close();
	}

}
