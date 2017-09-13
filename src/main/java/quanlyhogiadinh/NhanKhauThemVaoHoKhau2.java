package quanlyhogiadinh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import general.ExeclUnitl;
import object.ThemNhanKhauVaoHoKhau2;

public class NhanKhauThemVaoHoKhau2 {
	public void nhanKhauDangLaChuHo(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.txtMYTCN()).sendKeys(ExeclUnitl.getData(2,2));
		Thread.sleep(2000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.bttimkiem()).click();
		Thread.sleep(2000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.suathongtinnhankahu()).click();
		Thread.sleep(7000);
		WebElement nhankhaudanglachho = driver.findElement(ThemNhanKhauVaoHoKhau2.btMahogd());
		Boolean check = nhankhaudanglachho.isEnabled();
		System.out.println("Fale khi click được vào button mã hộ gia đình");
		Assert.assertFalse(check,"Fale khi click được vào button mã hộ gia đình");
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.btdong()).click();
	}
	public void xoa(WebDriver driver) throws InterruptedException {
	 Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.qlhkxoa()).click();
		Thread.sleep(5000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.chuho1()).sendKeys(ExeclUnitl.getData(2,4));
		driver.findElement(ThemNhanKhauVaoHoKhau2.timkiemxoa()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.suahokhau()).click();

		try {
			boolean xoa;
			do {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement element = driver.findElement(
						By.xpath(".//*[@id='hokhau_dialog']/div[10]/div[1]/div/div[2]/table/tbody/tr[2]/td[5]/a[2]/i"));
				xoa = element.isDisplayed();
				System.out.println(xoa);
				driver.findElement(ThemNhanKhauVaoHoKhau2.xoa4()).click();
				driver.findElement(ThemNhanKhauVaoHoKhau2.tieptucxoa()).click();
			} while (xoa);
		} catch (Exception e) {
			System.out.println("Không tìm thấy dữ liệu");
		}
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.dong()).click();
	}

	public void chuachonquanhechuho(WebDriver driver) throws InterruptedException{
		Thread.sleep(4000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.Quanlynhankhau()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.txtMYTCN()).clear();
		driver.findElement(ThemNhanKhauVaoHoKhau2.txtMYTCN()).sendKeys(ExeclUnitl.getData(3,2));
		driver.findElement(ThemNhanKhauVaoHoKhau2.bttimkiem()).click();
		driver.findElement(ThemNhanKhauVaoHoKhau2.suathongtinnhankahu()).click();
		Thread.sleep(4000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.lammoi()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.btMahogd()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.chuho()).sendKeys(ExeclUnitl.getData(3,4));
		driver.findElement(ThemNhanKhauVaoHoKhau2.bttimkiemchuho()).click();
		driver.findElement(ThemNhanKhauVaoHoKhau2.btthaotac()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.btluuhoso()).click();
		Thread.sleep(5000);
		WebElement chuachonquanhechuho = driver.findElement(ThemNhanKhauVaoHoKhau2.message());
		String getchuachonquanhechuho = chuachonquanhechuho.getText();
		String chuachonquanhechuho1 = ExeclUnitl.getData(3,5);
		System.out.println("Bạn chưa chọn quan hệ với chủ hộ: "+getchuachonquanhechuho);
		Assert.assertEquals(chuachonquanhechuho1, getchuachonquanhechuho);
	} 
	public void nhanKhauKhongLaChuHo(WebDriver driver) throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.btMahogd()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.chuho()).sendKeys(ExeclUnitl.getData(4,4));
		driver.findElement(ThemNhanKhauVaoHoKhau2.bttimkiemchuho()).click();
		driver.findElement(ThemNhanKhauVaoHoKhau2.btthaotac()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.quahevoichuho()).sendKeys(ExeclUnitl.getData(4, 3));
		driver.findElement(ThemNhanKhauVaoHoKhau2.quahevoichuho()).sendKeys("CC");
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.btluuhoso()).click();
		Thread.sleep(7000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.txtMYTCN()).sendKeys(ExeclUnitl.getData(4,2));
		driver.findElement(ThemNhanKhauVaoHoKhau2.bttimkiem()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.MahogdNVM()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhau2.NVM()).click();
		Thread.sleep(3000);
		WebElement MaYTCN = driver.findElement(ThemNhanKhauVaoHoKhau2.MaYTCNsosanh());
		String getMaYTCN = MaYTCN.getText();
		String MaYTCN1 = ExeclUnitl.getData(4,2);
		System.out.println("Mã y tế ca nhân: "+getMaYTCN);
		
		WebElement quahechho = driver.findElement(ThemNhanKhauVaoHoKhau2.Quanhech());
		String getquahechho = quahechho.getText();
		String quahechho1 = ExeclUnitl.getData(4,3);
		System.out.println("Quan hệ với chủ hộ: "+getquahechho);
		
		Assert.assertEquals(MaYTCN1, getMaYTCN);
		Assert.assertEquals(quahechho1, getquahechho);
		
	}

}
