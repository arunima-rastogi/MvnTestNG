package WebDriverExamples;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstantiationExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\Browserdrivers_Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.MILLISECONDS);

		driver.manage().timeouts().setScriptTimeout(100, TimeUnit.MILLISECONDS);

		// custome while loop
		while (true) {
			WebElement ele = null;
			try {
				ele = driver.findElement(By.name("q"));
			} catch (NoSuchElementException ex) {
				break; // button is missing, exit the loop
			}
			if (ele.isDisplayed() == false) {
				break; // button is hidden, exit the loop
			}

			driver.findElement(By.name("q")).sendKeys("Hello world!!");

			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(100))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		driver.get("https://www.google.co.in");

		WebElement ele = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.name("q"));
			}
		});

		WebDriverWait wt = new WebDriverWait(driver, 45);
		WebElement element = wt.until(ExpectedConditions.elementToBeClickable(ele));

		ele.sendKeys("Hello world");
		driver.quit();

	}

}
