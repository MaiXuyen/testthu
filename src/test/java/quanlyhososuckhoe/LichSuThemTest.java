package quanlyhososuckhoe;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import general.ExeclUnitl;
import general.Login;

public class LichSuThemTest {
	WebDriver driver;
	Login login = new Login();
	LichSuThemMoi them = new LichSuThemMoi();
	@BeforeClass
	private void setup() throws IOException, InterruptedException {
		System.setProperty("webdriver.gocko.driver", "D:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/hs-ksk-lap-hs");
		System.out.println("Title: " + driver.getTitle());
		ExeclUnitl.opendExcel("D:\\AutomationTest\\qlhsskcn\\excel\\Testdata-quanlyhososuckhoecanhan.xlsx", "Sheet7");
		login.Login(driver);
	}
  @Test(priority = 0)
  public void boTrongngaykham() throws InterruptedException {
  them.boTrongngaykham(driver);  
  }
  @Test(priority = 1)
  public void boTrongNgayBatDau() throws InterruptedException {
  them.boTrongNgayBatDau(driver);  
  }
  @Test(priority = 2)
  public void boTrongNgayKetThuc() throws InterruptedException {
  them.boTrongNgayKetThuc(driver);  
  }
  @Test(priority = 3)
  public void ngayKhamKhongDuocNhoHonNgayBatDau() throws InterruptedException {
  them.ngayKhamKhongDuocNhoHonNgayBatDau(driver);  
  }
  @Test(priority = 4)
  public void ngayKetThucKhongDuocNhoHonNgayBatDau() throws InterruptedException {
  them.ngayKetThucKhongDuocNhoHonNgayBatDau(driver); 
  }
  @Test(priority = 5)
  public void ngayKhamKhongDuocLonHonNgayKetThuc() throws InterruptedException {
  them.ngayKhamKhongDuocLonHonNgayKetThuc(driver); 
  }
  @Test(priority = 6)
  public void ngayKhamKhongDuocLonHonNgayHientai() throws InterruptedException {
  them.ngayKhamKhongDuocLonHonNgayHientai(driver); 
  }
  @Test(priority = 7)
  public void ngayTaiKhamLonHonNgayKham() throws InterruptedException {
  them.ngayTaiKhamLonHonNgayKham(driver); 
  }
  @Test(priority = 8)
  public void themMoiLichSuThanhCong() throws InterruptedException {
  them.themMoiLichSuThanhCong(driver); 
  }
  @Test(priority = 9)
  public void tenDichvuKongDuocDeTrong() throws InterruptedException {
  them.tenDichvuKongDuocDeTrong(driver);  
  }
  @Test(priority = 10)
  public void ketQuaKhongDuocDetrong() throws InterruptedException {
  them.ketQuaKhongDuocDetrong(driver);  
  }
  @Test(priority = 11)
  public void tenThuocKhongDuocDeTrong() throws InterruptedException {
  them.tenThuocKhongDuocDeTrong(driver);  
  }
  @Test(priority = 12)
  public void soLuongKhongDuocDetrong() throws InterruptedException {
  them.soLuongKhongDuocDetrong(driver);  
  }
  @Test(priority = 13)
  public void soLuongPhaiNhapDangSo() throws InterruptedException {
  them.soLuongPhaiNhapDangSo(driver);  
  }
  
}
