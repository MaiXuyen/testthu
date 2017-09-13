package quanlyhogiadinh;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import general.ExeclUnitl;
import general.Login;

public class NhanKhauThemTest {
	WebDriver driver;
	NhanKhauThemMoi them = new NhanKhauThemMoi();
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
  public void ktrabuttondong() throws InterruptedException {
	  them.ktrabuttondong(driver);
  }
  @Test(priority = 1)
  public void ktranhapthieuthontinbatbuoc() throws InterruptedException {
	  them.ktranhapthieuthongtinbatbuoc(driver);
  }
  @Test(priority = 2)
  public void ktrabotrongtruongbatbuoc() throws InterruptedException {
	  them.ktrabotrongtruongbatbuoc(driver);
  }
  @Test(priority = 3)
  public void nhapsaicactruongkhongbatbuoc() throws InterruptedException {
	  them.nhapsaicactruongkhongbatbuoc(driver);
  }
  @Test(priority = 4)
  public void themngaysinhsinhlonhonhoacbangnam1990() throws InterruptedException, IOException {
	 them.themngaysinhsinhlonhonhoacbangnam1990(driver);
  }
  @Test(priority = 5)
  public void themNKNgaySinhNhoHonHoacBangNgayHientaiVaLonHonNam1900th2() throws InterruptedException, IOException {
	 them.themNKNgaySinhNhoHonHoacBangNgayHientaiVaLonHonNam1900th2(driver);
  }
  @Test(priority = 6)
  public void themNKTreEmDuoi1TuoiNhapTenNguoiGiamHo() throws InterruptedException, IOException {
	 them.themNKTreEmDuoi1TuoiNhapTenNguoiGiamHo(driver);
  }
  @Test(priority = 7)
  public void themNKNhapMoiQuanHeVoiNguoiGiamHo() throws InterruptedException, IOException {
	 them.themNKNhapMoiQuanHeVoiNguoiGiamHo(driver);
  }
  @Test(priority = 8)
  public void btrongdantoc() throws InterruptedException, IOException {
	 them.btrongdantoc(driver);
  }
  @Test(priority = 9)
  public void btrongquoctich() throws InterruptedException, IOException {
	 them.btrongquoctich(driver);
  }
  @Test(priority = 10)
  public void btrongtongiao() throws InterruptedException, IOException {
	 them.btrongtongiao(driver);
  }
  @Test(priority = 11)
  public void khongchondiachihientilathuongchu() throws InterruptedException, IOException {
	 them.khongchondiachihientilathuongchu(driver);
  }
  @Test(priority = 12)
  public void themoithanhcong() throws InterruptedException, IOException {
	 them.themoithanhcong(driver);
  }
  @Test(priority = 13)
  public void xemthongtinnhankhau() throws InterruptedException, IOException {
	 them.xemthongtinnhankhau(driver);
  }
  @Test(priority = 14)
  public void suathongtinnhankhau() throws InterruptedException, IOException {
	 them.suathongtinnhankhau(driver);
  }
  @Test(priority = 15)
  public void nhankhaudangduocxulylambome() throws InterruptedException, IOException {
	 them.nhankhaudangduocxulylambome(driver);
  }
  @Test(priority = 16)
  public void suathongtinthanhcong() throws InterruptedException, IOException {
	 them.suathongtinthanhcong(driver);
  }
  @Test(priority = 17)
  public void xoathongtinnhankhau() throws InterruptedException, IOException {
	 them.xoathongtinnhankhau(driver);
  }
}
