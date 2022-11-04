package Flipkart;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyPage {
	WebDriver driver;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addtokart;

	public BuyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void AddToKart() {
		ArrayList<String> alladd = new ArrayList <String>(driver.getWindowHandles());
		System.out.println(alladd);
		String a = alladd.get(1);
		driver.switchTo().window(a);
		addtokart.click();
	}

}
