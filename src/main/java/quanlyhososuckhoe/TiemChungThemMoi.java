package quanlyhososuckhoe;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import general.ExeclUnitl;
import object.ThemKhamLapObject;
import object.ThemMoiTiemChungObject;

public class TiemChungThemMoi {
	public void themmoiTCMuiTiemKhongDuocBotrong(WebDriver driver) throws InterruptedException, IOException {
        Thread.sleep(7000);
		driver.findElement(ThemMoiTiemChungObject.MYTCNtc()).sendKeys(ExeclUnitl.getData(2,2));
		driver.findElement(ThemMoiTiemChungObject.bttimkiemtc()).click();
		driver.findElement(ThemMoiTiemChungObject.xemthongtinsuckhoetc()).click();
		Thread.sleep(3000);
		driver.findElement(ThemMoiTiemChungObject.menu()).click();
		driver.findElement(ThemMoiTiemChungObject.tiemchung()).click();
		driver.findElement(ThemMoiTiemChungObject.themmoitiemchung()).click();
		Thread.sleep(2000);
		driver.findElement(ThemMoiTiemChungObject.loaivacxin()).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(ThemMoiTiemChungObject.chonloaivacxin()).click();
		Thread.sleep(3000);
		driver.findElement(ThemMoiTiemChungObject.ngaynguachung()).sendKeys(ExeclUnitl.getData(2,3));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(ThemMoiTiemChungObject.btluutc()).click();
		Thread.sleep(3000);
		WebElement muitiem = driver.findElement(ThemMoiTiemChungObject.meggase());
		String getmuitiem = muitiem.getText();
		String muitiem1 = ExeclUnitl.getData(2,6);
		System.out.println(" In ra ket qua : " + getmuitiem);
		Assert.assertEquals(muitiem1, getmuitiem);

	}

	public void themmoiTCNgayHenTiemPhaiLonHonHoacbangNgayNguaChung(WebDriver driver)
			throws InterruptedException, IOException {
		Thread.sleep(5000);
		driver.findElement(ThemMoiTiemChungObject.loaivacxin()).click();
		driver.findElement(ThemMoiTiemChungObject.chonloaivacxin()).click();
		Thread.sleep(3000);
		driver.findElement(ThemMoiTiemChungObject.ngaynguachung()).clear();
		driver.findElement(ThemMoiTiemChungObject.ngaynguachung()).sendKeys(ExeclUnitl.getData(3, 3));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(ThemMoiTiemChungObject.ngayhentiemtc()).clear();
		driver.findElement(ThemMoiTiemChungObject.ngayhentiemtc()).sendKeys(ExeclUnitl.getData(3, 5));
		driver.findElement(ThemMoiTiemChungObject.muitiem()).sendKeys(ExeclUnitl.getData(3, 4));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(ThemMoiTiemChungObject.btluutc()).click();

		Thread.sleep(3000);
		WebElement ngayhentiem = driver.findElement(ThemMoiTiemChungObject.meggase());
		String getngayhentiem = ngayhentiem.getText();
		String ngayhentiem1 = ExeclUnitl.getData(3,6);
		System.out.println(" In ra ket qua : " + getngayhentiem);
		Assert.assertEquals(ngayhentiem1, getngayhentiem);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(ThemMoiTiemChungObject.dong()).click();

	}

