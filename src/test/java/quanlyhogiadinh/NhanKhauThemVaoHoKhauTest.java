package quanlyhogiadinh;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import general.ExeclUnitl;
import general.Login;

public class NhanKhauThemVaoHoKhauTest {
	WebDriver driver;
	Login login = new Login();
    NhanKhauThemVaohoKhau them = new NhanKhauThemVaohoKhau();
	@BeforeClass
	private void setup() throws IOException, InterruptedException {
		System.setProperty("webdriver.gocko.driver", "D:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/login");
		System.out.println("Title: " + driver.getTitle());
		ExeclUnitl.opendExcel("D:\\AutomationTest\\qlhsskcn\\excel\\Testdata-quanlyhososuckhoecanhan.xlsx", "Sheet4");
		login.Login(driver);
		
	}
  @Test(priority = 0)
  public void chuachonnhankhau() throws InterruptedException {
	  them.chuachonnhankhau(driver);
  }
  @Test(priority = 1)
  public void chuachonloaiquanhe() throws InterruptedException {
	  them.chuachonloaiquanhe(driver);
  }
  @Test(priority = 2)
  public void nhankhaudanglachucuahokhac() throws InterruptedException {
	  them.nhankhaudanglachucuahokhac(driver);
  }
  @Test(priority = 3)
  public void nhankhaudangcoquanhevoihokhac() throws InterruptedException {
	  them.nhankhaudangcoquanhevoihokhac(driver);
  }
  @Test(priority = 4)
  public void themMoiNkVaoHkThanhCong() throws InterruptedException {
	  them.themMoiNkVaoHkThanhCong(driver);
  }
  @Test(priority = 5)
  public void soanhnhankhau() throws InterruptedException {
	  them.soanhnhankhau(driver);
  }
  @Test(priority = 6)
  public void nhanKhauNaydaTonTai() throws InterruptedException {
	  them.nhanKhauNaydaTonTai(driver);
  }
  @Test(priority = 7)
  public void suathongtinnhankhau() throws InterruptedException {
	  them.suathongtinnhankhau(driver);
  }
  @Test(priority = 8)
  public void xoanhankhau() throws InterruptedException {
	  them.xoanhankhau(driver);
  }
}
