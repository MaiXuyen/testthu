package themdulieu;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import general.ExeclUnitl;
import general.Login;
import themdulieu.ThemDuLieuNhanKhau;

public class ThemDuLieuNhanKhauTest {
	WebDriver driver;
	ThemDuLieuNhanKhau them = new ThemDuLieuNhanKhau();
	Login login = new Login();
	@BeforeClass
	private void setup() throws IOException, InterruptedException {
		System.setProperty("webdriver.gocko.driver", "D:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/login");
		System.out.println("Title: " + driver.getTitle());
		ExeclUnitl.opendExcel("D:\\AutomationTest\\qlhsskcn\\excel\\Testdata-quanlyhososuckhoecanhan.xlsx", "Sheet2");
		login.Login(driver);
	}
  @Test(priority = 0)
  public void themoinhankhau() throws InterruptedException {
	  them.themoinhankhau(driver);
	  
  }
  @Test(priority = 1)
  public void themoinhankhau1() throws InterruptedException {
	  them.themoinhankhau1(driver);
	  
  }
  @Test(priority = 2)
  public void themoinhankhau2() throws InterruptedException {
	  them.themoinhankhau2(driver);
	  
  }
  @Test(priority = 3)
  public void themoinhankhau3() throws InterruptedException {
	  them.themoinhankhau3(driver);
	  
  }
  @Test(priority = 4)
  public void themoinhankhau4() throws InterruptedException {
	  them.themoinhankhau4(driver);
	  
  }
}
