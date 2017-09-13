package themdulieu;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import general.ExeclUnitl;
import object.ThemDuLieuHoKhauObject;


public class ThemDuLieuHokhau {
	public void themoihokhauthanhcong1(WebDriver driver) throws InterruptedException{
		try {
			Thread.sleep(5000);
			driver.findElement(ThemDuLieuHoKhauObject.QuanLyHogiaDinh()).click();
			driver.findElement(ThemDuLieuHoKhauObject.Quanlyhokhau()).click();
			Thread.sleep(3000);
			driver.findElement(ThemDuLieuHoKhauObject.chuho1()).sendKeys(ExeclUnitl.getData(14,3));
			Thread.sleep(3000);
			driver.findElement(ThemDuLieuHoKhauObject.bttimkiem2()).click();
			Thread.sleep(3000);
			driver.findElement(ThemDuLieuHoKhauObject.xoa()).click();
			driver.findElement(ThemDuLieuHoKhauObject.xoa1()).click();

		} catch (Exception e) {
			System.out.println("Không tìm thấy chủ hộ này");
		}
		Thread.sleep(5000);
		driver.findElement(ThemDuLieuHoKhauObject.ThemMoiHoKhau()).click();
		Thread.sleep(3000);
		driver.findElement(ThemDuLieuHoKhauObject.chuho()).click();
		Thread.sleep(5000);
		driver.findElement(ThemDuLieuHoKhauObject.MYTCN()).sendKeys(ExeclUnitl.getData(14, 2));
		driver.findElement(ThemDuLieuHoKhauObject.timkiem()).click();
		driver.findElement(ThemDuLieuHoKhauObject.chinhsua()).click();
		Thread.sleep(4000);
		driver.findElement(ThemDuLieuHoKhauObject.btluu()).click();
		Thread.sleep(3000);
		driver.findElement(ThemDuLieuHoKhauObject.chuhoMDA()).click();
		Thread.sleep(5000);
		WebElement MYTCN = driver.findElement(ThemDuLieuHoKhauObject.MYTCN1());
		String getMYTCN = MYTCN.getText();
		String MYTCN1 = ExeclUnitl.getData(14,2);
		System.out.println("Ma Y te ca nhan : " + getMYTCN);

		WebElement chuho = driver.findElement(ThemDuLieuHoKhauObject.chohososanh());
		String getchuho = chuho.getText();
		String chuho1 = "Chủ hộ";
		System.out.println("chu ho : " + getchuho);

		Assert.assertEquals(MYTCN1, getMYTCN);
		Assert.assertEquals(chuho1, getchuho);
		Thread.sleep(3000);
		driver.findElement(ThemDuLieuHoKhauObject.dongsosanh()).click();
//		Thread.sleep(3000);
//		driver.findElement(ThemDuLieuHoKhauObject.btdong2()).click();
	}
	public void themmoiNKVaoHkThanhCong(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(4000);
		driver.findElement(ThemDuLieuHoKhauObject.themnhankhau()).click();
		driver.findElement(ThemDuLieuHoKhauObject.nhankhau()).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(ThemDuLieuHoKhauObject.MYTCNNK()).sendKeys(ExeclUnitl.getData(15, 4));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(ThemDuLieuHoKhauObject.bttimkiemnk()).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(ThemDuLieuHoKhauObject.Chinhsuank()).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(".//*[@id='field_loaiQh']"));
		Select quanhe = new Select(ele);
		quanhe.selectByVisibleText("Cháu");
		Thread.sleep(3000);
		driver.findElement(ThemDuLieuHoKhauObject.btluuhk()).click();
		Thread.sleep(5000);
		driver.findElement(ThemDuLieuHoKhauObject.TVM()).click();
		Thread.sleep(2000);
		WebElement quanhechuho = driver.findElement(ThemDuLieuHoKhauObject.QuanHCKTRM());
		String getquanhechuho = quanhechuho.getText();
		String quanhechuho1 = "Cháu";
		System.out.println("Them moi quan he thanh cong: " + getquanhechuho);

		WebElement MYTCN = driver.findElement(ThemDuLieuHoKhauObject.MYTCNTVM());
		String getMYTCN = MYTCN.getText();
		String MYTCN1 = ExeclUnitl.getData(15,4);
		System.out.println("Them moi quan he thanh cong: " + getMYTCN);
		Assert.assertEquals(quanhechuho1, getquanhechuho);
		Assert.assertEquals(MYTCN1, getMYTCN);
	}

}
