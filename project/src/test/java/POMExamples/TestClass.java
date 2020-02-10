package POMExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	private WebDriver driver;

	@BeforeTest
	public void setup() {
		System.out.println("Starting browser");
		this.driver = BaseClass.getBrowser();
		driver.get("http://www.google.co.in");
	}

	@Test
	public void myFunction() {
		WebElement ele = driver.switchTo().activeElement();
		System.out.println("Active Element on this page: "+ele.getAttribute("name"));
		PageClasses obj = new PageClasses(driver);
		obj.enterSearch("Hello");
	}

	@AfterTest
	public void tearUp() {
		this.driver.quit();
	}

}