	public void themmoiTCThanhCong(WebDriver driver) throws InterruptedException, IOException {
		try {

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(ThemMoiTiemChungObject.xoa()).click();
			driver.findElement(ThemMoiTiemChungObject.xoa1()).click();
		} catch (Exception e) {
			System.out.println("vac xin va mui tiem khong ton tai");
		}
        Thread.sleep(5000);
		driver.findElement(ThemMoiTiemChungObject.themmoitiemchung()).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(ThemMoiTiemChungObject.loaivacxin()).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(ThemMoiTiemChungObject.chonloaivacxin()).click();
		Thread.sleep(3000);
		driver.findElement(ThemMoiTiemChungObject.ngaynguachung()).clear();
		driver.findElement(ThemMoiTiemChungObject.ngaynguachung()).sendKeys(ExeclUnitl.getData(4, 3));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(ThemMoiTiemChungObject.ngayhentiemtc()).clear();
		driver.findElement(ThemMoiTiemChungObject.ngayhentiemtc()).sendKeys(ExeclUnitl.getData(4, 5));
		Thread.sleep(5000);
		driver.findElement(ThemMoiTiemChungObject.muitiem()).sendKeys(ExeclUnitl.getData(4,4));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(ThemMoiTiemChungObject.btluutc()).click();
		try {
			Boolean xoa;
			do {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement element = driver.findElement(ThemMoiTiemChungObject.xoa1kl());
				xoa = element.isDisplayed();
				System.out.println(xoa);
				driver.findElement(ThemMoiTiemChungObject.xoa1kl()).click();
				driver.findElement(ThemMoiTiemChungObject.xoa2kl()).click();
			} while (xoa);

		} catch (Exception e) {
			System.out.println("không tìm thấy dữ liệu này");
		}
		try {
			Boolean xoanhieu;
			do {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement element = driver.findElement(ThemMoiTiemChungObject.xoakl());
				xoanhieu = element.isDisplayed();
				System.out.println(xoanhieu);
				driver.findElement(ThemMoiTiemChungObject.xoakl()).click();
				driver.findElement(ThemMoiTiemChungObject.xoa2kl()).click();
			} while (xoanhieu);

		} catch (Exception e) {
			System.out.println("không tìm thấy dữ liệu này");
		}

		Thread.sleep(4000);
		WebElement vacxin = driver.findElement(ThemMoiTiemChungObject.loaivacxin1());
		String getvacxin = vacxin.getText();
		String vacxin1 = "Quimi-Hib";
		System.out.println(" In ra ket qua : " + getvacxin);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ngaychungngua = driver.findElement(ThemMoiTiemChungObject.ngaynguachung1());
		String getngaychungngua = ngaychungngua.getText();
		String ngaychungngua1 = ExeclUnitl.getData(4,3);
		System.out.println(" In ra ket qua : " + getngaychungngua);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement muitiem = driver.findElement(ThemMoiTiemChungObject.muitiem1());
		String getmuitiem = muitiem.getText();
		String muitiem1 = ExeclUnitl.getData(4,4);
		System.out.println(" In ra ket qua : " + getmuitiem);
		Assert.assertEquals(vacxin1, getvacxin);
		Assert.assertEquals(ngaychungngua1, getngaychungngua);
		Assert.assertEquals(muitiem1, getmuitiem);
	}

	public void themmoiTCVacXinMuiTiemDaTonTai(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(3000);
		driver.findElement(ThemMoiTiemChungObject.themmoitiemchung()).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(ThemMoiTiemChungObject.loaivacxin()).click();
		driver.findElement(ThemMoiTiemChungObject.chonloaivacxin()).click();
		Thread.sleep(3000);
		driver.findElement(ThemMoiTiemChungObject.ngaynguachung()).clear();
		driver.findElement(ThemMoiTiemChungObject.ngaynguachung()).sendKeys(ExeclUnitl.getData(5, 3));
		driver.findElement(ThemMoiTiemChungObject.ngayhentiemtc()).clear();
		driver.findElement(ThemMoiTiemChungObject.ngayhentiemtc()).sendKeys(ExeclUnitl.getData(5, 5));
		driver.findElement(ThemMoiTiemChungObject.muitiem()).sendKeys(ExeclUnitl.getData(5, 4));
		Thread.sleep(2000);
		driver.findElement(ThemMoiTiemChungObject.btluutc()).click();
		Thread.sleep(3000);
		WebElement vacxinmuitiemtontai = driver.findElement(ThemMoiTiemChungObject.meggase());
		String getvacxinmuitiemtontai = vacxinmuitiemtontai.getText();
		String vacxinmuitiemtontai1 = ExeclUnitl.getData(5, 6);
		System.out.println(" In ra ket qua : " + getvacxinmuitiemtontai);
		Assert.assertEquals(vacxinmuitiemtontai1, getvacxinmuitiemtontai);
		
	}
	public void checkMau(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(3000);
	    driver.findElement(ThemMoiTiemChungObject.xoaloaivacxin()).click();
		driver.findElement(ThemMoiTiemChungObject.ngaynguachung()).clear();
		driver.findElement(ThemMoiTiemChungObject.ngaynguachung()).sendKeys(ExeclUnitl.getData(5, 3));
		driver.findElement(ThemMoiTiemChungObject.ngaynguachung()).clear();
		Thread.sleep(2000);
		driver.findElement(ThemMoiTiemChungObject.xoacosokhamchuabenh()).click();
		Thread.sleep(3000);
		WebElement loaivacxin = driver.findElement(ThemMoiTiemChungObject.khungloaivacxin());
		String getloaivacxin = loaivacxin.getCssValue("border-bottom-color");
		System.out.println(" Hiển thị màu: " + getloaivacxin);
		
		WebElement ngaykham = driver.findElement(ThemMoiTiemChungObject.ngaynguachung());
		String getngaykham = ngaykham.getCssValue("border-bottom-color");
		System.out.println(" Hiển thị màu: " + getngaykham);

		WebElement cosokham = driver.findElement(ThemMoiTiemChungObject.khungcosokham());
		String getcosokham = cosokham.getCssValue("border-bottom-color");
		System.out.println(" Hiển thị màu: " + getcosokham);
		
		String mau = ExeclUnitl.getData(6, 7);
		Assert.assertEquals(mau, getloaivacxin);
		Assert.assertEquals(mau, getngaykham);
		Assert.assertEquals(mau, getcosokham);
		Thread.sleep(3000);
	}
}
