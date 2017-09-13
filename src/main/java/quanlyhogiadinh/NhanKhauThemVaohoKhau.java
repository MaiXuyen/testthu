package quanlyhogiadinh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import general.ExeclUnitl;
import object.ThemNhanKhauVaoHoKhauObject;

public class NhanKhauThemVaohoKhau {
	public void chuachonnhankhau(WebDriver driver) throws InterruptedException{
		try {
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauVaoHoKhauObject.QuanLyHogiaDinh()).click();
			driver.findElement(ThemNhanKhauVaoHoKhauObject.Quanlyhokhau()).click();
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauVaoHoKhauObject.chuho1()).sendKeys(ExeclUnitl.getData(2,3));
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauVaoHoKhauObject.bttimkiem2()).click();
			Thread.sleep(3000);
			driver.findElement(ThemNhanKhauVaoHoKhauObject.xoa()).click();
			driver.findElement(ThemNhanKhauVaoHoKhauObject.xoa1()).click();

		} catch (Exception e) {
			System.out.println("Không tìm thấy chủ hộ này");
		}
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.ThemMoiHoKhau()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.chuho()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.MYTCN()).sendKeys(ExeclUnitl.getData(2,2));
		driver.findElement(ThemNhanKhauVaoHoKhauObject.bttimkiemnhankhau()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.chinhsua()).click();
		Thread.sleep(5000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btluu()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btthemnhankhau()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btluuchuachonnhankhau()).click();
		
		WebElement chuachonnhankhau = driver.findElement(ThemNhanKhauVaoHoKhauObject.message());
		String getchuachonnhankhau = chuachonnhankhau.getText();
		String chuachonnhankhau1 = ExeclUnitl.getData(2,6);
		System.out.println("Bạn chưa chọn nhân khẩu: "+getchuachonnhankhau);
		Assert.assertEquals(chuachonnhankhau1, getchuachonnhankhau);
	}
	public void chuachonloaiquanhe(WebDriver driver) throws InterruptedException{
		Thread.sleep(6000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btnhankhau()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.MaYTCNnhankhau()).sendKeys(ExeclUnitl.getData(3,2));
		driver.findElement(ThemNhanKhauVaoHoKhauObject.bttimkiemnhankhau()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.chinhsuanhankhau()).click();
		Thread.sleep(2000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btluuchuachonnhankhau()).click();
		Thread.sleep(3000);
		WebElement chuachonquanhechuho = driver.findElement(ThemNhanKhauVaoHoKhauObject.message());
		String getchuachonquanhechuho = chuachonquanhechuho.getText();
		String chuachonquanhechuho1 = ExeclUnitl.getData(3,6);
		System.out.println("Bạn chưa chọn quan hệ với chủ hộ: "+getchuachonquanhechuho);
		Assert.assertEquals(chuachonquanhechuho1, getchuachonquanhechuho);
	}
	public void nhankhaudanglachucuahokhac(WebDriver driver) throws InterruptedException{
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath(".//*[@id='field_loaiQh']"));
		Select quanhe = new Select(ele);
		quanhe.selectByVisibleText("Chồng");
		Thread.sleep(2000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btluuchuachonnhankhau()).click();
		Thread.sleep(2000);
		WebElement chuhocuahokhac = driver.findElement(ThemNhanKhauVaoHoKhauObject.message());
		String getchuhocuahokhac = chuhocuahokhac.getText();
		String chuhocuahokhac1 = ExeclUnitl.getData(4,6);
		System.out.println("Nhân khẩu này đang là chủ của hộ khác : " + getchuhocuahokhac);
		Assert.assertEquals(chuhocuahokhac1, getchuhocuahokhac);
	}	
	public void nhankhaudangcoquanhevoihokhac(WebDriver driver) throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btnhankhau()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.MaYTCNnhankhau()).sendKeys(ExeclUnitl.getData(5,2));
		driver.findElement(ThemNhanKhauVaoHoKhauObject.bttimkiemnhankhau()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.chinhsuanhankhau()).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(".//*[@id='field_loaiQh']"));
		Select quanhe = new Select(ele);
		quanhe.selectByVisibleText("Chồng");
		Thread.sleep(2000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btluuchuachonnhankhau()).click();
		Thread.sleep(2000);
		WebElement nhankhaucoqhvoihokhac = driver.findElement(ThemNhanKhauVaoHoKhauObject.xacnhanchuyenkhau());
		String getnhankhaucoqhvoihokhac = nhankhaucoqhvoihokhac.getText();
		String nhankhaucoqhvoihokhac1 = "Xác nhận chuyển khẩu";
		System.out.println("Bạn có muốn chuyển cá nhân này về hộ này không? : " + getnhankhaucoqhvoihokhac);
		Assert.assertEquals(nhankhaucoqhvoihokhac1, getnhankhaucoqhvoihokhac);
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btdongxacnhanchuyenkhau()).click();
	
	}
	public void themMoiNkVaoHkThanhCong(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btnhankhau()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.MaYTCNnhankhau()).sendKeys(ExeclUnitl.getData(6,4));
		driver.findElement(ThemNhanKhauVaoHoKhauObject.bttimkiemnhankhau()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.chinhsuanhankhau()).click();
		WebElement ele = driver.findElement(By.xpath(".//*[@id='field_loaiQh']"));
		Select quanhe = new Select(ele);
		quanhe.selectByVisibleText("Chồng");
		Thread.sleep(2000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btluuchuachonnhankhau()).click();
		Thread.sleep(3000);
		WebElement themnhankhauthanhcong = driver.findElement(ThemNhanKhauVaoHoKhauObject.message());
		String getthemnhankhauthanhcong = themnhankhauthanhcong.getText();
		String themnhankhauthanhcong1 = ExeclUnitl.getData(6, 6);
		System.out.println("Thêm mới nhân khẩu vào hộ khẩu thành công: " + getthemnhankhauthanhcong);
		Assert.assertEquals(themnhankhauthanhcong1, getthemnhankhauthanhcong);
		
	
	}
	public void nhanKhauDaTonTai(WebDriver driver) throws InterruptedException{
		Thread.sleep(6000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btnhankhau()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.MaYTCNnhankhau()).sendKeys(ExeclUnitl.getData(6,4));
		driver.findElement(ThemNhanKhauVaoHoKhauObject.bttimkiemnhankhau()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.chinhsuanhankhau()).click();
		WebElement ele = driver.findElement(By.xpath(".//*[@id='field_loaiQh']"));
		Select quanhe = new Select(ele);
		quanhe.selectByVisibleText("Chồng");
		Thread.sleep(2000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btluuchuachonnhankhau()).click();
		Thread.sleep(3000);
		WebElement themnhankhauthanhcong = driver.findElement(ThemNhanKhauVaoHoKhauObject.message());
		String getthemnhankhauthanhcong = themnhankhauthanhcong.getText();
		String themnhankhauthanhcong1 = ExeclUnitl.getData(6, 6);
		System.out.println("Thêm mới nhân khẩu vào hộ khẩu thành công: " + getthemnhankhauthanhcong);
		Assert.assertEquals(themnhankhauthanhcong1, getthemnhankhauthanhcong);
	
	}
	public void soanhnhankhau(WebDriver driver ) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.TVN()).click();
		Thread.sleep(3000);
		WebElement MaYTCN = driver.findElement(ThemNhanKhauVaoHoKhauObject.MYTCNTVN());
		String getMaYTCN = MaYTCN.getText();
		String MaYTCN1 = ExeclUnitl.getData(6,4);
		System.out.println("Mã y tế cá nhân: " + getMaYTCN);
		
		WebElement quanhevoichuho = driver.findElement(ThemNhanKhauVaoHoKhauObject.quanhevoichuho());
		String getquanhevoichuho= quanhevoichuho.getText();
		String quanhevoichuho1 = "Chồng";
		System.out.println("Quan hệ với chủ hộ: " + getquanhevoichuho);
		
		Assert.assertEquals(MaYTCN1, getMaYTCN);
		Assert.assertEquals(quanhevoichuho1, getquanhevoichuho);
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btdong()).click();
		
	}
	public void nhanKhauNaydaTonTai(WebDriver driver) throws InterruptedException{
		Thread.sleep(6000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btthemnhankhau()).click();
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btnhankhau()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.MaYTCNnhankhau()).sendKeys(ExeclUnitl.getData(7,4));
		driver.findElement(ThemNhanKhauVaoHoKhauObject.bttimkiemnhankhau()).click();
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.chinhsuanhankhau()).click();
		WebElement ele = driver.findElement(By.xpath(".//*[@id='field_loaiQh']"));
		Select quanhe = new Select(ele);
		quanhe.selectByVisibleText("Chồng");
		Thread.sleep(2000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btluuchuachonnhankhau()).click();
		Thread.sleep(3000);
		WebElement nhankhaudatontai = driver.findElement(ThemNhanKhauVaoHoKhauObject.message());
		String getnhankhaudatontai = nhankhaudatontai.getText();
		String nhankhaudatontai1 = ExeclUnitl.getData(7, 6);
		System.out.println("Nhân khẩu này đã Tồn Tại trong hộ khẩu : " + getnhankhaudatontai);
		Assert.assertEquals(nhankhaudatontai1, getnhankhaudatontai);
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btdongnhakhautontai()).click();
	}
	public void suathongtinnhankhau(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.suanhankhau()).click();
		driver.findElement(ThemNhanKhauVaoHoKhauObject.btluunhankhau()).click();
		Thread.sleep(3000);
		WebElement suathongtinnhankhau = driver.findElement(ThemNhanKhauVaoHoKhauObject.message());
		String getsuathongtinnhankhau = suathongtinnhankhau.getText();
		String suathongtinnhankhau1 = ExeclUnitl.getData(8, 6);
		System.out.println("Sửa thông tin nhân khẩu thành công : " + getsuathongtinnhankhau);
		Assert.assertEquals(suathongtinnhankhau1, getsuathongtinnhankhau);
	}
	public void xoanhankhau(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.xoanhankhau()).click();
		WebElement xoanhankhau = driver.findElement(ThemNhanKhauVaoHoKhauObject.messagexoanhankhau());
		String getxoanhankhau = xoanhankhau.getText();
		String xoanhankhau1 = ExeclUnitl.getData(9, 6);
		System.out.println("Bạn có muốn bỏ cá nhân này ra khỏi hộ gia đình? : " + getxoanhankhau);
		Assert.assertEquals(xoanhankhau1, getxoanhankhau);
		Thread.sleep(2000);
		driver.findElement(ThemNhanKhauVaoHoKhauObject.dongnhankhau()).click();
		
	}
}


