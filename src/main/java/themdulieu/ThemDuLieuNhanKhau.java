package themdulieu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import general.ExeclUnitl;

import object.ThemDuLieuNhanKhauObject;

public class ThemDuLieuNhanKhau {

public void themoinhankhau(WebDriver driver) throws InterruptedException{
	Thread.sleep(3000);
	driver.findElement(ThemDuLieuNhanKhauObject.QuanLyHogiaDinh()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.QuanLyNhanKhau()).click();
	Thread.sleep(2000);
	driver.findElement(ThemDuLieuNhanKhauObject.BtThemMoiNhanKhau()).click();
	Thread.sleep(3000);
	driver.findElement(ThemDuLieuNhanKhauObject.hoten()).sendKeys(ExeclUnitl.getData(20, 2));
	driver.findElement(ThemDuLieuNhanKhauObject.NgaySinh()).sendKeys(ExeclUnitl.getData(20, 3));
	Thread.sleep(2000);
	driver.findElement(ThemDuLieuNhanKhauObject.NoiDangKiKhaiSinh()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.ChonNoiDangKiKhaiSinh()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.BtTieptuc()).click();
	Thread.sleep(4000);
	driver.findElement(ThemDuLieuNhanKhauObject.DiaChi()).clear();
	driver.findElement(ThemDuLieuNhanKhauObject.DiaChi()).sendKeys(ExeclUnitl.getData(20, 4));
	driver.findElement(ThemDuLieuNhanKhauObject.ChonDiaChi()).click();
	Thread.sleep(3000);
	driver.findElement(ThemDuLieuNhanKhauObject.btluu()).click();
	Thread.sleep(7000);
	driver.findElement(ThemDuLieuNhanKhauObject.hoten2()).sendKeys(ExeclUnitl.getData(20, 2));
	driver.findElement(ThemDuLieuNhanKhauObject.gioitinh2()).sendKeys("N");
	Thread.sleep(2000);
	driver.findElement(ThemDuLieuNhanKhauObject.sonha()).sendKeys(ExeclUnitl.getData(20, 4));
	driver.findElement(ThemDuLieuNhanKhauObject.bttimkiem()).click();
	Thread.sleep(7000);
	WebElement Hoten = driver.findElement(ThemDuLieuNhanKhauObject.Hoten1());
	String getHoten = Hoten.getText();
	String Hoten1 = ExeclUnitl.getData(20,2);
	System.out.println("Ho ten :" + getHoten);
	
	WebElement NgaySinh = driver.findElement(ThemDuLieuNhanKhauObject.Ngaysinh1());
	String getNgaySinh = NgaySinh.getText();
	String NgaySinh1 = ExeclUnitl.getData(20,3);
	System.out.println("Ngay Sinh:" + getNgaySinh);

	WebElement GioiTinh = driver.findElement(ThemDuLieuNhanKhauObject.GioiTinh());
	String getGioiTinh = GioiTinh.getText();
	String GioiTinh1 = "Nam";
	System.out.println("Gioi tinh:" + getGioiTinh);

	WebElement DiaChi = driver.findElement(ThemDuLieuNhanKhauObject.Diachi1());
	String getDiaChi = DiaChi.getText();
	String DiaChi1 = "2A_Khuất Duy Tiến - Phường Vĩnh Hưng - Quận Hoàng Mai - Thành phố Hà Nội";
	System.out.println("Dia chi :" + getDiaChi);

	Assert.assertEquals(Hoten1, getHoten);
	Assert.assertEquals(NgaySinh1, getNgaySinh);
	Assert.assertEquals(GioiTinh1, getGioiTinh);
	Assert.assertEquals(DiaChi1, getDiaChi);

}
public void themoinhankhau1(WebDriver driver) throws InterruptedException{
	Thread.sleep(3000);
	driver.findElement(ThemDuLieuNhanKhauObject.BtThemMoiNhanKhau()).click();
	Thread.sleep(2000);
	driver.findElement(ThemDuLieuNhanKhauObject.hoten()).clear();
	driver.findElement(ThemDuLieuNhanKhauObject.hoten()).sendKeys(ExeclUnitl.getData(21, 2));
    driver.findElement(ThemDuLieuNhanKhauObject.GioiTinh1()).click();
	Thread.sleep(3000);
	driver.findElement(ThemDuLieuNhanKhauObject.NgaySinh()).sendKeys(ExeclUnitl.getData(21, 3));
	Thread.sleep(2000);
	driver.findElement(ThemDuLieuNhanKhauObject.NoiDangKiKhaiSinh()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.ChonNoiDangKiKhaiSinh()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.DiaChiHientai()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.ChonDiaChiHientai()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.QuanHuyen()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.ChonQuanHuyen()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.PhuongXa()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.ChonPhuongXa()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.BtTieptuc()).click();
	Thread.sleep(3000);
	driver.findElement(ThemDuLieuNhanKhauObject.DiaChi()).clear();
	driver.findElement(ThemDuLieuNhanKhauObject.DiaChi()).sendKeys(ExeclUnitl.getData(21, 4));
	driver.findElement(ThemDuLieuNhanKhauObject.ChonDiaChi()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.btluu()).click();
	Thread.sleep(8000);
	driver.findElement(ThemDuLieuNhanKhauObject.hoten2()).sendKeys(ExeclUnitl.getData(21, 2));
	driver.findElement(ThemDuLieuNhanKhauObject.gioitinh2()).sendKeys("NN");
	Thread.sleep(2000);
	driver.findElement(ThemDuLieuNhanKhauObject.sonha()).sendKeys(ExeclUnitl.getData(21, 4));
	driver.findElement(ThemDuLieuNhanKhauObject.bttimkiem()).click();
	Thread.sleep(7000);
	WebElement Hoten = driver.findElement(ThemDuLieuNhanKhauObject.Hoten1());
	String getHoten = Hoten.getText();
	String Hoten1 = ExeclUnitl.getData(21,2);
	System.out.println("Ho ten :" + getHoten);
	
	WebElement NgaySinh = driver.findElement(ThemDuLieuNhanKhauObject.Ngaysinh1());
	String getNgaySinh = NgaySinh.getText();
	String NgaySinh1 = ExeclUnitl.getData(21,3);
	System.out.println("Ngay Sinh:" + getNgaySinh);

	WebElement GioiTinh = driver.findElement(ThemDuLieuNhanKhauObject.GioiTinh());
	String getGioiTinh = GioiTinh.getText();
	String GioiTinh1 = "Nữ";
	System.out.println("Gioi tinh:" + getGioiTinh);

	WebElement DiaChi = driver.findElement(ThemDuLieuNhanKhauObject.Diachi1());
	String getDiaChi = DiaChi.getText();
	String DiaChi1 = "1C_Hà Đông - Phường Vĩnh Hưng - Quận Hoàng Mai - Thành phố Hà Nội";
	System.out.println("Dia chi :" + getDiaChi);

	Assert.assertEquals(Hoten1, getHoten);
	Assert.assertEquals(NgaySinh1, getNgaySinh);
	Assert.assertEquals(GioiTinh1, getGioiTinh);
	Assert.assertEquals(DiaChi1, getDiaChi);

}
public void themoinhankhau2(WebDriver driver) throws InterruptedException{
	Thread.sleep(3000);
	driver.findElement(ThemDuLieuNhanKhauObject.BtThemMoiNhanKhau()).click();
	Thread.sleep(2000);
	driver.findElement(ThemDuLieuNhanKhauObject.hoten()).clear();
	driver.findElement(ThemDuLieuNhanKhauObject.hoten()).sendKeys(ExeclUnitl.getData(22, 2));
    driver.findElement(ThemDuLieuNhanKhauObject.gioitinhnam()).click();
	Thread.sleep(3000);
	driver.findElement(ThemDuLieuNhanKhauObject.NgaySinh()).sendKeys(ExeclUnitl.getData(22, 3));
	Thread.sleep(2000);
	driver.findElement(ThemDuLieuNhanKhauObject.NoiDangKiKhaiSinh()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.ChonNoiDangKiKhaiSinh()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.DiaChiHientai()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.ChonDiaChiHientai()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.QuanHuyen()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.ChonQuanHuyen()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.PhuongXa()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.ChonPhuongXa()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.BtTieptuc()).click();
	Thread.sleep(5000);
	driver.findElement(ThemDuLieuNhanKhauObject.DiaChi()).clear();
	driver.findElement(ThemDuLieuNhanKhauObject.DiaChi()).sendKeys(ExeclUnitl.getData(22, 4));
	driver.findElement(ThemDuLieuNhanKhauObject.ChonDiaChi()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.btluu()).click();
	Thread.sleep(8000);
	driver.findElement(ThemDuLieuNhanKhauObject.hoten2()).sendKeys(ExeclUnitl.getData(22, 2));
	driver.findElement(ThemDuLieuNhanKhauObject.gioitinh2()).sendKeys("N");
	Thread.sleep(2000);
	driver.findElement(ThemDuLieuNhanKhauObject.sonha()).sendKeys(ExeclUnitl.getData(22, 4));
	driver.findElement(ThemDuLieuNhanKhauObject.bttimkiem()).click();
	Thread.sleep(7000);
	WebElement Hoten = driver.findElement(ThemDuLieuNhanKhauObject.Hoten1());
	String getHoten = Hoten.getText();
	String Hoten1 = ExeclUnitl.getData(22,2);
	System.out.println("Ho ten :" + getHoten);
	
	WebElement NgaySinh = driver.findElement(ThemDuLieuNhanKhauObject.Ngaysinh1());
	String getNgaySinh = NgaySinh.getText();
	String NgaySinh1 = ExeclUnitl.getData(22,3);
	System.out.println("Ngay Sinh:" + getNgaySinh);

	WebElement GioiTinh = driver.findElement(ThemDuLieuNhanKhauObject.GioiTinh());
	String getGioiTinh = GioiTinh.getText();
	String GioiTinh1 = "Nam";
	System.out.println("Gioi tinh:" + getGioiTinh);

	WebElement DiaChi = driver.findElement(ThemDuLieuNhanKhauObject.Diachi1());
	String getDiaChi = DiaChi.getText();
	String DiaChi1 = "16_LC - Phường Vĩnh Hưng - Quận Hoàng Mai - Thành phố Hà Nội";
	System.out.println("Dia chi :" + getDiaChi);

	Assert.assertEquals(Hoten1, getHoten);
	Assert.assertEquals(NgaySinh1, getNgaySinh);
	Assert.assertEquals(GioiTinh1, getGioiTinh);
	Assert.assertEquals(DiaChi1, getDiaChi);

}
public void themoinhankhau3(WebDriver driver) throws InterruptedException{
	Thread.sleep(3000);
	driver.findElement(ThemDuLieuNhanKhauObject.BtThemMoiNhanKhau()).click();
	Thread.sleep(2000);
	driver.findElement(ThemDuLieuNhanKhauObject.hoten()).clear();
	driver.findElement(ThemDuLieuNhanKhauObject.hoten()).sendKeys(ExeclUnitl.getData(23, 2));
    driver.findElement(ThemDuLieuNhanKhauObject.GioiTinh1()).click();
	Thread.sleep(3000);
	driver.findElement(ThemDuLieuNhanKhauObject.NgaySinh()).sendKeys(ExeclUnitl.getData(23, 3));
	Thread.sleep(2000);
	driver.findElement(ThemDuLieuNhanKhauObject.NoiDangKiKhaiSinh()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.ChonNoiDangKiKhaiSinh()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.DiaChiHientai()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.ChonDiaChiHientai()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.QuanHuyen()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.ChonQuanHuyen()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.PhuongXa()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.ChonPhuongXa()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.BtTieptuc()).click();
	Thread.sleep(5000);
	driver.findElement(ThemDuLieuNhanKhauObject.DiaChi()).clear();
	driver.findElement(ThemDuLieuNhanKhauObject.DiaChi()).sendKeys(ExeclUnitl.getData(23, 4));
	driver.findElement(ThemDuLieuNhanKhauObject.ChonDiaChi()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.btluu()).click();
	Thread.sleep(8000);
	driver.findElement(ThemDuLieuNhanKhauObject.hoten2()).sendKeys(ExeclUnitl.getData(23, 2));
	driver.findElement(ThemDuLieuNhanKhauObject.gioitinh2()).sendKeys("NN");
	Thread.sleep(2000);
	driver.findElement(ThemDuLieuNhanKhauObject.sonha()).sendKeys(ExeclUnitl.getData(23, 4));
	driver.findElement(ThemDuLieuNhanKhauObject.bttimkiem()).click();
	Thread.sleep(5000);
	WebElement Hoten = driver.findElement(ThemDuLieuNhanKhauObject.Hoten1());
	String getHoten = Hoten.getText();
	String Hoten1 = ExeclUnitl.getData(23,2);
	System.out.println("Ho ten :" + getHoten);
	
	WebElement NgaySinh = driver.findElement(ThemDuLieuNhanKhauObject.Ngaysinh1());
	String getNgaySinh = NgaySinh.getText();
	String NgaySinh1 = ExeclUnitl.getData(23,3);
	System.out.println("Ngay Sinh:" + getNgaySinh);

	WebElement GioiTinh = driver.findElement(ThemDuLieuNhanKhauObject.GioiTinh());
	String getGioiTinh = GioiTinh.getText();
	String GioiTinh1 = "Nữ";
	System.out.println("Gioi tinh:" + getGioiTinh);

	WebElement DiaChi = driver.findElement(ThemDuLieuNhanKhauObject.Diachi1());
	String getDiaChi = DiaChi.getText();
	String DiaChi1 = "289_Yên Xá - Phường Vĩnh Hưng - Quận Hoàng Mai - Thành phố Hà Nội";
	System.out.println("Dia chi :" + getDiaChi);

	Assert.assertEquals(Hoten1, getHoten);
	Assert.assertEquals(NgaySinh1, getNgaySinh);
	Assert.assertEquals(GioiTinh1, getGioiTinh);
	Assert.assertEquals(DiaChi1, getDiaChi);

}
public void themoinhankhau4(WebDriver driver) throws InterruptedException{
	Thread.sleep(3000);
	driver.findElement(ThemDuLieuNhanKhauObject.BtThemMoiNhanKhau()).click();
	Thread.sleep(2000);
	driver.findElement(ThemDuLieuNhanKhauObject.hoten()).clear();
	driver.findElement(ThemDuLieuNhanKhauObject.hoten()).sendKeys(ExeclUnitl.getData(24, 2));
    driver.findElement(ThemDuLieuNhanKhauObject.GioiTinh1()).click();
	Thread.sleep(3000);
	driver.findElement(ThemDuLieuNhanKhauObject.NgaySinh()).sendKeys(ExeclUnitl.getData(24, 3));
	Thread.sleep(2000);
	driver.findElement(ThemDuLieuNhanKhauObject.NoiDangKiKhaiSinh()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.ChonNoiDangKiKhaiSinh()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.DiaChiHientai()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.ChonDiaChiHientai()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.QuanHuyen()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.ChonQuanHuyen()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.PhuongXa()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.ChonPhuongXa()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.BtTieptuc()).click();
	Thread.sleep(7000);
	driver.findElement(ThemDuLieuNhanKhauObject.DiaChi()).clear();
	driver.findElement(ThemDuLieuNhanKhauObject.DiaChi()).sendKeys(ExeclUnitl.getData(24, 4));
	driver.findElement(ThemDuLieuNhanKhauObject.ChonDiaChi()).click();
	driver.findElement(ThemDuLieuNhanKhauObject.btluu()).click();
	Thread.sleep(8000);
	driver.findElement(ThemDuLieuNhanKhauObject.hoten2()).sendKeys(ExeclUnitl.getData(24, 2));
	driver.findElement(ThemDuLieuNhanKhauObject.gioitinh2()).sendKeys("NN");
	Thread.sleep(2000);
	driver.findElement(ThemDuLieuNhanKhauObject.sonha()).sendKeys(ExeclUnitl.getData(24, 4));
	driver.findElement(ThemDuLieuNhanKhauObject.bttimkiem()).click();
	Thread.sleep(7000);
	WebElement Hoten = driver.findElement(ThemDuLieuNhanKhauObject.Hoten1());
	String getHoten = Hoten.getText();
	String Hoten1 = ExeclUnitl.getData(24,2);
	System.out.println("Ho ten :" + getHoten);
	
	WebElement NgaySinh = driver.findElement(ThemDuLieuNhanKhauObject.Ngaysinh1());
	String getNgaySinh = NgaySinh.getText();
	String NgaySinh1 = ExeclUnitl.getData(24,3);
	System.out.println("Ngay Sinh:" + getNgaySinh);

	WebElement GioiTinh = driver.findElement(ThemDuLieuNhanKhauObject.GioiTinh());
	String getGioiTinh = GioiTinh.getText();
	String GioiTinh1 = "Nữ";
	System.out.println("Gioi tinh:" + getGioiTinh);

	WebElement DiaChi = driver.findElement(ThemDuLieuNhanKhauObject.Diachi1());
	String getDiaChi = DiaChi.getText();
	String DiaChi1 = "289_Yên Xá - Phường Vĩnh Hưng - Quận Hoàng Mai - Thành phố Hà Nội";
	System.out.println("Dia chi :" + getDiaChi);

	Assert.assertEquals(Hoten1, getHoten);
	Assert.assertEquals(NgaySinh1, getNgaySinh);
	Assert.assertEquals(GioiTinh1, getGioiTinh);
	Assert.assertEquals(DiaChi1, getDiaChi);

}
	
	
	
}


