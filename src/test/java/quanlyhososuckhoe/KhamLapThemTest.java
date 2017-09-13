package quanlyhososuckhoe;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import general.ExeclUnitl;
import general.Login;

public class KhamLapThemTest {
	WebDriver driver;
	Login login = new Login();
	KhamLapThemMoi them = new KhamLapThemMoi();
	
	@BeforeClass
	private void setup() throws IOException, InterruptedException {
		System.setProperty("webdriver.gocko.driver", "D:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/hs-ksk-lap-hs");
		System.out.println("Title: " + driver.getTitle());
		ExeclUnitl.opendExcel("D:\\AutomationTest\\qlhsskcn\\excel\\Testdata-quanlyhososuckhoecanhan.xlsx", "Sheet6");
		login.Login(driver);
		
	}
  @Test(priority = 0)
  public void chuaCoDuLieuThayDoi() throws InterruptedException {
	  them.chuaCoDuLieuThayDoi(driver);
	  
  }
  @Test(priority = 1)
  public void checkMau() throws InterruptedException {
	  them.checkMau(driver); 
  }
  @Test(priority = 2)
  public void ngayKhamkhongDuocLonHonNgayhienTai() throws InterruptedException {
	  them.ngayKhamkhongDuocLonHonNgayhienTai(driver); 
  }
  @Test(priority = 3)
  public void ngayHenKhamKhongDuocNhoHonNgayKham() throws InterruptedException {
	  them.ngayHenKhamKhongDuocNhoHonNgayKham(driver); 
  }
  @Test(priority = 4)
  public void khamLapThanhCong() throws InterruptedException {
	  them.khamLapThanhCong(driver); 
  }

@Test(priority = 5)
public void soSanhKhamLap() throws InterruptedException {
	  them.soSanhKhamLap(driver); 
}
}
