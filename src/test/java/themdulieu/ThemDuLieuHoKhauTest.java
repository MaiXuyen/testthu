package themdulieu;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import general.ExeclUnitl;
import general.Login;


public class ThemDuLieuHoKhauTest {
	WebDriver driver;
	Login login = new Login();
	ThemDuLieuHokhau them = new ThemDuLieuHokhau();
	
	@BeforeClass
	private void setup() throws IOException, InterruptedException {
		System.setProperty("webdriver.gocko.driver", "D:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/login");
		System.out.println("Title: " + driver.getTitle());
		ExeclUnitl.opendExcel("D:\\AutomationTest\\qlhsskcn\\excel\\Testdata-quanlyhososuckhoecanhan.xlsx", "Sheet3");
		login.Login(driver);
		
	}
  @Test(priority = 0)
  public void themoihokhauthanhcong() throws InterruptedException {
	  them.themoihokhauthanhcong1(driver);
  }
  @Test(priority = 1)
  public void themmoiNKVaoHkThanhCong() throws InterruptedException, IOException {
	  them.themmoiNKVaoHkThanhCong(driver);
  }
}
