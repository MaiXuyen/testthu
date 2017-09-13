package quanlyhososuckhoe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import general.ExeclUnitl;
import object.ThemKhamLapObject;

public class KhamLapThemMoi {
	public void chuaCoDuLieuThayDoi(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.txtMYTCN()).sendKeys(ExeclUnitl.getData(2, 2));
		driver.findElement(ThemKhamLapObject.bttimkiem()).click();
		driver.findElement(ThemKhamLapObject.taomoihososuckhoe()).click();
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.btluu()).click();
		Thread.sleep(3000);
		WebElement chuacosdulieuthaydoi = driver.findElement(ThemKhamLapObject.message());
		String getchuacosdulieuthaydoi = chuacosdulieuthaydoi.getText();
		String chuacosdulieuthaydoi1 = ExeclUnitl.getData(2, 7);
		System.out.println("Chưa có dữ liệu thay đổi: " + getchuacosdulieuthaydoi);
		Assert.assertEquals(chuacosdulieuthaydoi1, getchuacosdulieuthaydoi);
	}

	public void checkMau(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.txtngaykham()).sendKeys(ExeclUnitl.getData(3, 3));
		driver.findElement(ThemKhamLapObject.txtngaykham()).clear();
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.cosokham()).click();
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.txtbacsikham()).clear();
		driver.findElement(ThemKhamLapObject.txtbacsikham()).sendKeys(ExeclUnitl.getData(3, 4));
		driver.findElement(ThemKhamLapObject.txtbacsikham()).clear();
		driver.findElement(ThemKhamLapObject.bacsitheodoi()).click();
		Thread.sleep(3000);

		WebElement ngaykham = driver.findElement(ThemKhamLapObject.txtngaykham());
		String getngaykham = ngaykham.getCssValue("border-bottom-color");
		System.out.println(" Hiển thị màu: " + getngaykham);
		WebElement cosokham = driver.findElement(ThemKhamLapObject.maucosokham());
		String getcosokham = cosokham.getCssValue("border-bottom-color");
		System.out.println(" Hiển thị màu: " + getcosokham);

		WebElement bacsikham = driver.findElement(ThemKhamLapObject.txtbacsikham());
		String getbacsikham = bacsikham.getCssValue("border-bottom-color");

		System.out.println(" Hiển thị màu: " + getbacsikham);
		String mau = ExeclUnitl.getData(3, 8);
		Assert.assertEquals(mau, getngaykham);
		Assert.assertEquals(mau, getcosokham);
		Assert.assertEquals(mau, getbacsikham);
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.btdong()).click();
	}

	public void ngayKhamkhongDuocLonHonNgayhienTai(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.taomoihososuckhoe()).click();
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.txtngaykham()).clear();
		driver.findElement(ThemKhamLapObject.txtngaykham()).sendKeys(ExeclUnitl.getData(4, 3));
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.txtbacsikham()).clear();
		driver.findElement(ThemKhamLapObject.txtbacsikham()).sendKeys(ExeclUnitl.getData(4, 4));
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.btluu()).click();
		Thread.sleep(3000);
		WebElement ngaykhamkhongduoclonhonngayhientai = driver.findElement(ThemKhamLapObject.message());
		String getngaykhamkhongduoclonhonngayhientai = ngaykhamkhongduoclonhonngayhientai.getText();
		String ngaykhamkhongduoclonhonngayhientai1 = ExeclUnitl.getData(4, 7);
		System.out.println("Ngày khám không được lớn hơn ngày hiện tại: " + getngaykhamkhongduoclonhonngayhientai);
		Assert.assertEquals(ngaykhamkhongduoclonhonngayhientai1, getngaykhamkhongduoclonhonngayhientai);
	}
	public void ngayHenKhamKhongDuocNhoHonNgayKham(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.txtngaykham()).clear();
		driver.findElement(ThemKhamLapObject.txtngaykham()).sendKeys(ExeclUnitl.getData(5, 3));
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.txtbacsikham()).clear();
		driver.findElement(ThemKhamLapObject.txtbacsikham()).sendKeys(ExeclUnitl.getData(5, 4));
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.txtngayhenkham()).clear();
		driver.findElement(ThemKhamLapObject.txtngayhenkham()).sendKeys(ExeclUnitl.getData(5, 5));
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.btluu()).click();
		Thread.sleep(3000);
		WebElement ngaykhamhenkhongduocnhohonngaykham = driver.findElement(ThemKhamLapObject.message());
		String getngaykhamhenkhongduocnhohonngaykham = ngaykhamhenkhongduocnhohonngaykham.getText();
		String ngaykhamhenkhongduocnhohonngaykham1 = ExeclUnitl.getData(5, 7);
		System.out.println("Ngày hẹn khám không được nhỏ hơn ngày khám: " + getngaykhamhenkhongduocnhohonngaykham);
		Assert.assertEquals(ngaykhamhenkhongduocnhohonngaykham1, getngaykhamhenkhongduocnhohonngaykham);
	}
	public void khamLapThanhCong(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(ThemKhamLapObject.txtngaykham()).clear();
		driver.findElement(ThemKhamLapObject.txtngaykham()).sendKeys(ExeclUnitl.getData(6, 3));
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.txtbenhsu()).clear();
		driver.findElement(ThemKhamLapObject.txtbenhsu()).sendKeys(ExeclUnitl.getData(6, 6));
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.txtbacsikham()).clear();
		driver.findElement(ThemKhamLapObject.txtbacsikham()).sendKeys(ExeclUnitl.getData(6, 4));
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.txtngayhenkham()).clear();
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.txtngayhenkham()).sendKeys(ExeclUnitl.getData(6, 5));
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.btluu()).click();
		Thread.sleep(3000);
		WebElement khamlapthanhcong = driver.findElement(ThemKhamLapObject.message());
		String getkhamlapthanhcong = khamlapthanhcong.getText();
		String khamlapthanhcong1 = ExeclUnitl.getData(6, 7);
		System.out.println("Tạo mới hồ sơ tạo lập thành công: " + getkhamlapthanhcong);
		Assert.assertEquals(khamlapthanhcong1, getkhamlapthanhcong);
	}
	public void soSanhKhamLap(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(ThemKhamLapObject.txtMYTCN()).sendKeys(ExeclUnitl.getData(2, 2));
		driver.findElement(ThemKhamLapObject.bttimkiem()).click();
		Thread.sleep(3000);
		driver.findElement(ThemKhamLapObject.lichsukb()).click();
		try {
			Boolean xoa;
			do {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement element = driver.findElement(ThemKhamLapObject.xoa1kl());
				xoa = element.isDisplayed();
				System.out.println(xoa);
				driver.findElement(ThemKhamLapObject.xoa1kl()).click();
				driver.findElement(ThemKhamLapObject.xoa2kl()).click();
			} while (xoa);

		} catch (Exception e) {
			System.out.println("không tìm thấy dữ liệu này");
		}
		try {
			Boolean xoanhieu;
			do {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement element = driver.findElement(ThemKhamLapObject.xoakl());
				xoanhieu = element.isDisplayed();
				System.out.println(xoanhieu);
				driver.findElement(ThemKhamLapObject.xoakl()).click();
				driver.findElement(ThemKhamLapObject.xoa2kl()).click();
			} while (xoanhieu);

		} catch (Exception e) {
			System.out.println("không tìm thấy dữ liệu này");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement tungaydenngay = driver.findElement(ThemKhamLapObject.tungaydenngay());
		String gettungaydenngay = tungaydenngay.getText();
		String tungaydenngay1 = "22-05-2017" + " - " + "22-05-2017";
		System.out.println(" tu ngay den ngay : " + gettungaydenngay);

		WebElement bacsikham = driver.findElement(ThemKhamLapObject.bacsikhamenh());
		String getbacsikham = bacsikham.getText();
		String bacsikham1 = ExeclUnitl.getData(6, 4);
		System.out.println(" Bac si kham : " + getbacsikham);

		WebElement benhsu = driver.findElement(ThemKhamLapObject.benhsu1());
		String getbenhsu = benhsu.getText();
		String benhsu1 = ExeclUnitl.getData(6, 6);
		System.out.println(" Benh su :  " + getbenhsu);

		Assert.assertEquals(tungaydenngay1, gettungaydenngay);
		Assert.assertEquals(bacsikham1, getbacsikham);
		Assert.assertEquals(benhsu1, getbenhsu);

	}

}
