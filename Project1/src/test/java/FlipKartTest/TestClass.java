package FlipKartTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePack.BaseClass;
import Flipkart.BuyPage;
import Flipkart.FlipkartHomePage;
import Flipkart.FlipkartLogin;

public class TestClass extends BaseClass{
	WebDriver driver;
	FlipkartLogin login;
	FlipkartHomePage homepage;
	BuyPage addtokart;

	@BeforeClass

	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91708\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		login = new FlipkartLogin(driver);
		homepage = new FlipkartHomePage(driver);
		addtokart = new BuyPage(driver);

		login.entreUserName();
		login.entrePassword();
		login.submitbutton();

		System.out.println("login");
		
	}

	@BeforeMethod
	public void loginPreReq() throws InterruptedException {

	}

	@Test
	public void Homepage() throws InterruptedException {
		Thread.sleep(3000);
		homepage.entreSearchTab();
		Thread.sleep(3000);
		homepage.clickSearchButton();
		Thread.sleep(2000);
		homepage.clickOnRsult();

		System.out.println("homepage");
	}

	@Test(priority = 1)
	public void BuyPage() throws InterruptedException {
		Thread.sleep(3000);
		addtokart.AddToKart();

		System.out.println("AddToKart");
	}

	@AfterMethod()
	public void avoid() throws InterruptedException {

	}

	@AfterClass()
	public void closeBrowser() throws InterruptedException {
	
	}

}
