package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomePage {
	WebDriver driver;
	@FindBy(xpath ="//input[@type='text']")
	private WebElement searchtab;
	
	@FindBy(xpath ="//button[@class=\"L0Z3Pu\"]")
	private WebElement searchbutton;
	
	
	@FindBy(xpath ="(//div[text()='vivo T1 Pro 5G (Turbo Black, 128 GB)'])[1]")
	private WebElement clickonresult;
	
	public FlipkartHomePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void entreSearchTab() {
		searchtab.sendKeys("vivo T1 Pro 5G (Turbo Black, 128 GB)");
	}
	public void clickSearchButton() {
		searchbutton.click();
	}
	public void clickOnRsult () {
		clickonresult.click();
	}
}
	
	

