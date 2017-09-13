package quanlyhogiadinh;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import general.ExeclUnitl;
import object.ThemNhanKhauObject;

public class NhanKhauThemMoi {
	public void ktrabuttondong(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(ThemNhanKhauObject.QuanLyHogiaDinh()).click();
		driver.findElement(ThemNhanKhauObject.QuanLyNhanKhau()).click();
		Thread.sleep(2000);
		driver.findElement(ThemNhanKhauObject.BtThemMoiNhanKhau()).click();
		Thread.sleep(2000);
		driver.findElement(ThemNhanKhauObject.ktanutdong()).click();
		Thread.sleep(2000);
		WebElement ktrahienmanhinhqlnk = driver.findElement(ThemNhanKhauObject.ktanutdonghienmanhinhqlnk());
		String getktrahienmanhinhqlnk = ktrahienmanhinhqlnk.getText();
		String ktrahienmanhinhqlnk1 = "Quản lý nhân khẩu";
		System.out.println("Đóng thành công: " + getktrahienmanhinhqlnk);
		Assert.assertEquals(ktrahienmanhinhqlnk1, getktrahienmanhinhqlnk);
	}

	public void ktranhapthieuthongtinbatbuoc(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauObject.BtThemMoiNhanKhau()).click();
		Thread.sleep(2000);
		WebElement ktrabttieptuc = driver.findElement(ThemNhanKhauObject.ktrabuttontieptuc());
		Boolean check = ktrabttieptuc.isEnabled();
		System.out.println("Fale khi nhập thiếu thông tin bắt buộc");
		Assert.assertFalse(check, "Fale khi nhập thiếu thông tin bắt buộc");

	}

	public void ktrabotrongtruongbatbuoc(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
     	driver.findElement(ThemNhanKhauObject.hoten()).sendKeys(ExeclUnitl.getData(4, 2));
		driver.findElement(ThemNhanKhauObject.hoten()).clear();
		driver.findElement(ThemNhanKhauObject.NgaySinh()).sendKeys(ExeclUnitl.getData(4,3));
		driver.findElement(ThemNhanKhauObject.NgaySinh()).clear();
		driver.findElement(ThemNhanKhauObject.xoanoikhaisinh()).click();
		driver.findElement(ThemNhanKhauObject.xoacphuongxa()).click();
		driver.findElement(ThemNhanKhauObject.xoaquanhuyen()).click();
		driver.findElement(ThemNhanKhauObject.xoatinhthanhpho()).click();
		
		Thread.sleep(3000);
		WebElement khunghoten = driver.findElement(ThemNhanKhauObject.khunghoten());
		String getkhunghoten = khunghoten.getCssValue("border-bottom-color");
		Thread.sleep(2000);
		
		WebElement khungngaysinh = driver.findElement(ThemNhanKhauObject.khungngaysinh());
		String getkhungngaysinh = khungngaysinh.getCssValue("border-bottom-color");
		
		WebElement khungnoidangkikhaisinh = driver.findElement(ThemNhanKhauObject.khungnoikhaisinh());
		String getkhungnoidangkikhaisinh = khungnoidangkikhaisinh.getCssValue("border-bottom-color");
		
		
		WebElement khungphuongxa = driver.findElement(ThemNhanKhauObject.khungphuongxa());
		String getkhungphuongxa = khungphuongxa.getCssValue("border-bottom-color");
		
		WebElement khungquanhuyen = driver.findElement(ThemNhanKhauObject.khungquanhuyen());
		String getkhungquanhuyen = khungquanhuyen.getCssValue("border-bottom-color");
		
		WebElement khungtinhtp = driver.findElement(ThemNhanKhauObject.khungtinhtp());
		String getkhungtinhtp = khungtinhtp.getCssValue("border-bottom-color");
		System.out.println(getkhungtinhtp);
		String mau = ExeclUnitl.getData(4, 14);
		System.out.println(mau);
		Assert.assertEquals(mau, getkhunghoten);
		Assert.assertEquals(mau, getkhungngaysinh);
		Assert.assertEquals(mau, getkhungnoidangkikhaisinh);
		Assert.assertEquals(mau, getkhungphuongxa);
		Assert.assertEquals(mau, getkhungquanhuyen);
		Assert.assertEquals(mau, getkhungtinhtp);
		Thread.sleep(2000);
		driver.findElement(ThemNhanKhauObject.ktanutdong()).click();
		
	}
	
	public void nhapsaicactruongkhongbatbuoc(WebDriver driver) throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(ThemNhanKhauObject.BtThemMoiNhanKhau()).click();
		Thread.sleep(2000);
		driver.findElement(ThemNhanKhauObject.SoCMND()).sendKeys(ExeclUnitl.getData(5, 6));
		driver.findElement(ThemNhanKhauObject.BHYT()).sendKeys(ExeclUnitl.getData(5, 7));
		driver.findElement(ThemNhanKhauObject.SDT()).sendKeys(ExeclUnitl.getData(5, 8));
		driver.findElement(ThemNhanKhauObject.khungSDTnguoigiamho()).sendKeys(ExeclUnitl.getData(5, 11));
		driver.findElement(ThemNhanKhauObject.txtnoisinh()).click();
		
		Thread.sleep(3000);
		WebElement khungsoCMT = driver.findElement(ThemNhanKhauObject.khungSoCMND());
		String getkhungsoCMT = khungsoCMT.getCssValue("border-bottom-color");
		
		WebElement khungBHYT = driver.findElement(ThemNhanKhauObject.khungBHYT());
		String getkhungBHYT = khungBHYT.getCssValue("border-bottom-color");
		
		WebElement khungSDT = driver.findElement(ThemNhanKhauObject.khungSDT());
		String getkhungSDT = khungSDT.getCssValue("border-bottom-color");

		WebElement khungSDTnguoigiamho = driver.findElement(ThemNhanKhauObject.khungSDTnguoigiamho());
		String getkhungSDTnguoigiamho = khungSDTnguoigiamho.getCssValue("border-bottom-color");
		
		System.out.println(getkhungSDTnguoigiamho);
		String mau = ExeclUnitl.getData(5, 14);
		System.out.println(mau);
		
		Assert.assertEquals(mau, getkhungsoCMT);
		Assert.assertEquals(mau, getkhungBHYT);
		Assert.assertEquals(mau, getkhungSDT);
		Assert.assertEquals(mau, getkhungSDTnguoigiamho);
		Thread.sleep(2000);
		driver.findElement(ThemNhanKhauObject.ktanutdong()).click();
	}
		
		public void themngaysinhsinhlonhonhoacbangnam1990(WebDriver driver)
				throws InterruptedException, IOException {
			ExeclUnitl.getData(2, 2);
			Thread.sleep(2000);
			driver.findElement(ThemNhanKhauObject.BtThemMoiNhanKhau()).click();
			Thread.sleep(2000);
			driver.findElement(ThemNhanKhauObject.HoTen()).sendKeys(ExeclUnitl.getData(6, 2));
			driver.findElement(ThemNhanKhauObject.GioiTinh1()).click();
			Thread.sleep(2000);
			driver.findElement(ThemNhanKhauObject.NgaySinh()).sendKeys(ExeclUnitl.getData(6, 3));
			driver.findElement(ThemNhanKhauObject.BtTieptuc()).click();
			WebElement Magess1 = driver.findElement(ThemNhanKhauObject.Magess1());
			String getMagess1 = Magess1.getText();
			String Magess2 = "Ngày sinh nhân khẩu phải nhỏ hơn hoặc bằng ngày hiện tại và lớn hơn năm 1900";
			System.out.println("Magess :" + getMagess1);
			Assert.assertEquals(Magess2, getMagess1);
		}
		public void themNKNgaySinhNhoHonHoacBangNgayHientaiVaLonHonNam1900th2(WebDriver driver)
				throws InterruptedException, IOException {
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.HoTen()).clear();
			driver.findElement(ThemNhanKhauObject.HoTen()).sendKeys(ExeclUnitl.getData(7, 2));
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.GioiTinh1()).click();
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.NgaySinh()).clear();
			driver.findElement(ThemNhanKhauObject.NgaySinh()).sendKeys(ExeclUnitl.getData(7, 3));
			driver.findElement(ThemNhanKhauObject.BtTieptuc()).click();
			Thread.sleep(3000);
			WebElement Magess2 = driver.findElement(ThemNhanKhauObject.Magess1());
			String getMagess2 = Magess2.getText();
			String Magess3 = "Ngày sinh nhân khẩu phải nhỏ hơn hoặc bằng ngày hiện tại và lớn hơn năm 1900";
			System.out.println("Magess :" + getMagess2);
			Assert.assertEquals(Magess3,getMagess2 );
		}

		public void themNKTreEmDuoi1TuoiNhapTenNguoiGiamHo(WebDriver driver) throws InterruptedException, IOException {
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.HoTen()).clear();
			driver.findElement(ThemNhanKhauObject.HoTen()).sendKeys(ExeclUnitl.getData(8, 2));
			driver.findElement(ThemNhanKhauObject.GioiTinh1()).click();
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.NgaySinh()).clear();
			driver.findElement(ThemNhanKhauObject.NgaySinh()).sendKeys(ExeclUnitl.getData(8, 3));
			driver.findElement(ThemNhanKhauObject.BtTieptuc()).click();
			Thread.sleep(3000);
			WebElement Magess3 = driver.findElement(ThemNhanKhauObject.Magess2());
			String getMagess3 = Magess3.getText();
			String Magess4 = "Trẻ em dưới 1 tuổi phải nhập tên người giám hộ";
			System.out.println("Magess :" + getMagess3);
			Assert.assertEquals(Magess4, getMagess3);
		}

		public void themNKNhapMoiQuanHeVoiNguoiGiamHo(WebDriver driver) throws InterruptedException, IOException {
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.HoTen()).clear();
			driver.findElement(ThemNhanKhauObject.HoTen()).sendKeys(ExeclUnitl.getData(9, 2));
			driver.findElement(ThemNhanKhauObject.GioiTinh1()).click();
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.NgaySinh()).clear();
			driver.findElement(ThemNhanKhauObject.NgaySinh()).sendKeys(ExeclUnitl.getData(9, 3));
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.NguoiGiamHo()).sendKeys(ExeclUnitl.getData(9, 9));
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.BtTieptuc()).click();
			Thread.sleep(3000);
			WebElement Magess4 = driver.findElement(ThemNhanKhauObject.Magess3());
			String getMagess4 = Magess4.getText();
			String Magess5 = "Bạn cần nhập mối quan hệ với người giám hộ";
			System.out.println("Magess :" + getMagess4);
			Assert.assertEquals(Magess5, getMagess4);
		}
		public void btrongdantoc(WebDriver driver) throws InterruptedException{
			Thread.sleep(35000);
			driver.findElement(ThemNhanKhauObject.HoTen()).clear();
			driver.findElement(ThemNhanKhauObject.HoTen()).sendKeys(ExeclUnitl.getData(9, 2));
			driver.findElement(ThemNhanKhauObject.GioiTinh1()).click();
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.NgaySinh()).clear();
			driver.findElement(ThemNhanKhauObject.NgaySinh()).sendKeys(ExeclUnitl.getData(9, 3));
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.NguoiGiamHo()).clear();
			driver.findElement(ThemNhanKhauObject.NguoiGiamHo()).sendKeys(ExeclUnitl.getData(9, 9));
			driver.findElement(ThemNhanKhauObject.MoiQHGH()).click();
			driver.findElement(ThemNhanKhauObject.ChonMoiQHGH()).click();
			Thread.sleep(2000);
			driver.findElement(ThemNhanKhauObject.BtTieptuc()).click();
			Thread.sleep(8000);
			driver.findElement(ThemNhanKhauObject.btrongdantoc()).click();
			Thread.sleep(3000);
			WebElement dantoc = driver.findElement(ThemNhanKhauObject.txtbtrongdantoc());
			String getdantoc = dantoc.getText();
			String dantoc1 = ExeclUnitl.getData(10, 13);
			System.out.println("Dân tộc không được để trống: "+getdantoc);
			Assert.assertEquals(dantoc1, getdantoc);
		
		}
		public void btrongquoctich(WebDriver driver) throws InterruptedException{
			Thread.sleep(5000);
			driver.findElement(ThemNhanKhauObject.btrongquoctich()).click();
			Thread.sleep(2000);
			WebElement quoctich = driver.findElement(ThemNhanKhauObject.txtbtrongquoctich());
			String getquoctich = quoctich.getText();
			String quoctich1 = ExeclUnitl.getData(11, 13);
			System.out.println("Quốc tịch không được để trống: "+getquoctich);
			Assert.assertEquals(quoctich1, getquoctich);
			
		}
		public void btrongtongiao(WebDriver driver) throws InterruptedException{
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.btrongtongiao()).click();
			Thread.sleep(2000);
			WebElement tongiao = driver.findElement(ThemNhanKhauObject.txtbtrongtongiao());
			String gettongiao = tongiao.getText();
			String tongiao1 = ExeclUnitl.getData(12,13);
			System.out.println("Tôn giáo không được để trống: "+gettongiao);
			Assert.assertEquals(tongiao1, gettongiao);
		}
		public void khongchondiachihientilathuongchu(WebDriver driver) throws InterruptedException{
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.dantoc()).click();
			driver.findElement(ThemNhanKhauObject.chondantoc()).click();
			Thread.sleep(2000);
			driver.findElement(ThemNhanKhauObject.quoctich()).click();
			driver.findElement(ThemNhanKhauObject.chonquoctich()).click();
			Thread.sleep(2000);
			driver.findElement(ThemNhanKhauObject.tongiao()).click();
			driver.findElement(ThemNhanKhauObject.chontongiao()).click();
			Thread.sleep(2000);
			WebElement luuhoso = driver.findElement(ThemNhanKhauObject.luuhoso());
			Boolean check = luuhoso.isEnabled();
			System.out.println("Fale khi nhập thiếu  thông tin bắt buộc ");
			Assert.assertFalse(check, "Fale khi nhập thiếu  thông tin bắt buộc");
			Thread.sleep(7000);
			driver.findElement(ThemNhanKhauObject.btdong1()).click();
		}
		
		public void themoithanhcong(WebDriver driver) throws InterruptedException {
			Thread.sleep(5000);
//			driver.findElement(ThemNhanKhauObject.QuanLyHogiaDinh()).click();
//			driver.findElement(ThemNhanKhauObject.QuanLyNhanKhau()).click();
//			Thread.sleep(2000);
			driver.findElement(ThemNhanKhauObject.BtThemMoiNhanKhau()).click();
			Thread.sleep(2000);
			driver.findElement(ThemNhanKhauObject.hoten()).clear();
			driver.findElement(ThemNhanKhauObject.hoten()).sendKeys(ExeclUnitl.getData(14, 2));
			driver.findElement(ThemNhanKhauObject.GioiTinh1()).click();
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.NgaySinh()).sendKeys(ExeclUnitl.getData(14, 3));
			Thread.sleep(2000);
			driver.findElement(ThemNhanKhauObject.NoiDangKiKhaiSinh()).click();
			driver.findElement(ThemNhanKhauObject.ChonNoiDangKiKhaiSinh()).click();
			driver.findElement(ThemNhanKhauObject.DiaChiHientai()).click();
			driver.findElement(ThemNhanKhauObject.ChonDiaChiHientai()).click();
			driver.findElement(ThemNhanKhauObject.QuanHuyen()).click();
			driver.findElement(ThemNhanKhauObject.ChonQuanHuyen()).click();
			driver.findElement(ThemNhanKhauObject.PhuongXa()).click();
			driver.findElement(ThemNhanKhauObject.ChonPhuongXa()).click();
			driver.findElement(ThemNhanKhauObject.NguoiGiamHo()).clear();
			driver.findElement(ThemNhanKhauObject.NguoiGiamHo()).sendKeys(ExeclUnitl.getData(14, 9));
			driver.findElement(ThemNhanKhauObject.MoiQHGH()).click();
			driver.findElement(ThemNhanKhauObject.ChonMoiQHGH()).click();
			driver.findElement(ThemNhanKhauObject.BtTieptuc()).click();
			Thread.sleep(5000);
			driver.findElement(ThemNhanKhauObject.DiaChi()).clear();
			driver.findElement(ThemNhanKhauObject.DiaChi()).sendKeys(ExeclUnitl.getData(14, 4));
			driver.findElement(ThemNhanKhauObject.ChonDiaChi()).click();
			driver.findElement(ThemNhanKhauObject.btluu()).click();
			Thread.sleep(8000);
			driver.findElement(ThemNhanKhauObject.hoten2()).sendKeys(ExeclUnitl.getData(14, 2));
			driver.findElement(ThemNhanKhauObject.gioitinh2()).sendKeys("NN");
			Thread.sleep(2000);
			driver.findElement(ThemNhanKhauObject.sonha()).sendKeys(ExeclUnitl.getData(14, 4));
			driver.findElement(ThemNhanKhauObject.bttimkiem()).click();
			Thread.sleep(5000);
			WebElement Hoten = driver.findElement(ThemNhanKhauObject.Hoten1());
			String getHoten = Hoten.getText();
			String Hoten1 = ExeclUnitl.getData(14,2);
			System.out.println("Ho ten :" + getHoten);
			
			WebElement NgaySinh = driver.findElement(ThemNhanKhauObject.Ngaysinh1());
			String getNgaySinh = NgaySinh.getText();
			String NgaySinh1 = ExeclUnitl.getData(14,3);
			System.out.println("Ngay Sinh:" + getNgaySinh);

			WebElement GioiTinh = driver.findElement(ThemNhanKhauObject.GioiTinh());
			String getGioiTinh = GioiTinh.getText();
			String GioiTinh1 = "Nữ";
			System.out.println("Gioi tinh:" + getGioiTinh);

			WebElement DiaChi = driver.findElement(ThemNhanKhauObject.Diachi1());
			String getDiaChi = DiaChi.getText();
			String DiaChi1 = "1C_Hà Đông - Phường Vĩnh Hưng - Quận Hoàng Mai - Thành phố Hà Nội";
			System.out.println("Dia chi :" + getDiaChi);

			Assert.assertEquals(Hoten1, getHoten);
			Assert.assertEquals(NgaySinh1, getNgaySinh);
			Assert.assertEquals(GioiTinh1, getGioiTinh);
			Assert.assertEquals(DiaChi1, getDiaChi);

		}
		
		public void xemthongtinnhankhau(WebDriver driver) throws InterruptedException{
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.xemthongtinnhankhau()).click();
			Thread.sleep(3000);
			WebElement thongtincanhan = driver.findElement(ThemNhanKhauObject.thongtincanhan());
			String getthongtincanhan = thongtincanhan.getText();
			String thongtincanhan1 = "Thông tin cá nhân";
			System.out.println("Hiển thị trang thông tin cá nhân: "+getthongtincanhan);
			Assert.assertEquals(thongtincanhan1, getthongtincanhan);
			Thread.sleep(5000);
			driver.findElement(ThemNhanKhauObject.btdong2()).click();
		}
		public void suathongtinnhankhau(WebDriver driver) throws InterruptedException{
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.suathongtinnhankhau()).click();
			Thread.sleep(3000);
			WebElement suathongtincanhan = driver.findElement(ThemNhanKhauObject.thongtincanhan());
			String getsuathongtincanhan= suathongtincanhan.getText();
			String suathongtincanhan1 = "Thêm mới hoặc sửa thông tin cá nhân";
			System.out.println("Hiển thị trang thêm mới hoặc sửa thông tin cá nhân: "+getsuathongtincanhan);
			Assert.assertEquals(suathongtincanhan1, getsuathongtincanhan);
			
		}
		public void nhankhaudangduocxulylambome(WebDriver driver) throws InterruptedException{
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.MYTbo()).click();
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.MaYTCN()).sendKeys(ExeclUnitl.getData(17,12));
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauObject.GT()).sendKeys("N");
			Thread.sleep(2000);
			driver.findElement(ThemNhanKhauObject.BTtimkiem()).click();
			Thread.sleep(2000);
			driver.findElement(ThemNhanKhauObject.chinhsua()).click();
			Thread.sleep(2000);
			WebElement nhankhaudangduocxulylambome = driver.findElement(ThemNhanKhauObject.message());
			String getnhankhaudangduocxulylambome = nhankhaudangduocxulylambome.getText();
			String nhankhaudangduocxulylambome1 = "Không được chọn nhân khẩu đang xử lý làm bố/mẹ";
			System.out.println("Nhân khẩu đang được xử lý làm bố mẹ: "+getnhankhaudangduocxulylambome);
			Assert.assertEquals(nhankhaudangduocxulylambome1, getnhankhaudangduocxulylambome);
			
		}
		public void suathongtinthanhcong(WebDriver driver) throws InterruptedException{
			Thread.sleep(7000);
			driver.findElement(ThemNhanKhauObject.btluuhoso()).click();
			Thread.sleep(2000);
			WebElement capnhatnhatthontincanhanthanhcong = driver.findElement(ThemNhanKhauObject.message());
			String getcapnhatnhatthontincanhanthanhcong = capnhatnhatthontincanhanthanhcong.getText();
			String capnhatnhatthontincanhanthanhcong1 = "Cập nhật thông tin cá nhân thành công";
			System.out.println("Cập nhật thông tin cá nhân thành công: "+getcapnhatnhatthontincanhanthanhcong);
			Assert.assertEquals(getcapnhatnhatthontincanhanthanhcong, getcapnhatnhatthontincanhanthanhcong);
		}
		public void xoathongtinnhankhau(WebDriver driver) throws InterruptedException{
			Thread.sleep(5000);
			driver.findElement(ThemNhanKhauObject.MYTCNNK()).sendKeys(ExeclUnitl.getData(19,12));
			driver.findElement(ThemNhanKhauObject.bttimkiem()).click();
			Thread.sleep(2000);
			driver.findElement(ThemNhanKhauObject.xoathongtinnhankhau()).click();
			Thread.sleep(2000);
			WebElement xoathongtinnhankhau = driver.findElement(ThemNhanKhauObject.messagexoa());
			String getxoathongtinnhankhau = xoathongtinnhankhau.getText();
			String xoathongtinnhankhau1 = "Xác nhận hành động xóa";
			System.out.println("Xóa thông tin nhân khẩu: "+getxoathongtinnhankhau);
			Assert.assertEquals(xoathongtinnhankhau1, getxoathongtinnhankhau);
			Thread.sleep(2000);
			driver.findElement(ThemNhanKhauObject.btdong3()).click();
		
		}
	}

