package quanlyhogiadinh;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import general.ExeclUnitl;
import general.Login;


public class HoKhauThemTest {
	WebDriver driver;
	Login login = new Login();
	HoKhauThemMoi them = new HoKhauThemMoi();
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
  public void HoKhauThemMoi() throws InterruptedException {
	  them.Kiemtrabtdong(driver);
  }
  @Test(priority = 1)
  public void chuanhaptenchuho() throws InterruptedException {
	  them.chuanhaptenchuho(driver);
  }
  @Test(priority = 2)
  public void ktrabttaomoihokhau() throws InterruptedException {
	  them.ktrabttaomoihokhau(driver);
  }
  @Test(priority = 3)
  public void dodaiqua13kitu() throws InterruptedException {
	  them.dodaiqua13kitu(driver);
  }
  @Test(priority = 4)
  public void nhapMYTCNbangmotgiatribatki() throws InterruptedException {
	  them.nhapMYTCNbangmotgiatribatki(driver);
  }
  @Test(priority = 5)
  public void ktranhankhaudalachucuahokhac() throws InterruptedException {
	  them.ktranhankhaudalachucuahokhac(driver);
  }
  @Test(priority = 6)
  public void themoihokhauthanhcong() throws InterruptedException {
	  them.themoihokhauthanhcong(driver);
  }
  @Test(priority = 7)
  public void ktrabtxemchitiet() throws InterruptedException {
	  them.ktrabtxemchitiet(driver);
  }
  @Test(priority = 8)
  public void chuacodulieuthaydoi() throws InterruptedException {
	  them.chuacodulieuthaydoi(driver);
  }
  @Test(priority = 9)
  public void suathongtinchuho() throws InterruptedException {
	  them.suathongtinchuho(driver);
  }
  @Test(priority = 10)
  public void xoathongtinchuho() throws InterruptedException {
	  them.xoathongtinchuho(driver);
  }
  @Test(priority = 11)
  public void xoahokhau() throws InterruptedException {
	  them.xoahokhau(driver);
  }
}
