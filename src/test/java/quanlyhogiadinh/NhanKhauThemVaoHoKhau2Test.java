package quanlyhogiadinh;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import general.ExeclUnitl;
import general.Login;

public class NhanKhauThemVaoHoKhau2Test {
	WebDriver driver;
	Login login = new Login();
	NhanKhauThemVaoHoKhau2 them = new NhanKhauThemVaoHoKhau2();

	@BeforeClass
	private void setup() throws IOException, InterruptedException {
		System.setProperty("webdriver.gocko.driver", "D:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/tt-ca-nhan");
		System.out.println("Title: " + driver.getTitle());
		ExeclUnitl.opendExcel("D:\\AutomationTest\\qlhsskcn\\excel\\Testdata-quanlyhososuckhoecanhan.xlsx", "Sheet5");
		login.Login(driver);

	}

	@Test(priority = 0)
	public void nhanKhauDangLaChuHo() throws InterruptedException {
		them.nhanKhauDangLaChuHo(driver);
	}
	@Test(priority = 1)
	public void xoa() throws InterruptedException {
		them.xoa(driver);
	}

	@Test(priority = 2)
	public void chuachonnhankhau() throws InterruptedException {
		them.chuachonquanhechuho(driver);
	}

	@Test(priority = 3)
	public void nhanKhauKhongLaChuHo() throws InterruptedException {
		them.nhanKhauKhongLaChuHo(driver);

	}
}
