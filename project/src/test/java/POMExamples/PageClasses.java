package POMExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageClasses {

	private WebDriver driver;

	public PageClasses(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "q")
	WebElement element1;
	
	public void enterSearch(String txt) {
		element1.sendKeys(txt);
	}
}
