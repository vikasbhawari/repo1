package Flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLogin {
	WebDriver driver;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement Username;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement Password;

	@FindBy(xpath = "(//span[text()='Login'])[2]")
	private WebElement submit;

	public FlipkartLogin(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}

	public void entreUserName() {
		Username.sendKeys("9145120488");
	}

	public void entrePassword() {
		Password.sendKeys("87962198");
	}

	public void submitbutton() {
		submit.click();
	}

}
