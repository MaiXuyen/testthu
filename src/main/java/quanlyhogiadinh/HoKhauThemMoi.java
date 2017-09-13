package quanlyhogiadinh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import general.ExeclUnitl;
import object.ThemHokhauObject;


public class HoKhauThemMoi {
	public void Kiemtrabtdong(WebDriver driver) throws InterruptedException{
		Thread.sleep(4000);
		driver.findElement(ThemHokhauObject.QuanLyHogiaDinh()).click();
		driver.findElement(ThemHokhauObject.Quanlyhokhau()).click();
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.ThemMoiHoKhau()).click();
		Thread.sleep(2000);
		driver.findElement(ThemHokhauObject.btdong()).click();
		Thread.sleep(2000);
		WebElement ktrabtdong = driver.findElement(ThemHokhauObject.qlhk());
		String getktrabtdong = ktrabtdong.getText();
		String ktrabtdong1 = "Quản lý hộ khẩu";
		System.out.println("Hiển thị ra màn hình quản lý hộ khẩu :"+getktrabtdong);
		Assert.assertEquals(ktrabtdong1,getktrabtdong);
	}
	public void chuanhaptenchuho(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.ThemMoiHoKhau()).click();
		Thread.sleep(2000);
		driver.findElement(ThemHokhauObject.btluu()).click();
		Thread.sleep(3000);
		WebElement chuanhaptenchuho = driver.findElement(ThemHokhauObject.message());
		String getchuanhaptenchuho = chuanhaptenchuho.getText();
		String chuanhaptenchuho1 = ExeclUnitl.getData(3,6);
		System.out.println("Chưa nhập tên chủ hộ :"+getchuanhaptenchuho);
		Assert.assertEquals(chuanhaptenchuho1,getchuanhaptenchuho);
		
	}
	public void ktrabttaomoihokhau(WebDriver driver) throws InterruptedException{
		Thread.sleep(5000);
		WebElement taomoihokhau = driver.findElement(ThemHokhauObject.bttaomoihokhau());
		Boolean check = taomoihokhau.isEnabled();
		System.out.println("Fale khi tao mới hộ khẩu");
		Assert.assertFalse(check, "Fale khi tao mới hộ khẩu");
		
	}
	public void dodaiqua13kitu(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.btchuho()).click();
		Thread.sleep(4000);
		driver.findElement(ThemHokhauObject.MaYTCN()).sendKeys(ExeclUnitl.getData(5,2));
		Thread.sleep(3000);
		WebElement dodaiqua13kitu = driver.findElement(ThemHokhauObject.message());
		String getdodaiqua13kitu = dodaiqua13kitu.getText();
		String dodaiqua13kitu1 = ExeclUnitl.getData(5,6);
		System.out.println("Độ dài nhạp quá giá trị maxlength :"+getdodaiqua13kitu);
		Assert.assertEquals(dodaiqua13kitu1,getdodaiqua13kitu);
	}
	public void nhapMYTCNbangmotgiatribatki(WebDriver driver) throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(ThemHokhauObject.MaYTCN()).clear();
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.MaYTCN()).sendKeys(ExeclUnitl.getData(6,2));
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.bttimkiem()).click();
		Thread.sleep(3000);
		WebElement nhapMYTCNbangmotgiatribatki = driver.findElement(ThemHokhauObject.message());
		String getnhapMYTCNbangmotgiatribatki = nhapMYTCNbangmotgiatribatki.getText();
		String nhapMYTCNbangmotgiatribatki1 = ExeclUnitl.getData(6,6);
		System.out.println("Mã Y tế cá nhân nhập bằng một giá trị bất kì :"+getnhapMYTCNbangmotgiatribatki);
		Assert.assertEquals(nhapMYTCNbangmotgiatribatki1,getnhapMYTCNbangmotgiatribatki);
	}
	public void ktranhankhaudalachucuahokhac(WebDriver driver) throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(ThemHokhauObject.MaYTCN()).clear();
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.MaYTCN()).sendKeys(ExeclUnitl.getData(7,2));
		driver.findElement(ThemHokhauObject.bttimkiem()).click();
		Thread.sleep(2000);
		driver.findElement(ThemHokhauObject.btchinhsua()).click();
		Thread.sleep(3000);
		WebElement ktranhankhaudalachucuahokhac = driver.findElement(ThemHokhauObject.message());
		String getktranhankhaudalachucuahokhac = ktranhankhaudalachucuahokhac.getText();
		String ktranhankhaudalachucuahokhac1 = ExeclUnitl.getData(7,6);
		System.out.println(" Nhân Khẩu đang là chủ của hộ khác:"+getktranhankhaudalachucuahokhac);
		Assert.assertEquals(ktranhankhaudalachucuahokhac1,getktranhankhaudalachucuahokhac);
		Thread.sleep(4000);
		driver.findElement(ThemHokhauObject.thoat1()).click();
		Thread.sleep(8000);
		driver.findElement(ThemHokhauObject.dong()).click();
	}
	public void themoihokhauthanhcong(WebDriver driver) throws InterruptedException{
		try {
			Thread.sleep(5000);
			driver.findElement(ThemHokhauObject.chuho1()).sendKeys(ExeclUnitl.getData(8,3));
			Thread.sleep(3000);
			driver.findElement(ThemHokhauObject.bttimkiem2()).click();
			Thread.sleep(3000);
			driver.findElement(ThemHokhauObject.xoa()).click();
			driver.findElement(ThemHokhauObject.xoa1()).click();

		} catch (Exception e) {
			System.out.println("Không tìm thấy chủ hộ này");
		}
		Thread.sleep(5000);
		driver.findElement(ThemHokhauObject.ThemMoiHoKhau()).click();
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.chuho()).click();
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.MYTCN()).sendKeys(ExeclUnitl.getData(8, 2));
		driver.findElement(ThemHokhauObject.timkiem()).click();
		driver.findElement(ThemHokhauObject.chinhsua()).click();
		Thread.sleep(5000);
		driver.findElement(ThemHokhauObject.btluu()).click();
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.chuhoMDA()).click();
		Thread.sleep(5000);
		WebElement MYTCN = driver.findElement(ThemHokhauObject.MYTCN1());
		String getMYTCN = MYTCN.getText();
		String MYTCN1 = ExeclUnitl.getData(8,2);
		System.out.println("Ma Y te ca nhan : " + getMYTCN);

		WebElement chuho = driver.findElement(ThemHokhauObject.chohososanh());
		String getchuho = chuho.getText();
		String chuho1 = "Chủ hộ";
		System.out.println("chu ho : " + getchuho);

		Assert.assertEquals(MYTCN1, getMYTCN);
		Assert.assertEquals(chuho1, getchuho);
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.dongsosanh()).click();
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.btdong2()).click();
	}
	public void ktrabtxemchitiet(WebDriver driver) throws InterruptedException{
		Thread.sleep(4000);
		driver.findElement(ThemHokhauObject.chuho1()).sendKeys(ExeclUnitl.getData(9,3));
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.bttimkiem2()).click();
		Thread.sleep(2000);
		driver.findElement(ThemHokhauObject.btxemchitiet()).click();
		Thread.sleep(3000);
		WebElement xemchitietthontinhokhau = driver.findElement(ThemHokhauObject.thongtinchitiethokhau());
		String getxemchitietthontinhokhau = xemchitietthontinhokhau.getText();
		String xemchitietthontinhokhau1 = "Thông tin chi tiết hộ khẩu";
		System.out.println("Hiển thị bảng thôn tin chi tiết hộ khẩu : " + getxemchitietthontinhokhau);
		Assert.assertEquals(xemchitietthontinhokhau1, getxemchitietthontinhokhau);
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.btdong3()).click();
	}
	public void chuacodulieuthaydoi(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.btsuahokhau()).click();
		Thread.sleep(5000);
		driver.findElement(ThemHokhauObject.btluuhk()).click();
		Thread.sleep(3000);
		WebElement chuacodulieuthaydoi = driver.findElement(ThemHokhauObject.message());
		String getchuacodulieuthaydoi = chuacodulieuthaydoi.getText();
		String chuacodulieuthaydoi1 = ExeclUnitl.getData(10,6);
		System.out.println("Chưa có dữ liệu thay đổi : " + getchuacodulieuthaydoi);
		Assert.assertEquals(chuacodulieuthaydoi1, getchuacodulieuthaydoi);
		Thread.sleep(3000);
		
	}
	public void suathongtinchuho(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.btsuathontinchuho()).click();
		Thread.sleep(3000);
		WebElement alertmessage;
		String getalertmessage = driver.switchTo().alert().getText();
		String message = ExeclUnitl.getData(11, 6);
		System.out.println("Bạn không được sửa thông tin chủ hộ: " + getalertmessage);
		Assert.assertEquals(message, getalertmessage);
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public void xoathongtinchuho(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.btxoathontinchuho()).click();
		Thread.sleep(3000);
		WebElement alertmessage;
		String getalertmessage = driver.switchTo().alert().getText();
		String message = ExeclUnitl.getData(12, 6);
		System.out.println("Bạn không được xóa thông tin chủ hộ: " + getalertmessage);
		Assert.assertEquals(message, getalertmessage);
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.btdong4()).click();
	}
	public void xoahokhau(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.chuho1()).sendKeys(ExeclUnitl.getData(8,3));
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.bttimkiem2()).click();
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.btxoahokhau()).click();
		Thread.sleep(3000);
		WebElement xoahokhau = driver.findElement(ThemHokhauObject.xacnhanhanhdongxoa());
		String getxoahokhau= xoahokhau.getText();
		String xoahokhaui1 = "Xác nhận hành động xóa";
		System.out.println("Bạn có muốn xóa hộ khẩu này : " + getxoahokhau);
		Assert.assertEquals(xoahokhaui1, getxoahokhau);
		Thread.sleep(3000);
		driver.findElement(ThemHokhauObject.btdonghokhau()).click();
		
		
	}

}
