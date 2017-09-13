package quanlyhososuckhoe;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import general.ExeclUnitl;
import general.Login;

public class TiemChungThemTest {
	WebDriver driver;
	Login login = new Login();
	TiemChungThemMoi them = new TiemChungThemMoi();
	@BeforeClass
	private void setup() throws IOException, InterruptedException {
		System.setProperty("webdriver.gocko.driver", "D:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/hs-ksk-lap-hs");
		System.out.println("Title: " + driver.getTitle());
		ExeclUnitl.opendExcel("D:\\AutomationTest\\qlhsskcn\\excel\\Testdata-quanlyhososuckhoecanhan.xlsx", "Sheet8");
		login.Login(driver);
	}
 
	  @Test(priority = 0)
		public void themmoiTCMuiTiemKhongDuocBotrong() throws IOException, InterruptedException {
		  them.themmoiTCMuiTiemKhongDuocBotrong(driver);
		}
		@Test(priority = 1)
		public void themmoiTCNgayHenTiemPhaiLonHonHoacbangNgayNguaChung() throws IOException, InterruptedException {
			them.themmoiTCNgayHenTiemPhaiLonHonHoacbangNgayNguaChung(driver);
		}
		@Test(priority = 2)
		public void themmoiTCThanhCong() throws IOException, InterruptedException {
			them.themmoiTCThanhCong(driver);
		}
		@Test(priority = 3)
		public void themmoiTCVacXinMuiTiemDaTonTai() throws IOException, InterruptedException {
			them.themmoiTCVacXinMuiTiemDaTonTai(driver);
		
  }
		@Test(priority = 4)
		public void checkMau() throws IOException, InterruptedException {
			them.checkMau(driver);
		
  }
}
