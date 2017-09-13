package login;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import general.ExeclUnitl;
import login.Login;

public class LoginTest {
	WebDriver driver;
	Login login = new Login();

	@BeforeClass
	private void setup() throws IOException, InterruptedException {
		Thread.sleep(3000);
		System.setProperty("webdriver.gocko.driver", "D:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/login");
		System.out.println("Title: " + driver.getTitle());
		ExeclUnitl.opendExcel("D:\\AutomationTest\\qlhssk\\excel\\Testdata-quanlyhososuckhoecanhan.xlsx", "Sheet0");
	}

	@Test(priority = 0)
	public void botrong() throws InterruptedException {
		login.botrong(driver);
	}
	@Test(priority = 1)
	public void botrongMK() throws InterruptedException{
		login.botrongMK(driver);
	}
	@Test(priority = 2)
	public void botrongtenDN() throws InterruptedException{
		login.botrongtenDN(driver);
	}
	@Test(priority = 3)
	public void nhapsaiMK() throws InterruptedException{
		login.nhapsaiMK(driver);
	}
	@Test(priority = 4)
	public void loginthanhcong() throws InterruptedException{
		login.loginthanhcong(driver);
	}
}
