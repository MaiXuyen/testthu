package quanlyhososuckhoe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import general.ExeclUnitl;
import object.LichSuKhamChuaBenhObject;

public class LichSuThemMoi {
	public void boTrongngaykham(WebDriver driver) throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(LichSuKhamChuaBenhObject.txtMYTCN()).sendKeys(ExeclUnitl.getData(2, 2));
		driver.findElement(LichSuKhamChuaBenhObject.bttimkiemlichsu()).click();
		Thread.sleep(3000);
		driver.findElement(LichSuKhamChuaBenhObject.lichsukhamchubenh()).click();
		Thread.sleep(3000);
		driver.findElement(LichSuKhamChuaBenhObject.btthemmoils()).click();
		Thread.sleep(3000);
		driver.findElement(LichSuKhamChuaBenhObject.txtngaykham()).clear();
		driver.findElement(LichSuKhamChuaBenhObject.txtngaykham()).sendKeys(ExeclUnitl.getData(2,3));
		driver.findElement(LichSuKhamChuaBenhObject.txtngaykham()).clear();
		Thread.sleep(3000);
		WebElement botrongngaykham = driver.findElement(LichSuKhamChuaBenhObject.botrongngaykham());
		String getbotrongngaykham = botrongngaykham.getText();
		String botrongngaykham1 = ExeclUnitl.getData(2,12);
		System.out.println("Không được bỏ trống ngày khám: "+getbotrongngaykham);
		Assert.assertEquals(botrongngaykham1, getbotrongngaykham);
	
	}
	public void boTrongNgayBatDau(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(LichSuKhamChuaBenhObject.ngaybatdau()).clear();
		driver.findElement(LichSuKhamChuaBenhObject.ngaybatdau()).sendKeys(ExeclUnitl.getData(3,4));
		driver.findElement(LichSuKhamChuaBenhObject.ngaybatdau()).clear();
		Thread.sleep(3000);
		WebElement botronggaybatdau = driver.findElement(LichSuKhamChuaBenhObject.botronggaybatdau());
		String getbotronggaybatdau = botronggaybatdau.getText();
		String botronggaybatdau1 = ExeclUnitl.getData(3,12);
		System.out.println("Ngày bắt đầu khám chữa bệnh không được để trống: "+getbotronggaybatdau);
		Assert.assertEquals(botronggaybatdau1, getbotronggaybatdau);
	
	}
	public void boTrongNgayKetThuc(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(LichSuKhamChuaBenhObject.ngayketthuc()).clear();
		driver.findElement(LichSuKhamChuaBenhObject.ngayketthuc()).sendKeys(ExeclUnitl.getData(4,5));
		driver.findElement(LichSuKhamChuaBenhObject.ngayketthuc()).clear();
		Thread.sleep(3000);
		WebElement botrongngayngayketthuc = driver.findElement(LichSuKhamChuaBenhObject.botrongngayngayketthuc());
		String getbotrongngayngayketthuc = botrongngayngayketthuc.getText();
		String botrongngayngayketthuc1 = ExeclUnitl.getData(4,12);
		System.out.println("Ngày kết thúc khám chữa bệnh không được để trống: "+getbotrongngayngayketthuc);
		Assert.assertEquals(botrongngayngayketthuc1, getbotrongngayngayketthuc);
		
		
	}
	public void ngayKhamKhongDuocNhoHonNgayBatDau(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(LichSuKhamChuaBenhObject.txtngaykham()).clear();
		driver.findElement(LichSuKhamChuaBenhObject.txtngaykham()).sendKeys(ExeclUnitl.getData(5,3));
		driver.findElement(LichSuKhamChuaBenhObject.ngaybatdau()).clear();
		driver.findElement(LichSuKhamChuaBenhObject.ngaybatdau()).sendKeys(ExeclUnitl.getData(5,4));
		driver.findElement(LichSuKhamChuaBenhObject.ngayketthuc()).clear();
		driver.findElement(LichSuKhamChuaBenhObject.ngayketthuc()).sendKeys(ExeclUnitl.getData(5,5));
		Thread.sleep(3000);
		driver.findElement(LichSuKhamChuaBenhObject.btluu()).click();
		Thread.sleep(3000);
		WebElement ngaykhamkhongduocnhohonngaybatdau= driver.findElement(LichSuKhamChuaBenhObject.message());
		String getngaykhamkhongduocnhohonngaybatdau = ngaykhamkhongduocnhohonngaybatdau.getText();
		String ngaykhamkhongduocnhohonngaybatdau1 = ExeclUnitl.getData(5,12);
		System.out.println(" Ngày khám không được nhỏ hơn ngày bắt đầu: "+getngaykhamkhongduocnhohonngaybatdau);
		Assert.assertEquals(ngaykhamkhongduocnhohonngaybatdau1, getngaykhamkhongduocnhohonngaybatdau);
		
	}
	public void ngayKetThucKhongDuocNhoHonNgayBatDau(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(LichSuKhamChuaBenhObject.txtngaykham()).clear();
		driver.findElement(LichSuKhamChuaBenhObject.txtngaykham()).sendKeys(ExeclUnitl.getData(6,3));
		Thread.sleep(2000);
		driver.findElement(LichSuKhamChuaBenhObject.ngaybatdau()).clear();
		driver.findElement(LichSuKhamChuaBenhObject.ngaybatdau()).sendKeys(ExeclUnitl.getData(6,4));
		Thread.sleep(2000);
		driver.findElement(LichSuKhamChuaBenhObject.ngayketthuc()).clear();
		driver.findElement(LichSuKhamChuaBenhObject.ngayketthuc()).sendKeys(ExeclUnitl.getData(6,5));
		Thread.sleep(3000);
		driver.findElement(LichSuKhamChuaBenhObject.btluu()).click();
		Thread.sleep(3000);
		WebElement ngaykethuckhongduocnhohonngaybatdau= driver.findElement(LichSuKhamChuaBenhObject.message());
		String getngaykethuckhongduocnhohonngaybatdau = ngaykethuckhongduocnhohonngaybatdau.getText();
		String ngaykethuckhongduocnhohonngaybatdau1 = ExeclUnitl.getData(6,12);
		System.out.println(" Ngày kết thúc không được nhỏ hơn ngày bắt đầu: "+getngaykethuckhongduocnhohonngaybatdau);
		Assert.assertEquals(ngaykethuckhongduocnhohonngaybatdau1, getngaykethuckhongduocnhohonngaybatdau);
	}
		public void ngayKhamKhongDuocLonHonNgayKetThuc(WebDriver driver) throws InterruptedException{
			Thread.sleep(3000);
			driver.findElement(LichSuKhamChuaBenhObject.txtngaykham()).clear();
			driver.findElement(LichSuKhamChuaBenhObject.txtngaykham()).sendKeys(ExeclUnitl.getData(7,3));
			Thread.sleep(2000);
			driver.findElement(LichSuKhamChuaBenhObject.ngaybatdau()).clear();
			driver.findElement(LichSuKhamChuaBenhObject.ngaybatdau()).sendKeys(ExeclUnitl.getData(7,4));
			Thread.sleep(2000);
			driver.findElement(LichSuKhamChuaBenhObject.ngayketthuc()).clear();
			driver.findElement(LichSuKhamChuaBenhObject.ngayketthuc()).sendKeys(ExeclUnitl.getData(7,5));
			Thread.sleep(3000);
			driver.findElement(LichSuKhamChuaBenhObject.btluu()).click();
			Thread.sleep(3000);
			WebElement ngaykhamkhongduocnhohonngayketthuc= driver.findElement(LichSuKhamChuaBenhObject.message());
			String getngaykhamkhongduocnhohonngayketthuc = ngaykhamkhongduocnhohonngayketthuc.getText();
			String ngaykhamkhongduocnhohonngayketthuc1 = ExeclUnitl.getData(7,12);
			System.out.println(" Ngày Khám không được lớn hơn ngày kết thúc: "+getngaykhamkhongduocnhohonngayketthuc);
			Assert.assertEquals(ngaykhamkhongduocnhohonngayketthuc1, getngaykhamkhongduocnhohonngayketthuc);
		
	}
		public void ngayKhamKhongDuocLonHonNgayHientai(WebDriver driver) throws InterruptedException{
			Thread.sleep(3000);
			driver.findElement(LichSuKhamChuaBenhObject.txtngaykham()).clear();
			driver.findElement(LichSuKhamChuaBenhObject.txtngaykham()).sendKeys(ExeclUnitl.getData(8,3));
			Thread.sleep(2000);
			driver.findElement(LichSuKhamChuaBenhObject.ngaybatdau()).clear();
			driver.findElement(LichSuKhamChuaBenhObject.ngaybatdau()).sendKeys(ExeclUnitl.getData(8,4));
			Thread.sleep(2000);
			driver.findElement(LichSuKhamChuaBenhObject.ngayketthuc()).clear();
			driver.findElement(LichSuKhamChuaBenhObject.ngayketthuc()).sendKeys(ExeclUnitl.getData(8,5));
			Thread.sleep(3000);
			driver.findElement(LichSuKhamChuaBenhObject.btluu()).click();
			Thread.sleep(3000);
			WebElement ngaykhamkhongduoclonhonngayhientai= driver.findElement(LichSuKhamChuaBenhObject.message());
			String getngaykhamkhongduoclonhonngayhientai = ngaykhamkhongduoclonhonngayhientai.getText();
			String ngaykhamkhongduoclonhonngayhientai1 = ExeclUnitl.getData(8,12);
			System.out.println(" Ngày Khám không được lớn hơn ngày hiện tại: "+getngaykhamkhongduoclonhonngayhientai);
			Assert.assertEquals(ngaykhamkhongduoclonhonngayhientai1, getngaykhamkhongduoclonhonngayhientai);
		
	}
		public void ngayTaiKhamLonHonNgayKham(WebDriver driver) throws InterruptedException{
			Thread.sleep(3000);
			driver.findElement(LichSuKhamChuaBenhObject.txtngaykham()).clear();
			driver.findElement(LichSuKhamChuaBenhObject.txtngaykham()).sendKeys(ExeclUnitl.getData(9,3));
			Thread.sleep(2000);
			driver.findElement(LichSuKhamChuaBenhObject.ngaybatdau()).clear();
			driver.findElement(LichSuKhamChuaBenhObject.ngaybatdau()).sendKeys(ExeclUnitl.getData(9,4));
			Thread.sleep(2000);
			driver.findElement(LichSuKhamChuaBenhObject.ngayketthuc()).clear();
			driver.findElement(LichSuKhamChuaBenhObject.ngayketthuc()).sendKeys(ExeclUnitl.getData(9,5));
			Thread.sleep(3000);
			driver.findElement(LichSuKhamChuaBenhObject.txtngayhenkham()).clear();
			driver.findElement(LichSuKhamChuaBenhObject.txtngayhenkham()).sendKeys(ExeclUnitl.getData(9,6));
			Thread.sleep(3000);
			driver.findElement(LichSuKhamChuaBenhObject.btluu()).click();
			Thread.sleep(3000);
			WebElement ngaytaikhamlonhonngaykham= driver.findElement(LichSuKhamChuaBenhObject.message());
			String getngaytaikhamlonhonngaykham = ngaytaikhamlonhonngaykham.getText();
			String ngaytaikhamlonhonngaykham1 = ExeclUnitl.getData(9,12);
			System.out.println(" Ngày tái khám phải lớn hơn ngày khám: "+getngaytaikhamlonhonngaykham);
			Assert.assertEquals(ngaytaikhamlonhonngaykham1, getngaytaikhamlonhonngaykham);
			Thread.sleep(3000);
			try {
				Boolean xoa;
				do {
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					WebElement element = driver.findElement(LichSuKhamChuaBenhObject.xoa1kl());
					xoa = element.isDisplayed();
					System.out.println(xoa);
					driver.findElement(LichSuKhamChuaBenhObject.xoa1kl()).click();
					driver.findElement(LichSuKhamChuaBenhObject.xoa2kl()).click();
				} while (xoa);

			} catch (Exception e) {
				System.out.println("không tìm thấy dữ liệu này");
			}
			try {
				Boolean xoanhieu;
				do {
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					WebElement element = driver.findElement(LichSuKhamChuaBenhObject.xoakl());
					xoanhieu = element.isDisplayed();
					System.out.println(xoanhieu);
					driver.findElement(LichSuKhamChuaBenhObject.xoakl()).click();
					driver.findElement(LichSuKhamChuaBenhObject.xoa2kl()).click();
				} while (xoanhieu);

			} catch (Exception e) {
				System.out.println("không tìm thấy dữ liệu này");
			}
		
	}
		public void themMoiLichSuThanhCong(WebDriver driver) throws InterruptedException{
			Thread.sleep(3000);
			driver.findElement(LichSuKhamChuaBenhObject.txtngaykham()).clear();
			driver.findElement(LichSuKhamChuaBenhObject.txtngaykham()).sendKeys(ExeclUnitl.getData(10,3));
			Thread.sleep(2000);
			driver.findElement(LichSuKhamChuaBenhObject.ngaybatdau()).clear();
			driver.findElement(LichSuKhamChuaBenhObject.ngaybatdau()).sendKeys(ExeclUnitl.getData(10,4));
			Thread.sleep(2000);
			driver.findElement(LichSuKhamChuaBenhObject.ngayketthuc()).clear();
			driver.findElement(LichSuKhamChuaBenhObject.ngayketthuc()).sendKeys(ExeclUnitl.getData(10,5));
			Thread.sleep(3000);
			driver.findElement(LichSuKhamChuaBenhObject.txtngayhenkham()).clear();
			driver.findElement(LichSuKhamChuaBenhObject.txtngayhenkham()).sendKeys(ExeclUnitl.getData(10,6));
			Thread.sleep(3000);
			driver.findElement(LichSuKhamChuaBenhObject.benhsuls()).clear();
			driver.findElement(LichSuKhamChuaBenhObject.benhsuls()).sendKeys(ExeclUnitl.getData(10,7));
			Thread.sleep(2000);
			driver.findElement(LichSuKhamChuaBenhObject.ngayhenkhamls()).clear();
			driver.findElement(LichSuKhamChuaBenhObject.ngayhenkhamls()).sendKeys(ExeclUnitl.getData(10, 5));
			Thread.sleep(2000);
			driver.findElement(LichSuKhamChuaBenhObject.bacsinkhamls()).clear();
			driver.findElement(LichSuKhamChuaBenhObject.bacsinkhamls()).sendKeys(ExeclUnitl.getData(10, 11));
			Thread.sleep(2000);
			driver.findElement(LichSuKhamChuaBenhObject.btluu()).click();
			
			Thread.sleep(3000);
			WebElement tungaydenngay = driver.findElement(LichSuKhamChuaBenhObject.tungaydenngayls());
			String gettungaydenngay = tungaydenngay.getText();
			String tungaydenngay1 = "14-05-2017" + " - " + "16-05-2017";
			System.out.println(" In ra ket qua :" + gettungaydenngay);

			WebElement benhsu = driver.findElement(LichSuKhamChuaBenhObject.benhsu1ls());
			String getbenhsu = benhsu.getText();
			String benhsu1 = ExeclUnitl.getData(10,7);
			System.out.println(" In ra ket qua :" + getbenhsu);
		
			WebElement bacsi = driver.findElement(LichSuKhamChuaBenhObject.bacsils());
			String getbacsi = bacsi.getText();
			String bacsi1 = ExeclUnitl.getData(10,11);
			System.out.println(" In ra ket qua :" + getbacsi);

			Assert.assertEquals(tungaydenngay1, gettungaydenngay);
			Assert.assertEquals(benhsu1, getbenhsu);
			Assert.assertEquals(bacsi1, getbacsi);
	}
	public void tenDichvuKongDuocDeTrong(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(LichSuKhamChuaBenhObject.btthemmoils()).click();
		Thread.sleep(3000);
		driver.findElement(LichSuKhamChuaBenhObject.btcanlamsnag()).click();
		Thread.sleep(3000);
		WebElement tendichvukhongduocdetrong = driver.findElement(LichSuKhamChuaBenhObject.message());
		String gettendichvukhongduocdetrong = tendichvukhongduocdetrong.getText();
		String tendichvukhongduocdetrong1 = ExeclUnitl.getData(11,12);
		System.out.println("Tên dịch vụ không được để trống: "+gettendichvukhongduocdetrong);
		Assert.assertEquals(tendichvukhongduocdetrong1, gettendichvukhongduocdetrong);
	
	}
	public void ketQuaKhongDuocDetrong(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(LichSuKhamChuaBenhObject.txttendichvu()).sendKeys(ExeclUnitl.getData(12,8));
		driver.findElement(LichSuKhamChuaBenhObject.btcanlamsnag()).click();
		Thread.sleep(3000);
		WebElement ketquakhongduocdetrong = driver.findElement(LichSuKhamChuaBenhObject.message());
		String getketquakhongduocdetrong = ketquakhongduocdetrong.getText();
		String ketquakhongduocdetrong1 = ExeclUnitl.getData(12,12);
		System.out.println("Kết quả không được để trống: "+getketquakhongduocdetrong);
		Assert.assertEquals(ketquakhongduocdetrong1, getketquakhongduocdetrong);
	}
	public void tenThuocKhongDuocDeTrong(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(LichSuKhamChuaBenhObject.btdonthuoc()).click();
		Thread.sleep(3000);
		WebElement tenthuockhongduocdetrong = driver.findElement(LichSuKhamChuaBenhObject.message());
		String gettenthuockhongduocdetrong = tenthuockhongduocdetrong.getText();
		String tenthuockhongduocdetrong1 = ExeclUnitl.getData(13,12);
		System.out.println("Tên thuốc không được để trống: "+gettenthuockhongduocdetrong);
		Assert.assertEquals(tenthuockhongduocdetrong1, gettenthuockhongduocdetrong);
	}
	public void soLuongKhongDuocDetrong(WebDriver driver) throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(LichSuKhamChuaBenhObject.txttenthuoc()).sendKeys(ExeclUnitl.getData(14,9));
		driver.findElement(LichSuKhamChuaBenhObject.btdonthuoc()).click();
		Thread.sleep(3000);
		WebElement botrongsoluong = driver.findElement(LichSuKhamChuaBenhObject.message());
		String getbotrongsoluong = botrongsoluong.getText();
		String botrongsoluong1 = ExeclUnitl.getData(14,12);
		System.out.println("Số lượng không được để trống: "+getbotrongsoluong);
		Assert.assertEquals(botrongsoluong1, getbotrongsoluong);
	}
	public void soLuongPhaiNhapDangSo(WebDriver driver) throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(LichSuKhamChuaBenhObject.txttenthuoc()).clear();
		driver.findElement(LichSuKhamChuaBenhObject.txttenthuoc()).sendKeys(ExeclUnitl.getData(15,9));
		Thread.sleep(3000);
		driver.findElement(LichSuKhamChuaBenhObject.txtsoluong()).clear();
		driver.findElement(LichSuKhamChuaBenhObject.txtsoluong()).sendKeys(ExeclUnitl.getData(15,10));
		Thread.sleep(3000);
		WebElement soluongladangso = driver.findElement(LichSuKhamChuaBenhObject.soluongnhapdangso());
		String getsoluongladangso= soluongladangso.getText();
		String soluongladangso1 = ExeclUnitl.getData(15,12);
		System.out.println("Bạn phải nhập định dạng số: "+getsoluongladangso);
		Assert.assertEquals(soluongladangso1, getsoluongladangso);
	}
}
