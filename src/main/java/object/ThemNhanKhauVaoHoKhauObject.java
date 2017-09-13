package object;

import org.openqa.selenium.By;

public class ThemNhanKhauVaoHoKhauObject {
	public static By QuanLyHogiaDinh() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[1]/div/ul/li[3]/a");
	}

	public static By Quanlyhokhau() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[1]/div/ul/li[3]/ul/li[2]/a");
	}

	public static By ThemMoiHoKhau() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[2]/div[2]/button[1]");
	}
	
	public static By message() {
		return By.xpath(".//*[@id='toast-container']/div/div/div/div");
	}
	public static By btchuho() {
		return By.xpath(".//*[@id='hokhau_dialog']/div[1]/div[2]/div/span/button");
	}
	public static By MaYTCN() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[1]/form/div[1]/div[1]/input");
	}
	public static By bttimkiem() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[2]/div/button");
	}
	public static By btchinhsua() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[2]/div[2]/table/tbody/tr/td[8]/a/i");
	}
	public static By dong() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[1]");
	}

	public static By thoat() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[1]/button");
	}

	public static By thoat1() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[1]/button");
	}
	// trường hợp đúng
	public static By chuho1() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div[1]/div/input");
	}

	public static By xoa() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr/td[7]/div/a[3]");
	}

	public static By xoa1() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[2]");
	}

	public static By chuhoMDA() {
		return By.xpath(".//*[@id='hokhau_dialog']/div[10]/div[1]/div/div[2]/table/tbody/tr/td[1]/a");

	}

	public static By MYTCN1() {
		return By.xpath(".//*[@id='ttCaNhan']/div/div/div[2]/form/div[1]/div[1]/p");

	}

	public static By chohososanh() {
		return By.xpath(".//*[@id='ttCaNhan']/div/div/div[2]/form/div[2]/div[2]/p");

	}

	public static By dongsosanh() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[3]/button");

	}
	public static By chuho() {
		return By.xpath(".//*[@id='hokhau_dialog']/div[1]/div[2]/div/span/button");
	}

	public static By MYTCN() {
		return By.xpath(
				"//*[@id='body']/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[1]/form/div[1]/div[1]/input");
	}

	public static By BTtimkiem() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[2]/div/button");
	}

	public static By chinhsua() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[2]/div[2]/table/tbody/tr/td[8]/a/i");
	}
	

	public static By btluuhk() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[2]");
	
	}
	
	public static By bttimkiem2() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/button");
	}
	public static By timkiem() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[2]/div/button");
	}
	public static By btluu() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[2]");
	}
	public static By btthemnhankhau() {
		return By.xpath(".//*[@id='hokhau_dialog']/div[10]/div[1]/div/div[1]/div/div/a/span[2]");
	}
	public static By btluuchuachonnhankhau() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/form/div[3]/a[2]");
	}
	public static By btnhankhau() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/form/div[2]/div/div[1]/div/span/button");
	}
	public static By MaYTCNnhankhau() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[1]/form/div[1]/div[1]/input");
	}
	public static By bttimkiemnhankhau() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[2]/div/button");
	}
	public static By chinhsuanhankhau() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[2]/div[2]/table/tbody/tr/td[8]/a/i");
	}
	public static By checkboxloaiquanhe() {
		return By.xpath(".//*[@id='field_loaiQh']");
	}
	public static By xacnhanchuyenkhau() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/form/div[1]/h4");
	}
	public static By btdongxacnhanchuyenkhau() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/form/div[3]/button[1]");
	}
	public static By TVN() {
		return By.xpath(".//*[@id='hokhau_dialog']/div[10]/div[1]/div/div[2]/table/tbody/tr[2]/td[1]/a");
	}
	public static By MYTCNTVN() {
		return By.xpath(".//*[@id='ttCaNhan']/div/div/div[2]/form/div[1]/div[1]/p");
	}
	public static By quanhevoichuho() {
		return By.xpath(".//*[@id='ttCaNhan']/div/div/div[2]/form/div[2]/div[2]/p");
	}
	public static By btdong() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[3]/button");
	}
	public static By btdongnhakhautontai() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/form/div[3]/a[1]");
	}
	public static By suanhankhau() {
		return By.xpath(".//*[@id='hokhau_dialog']/div[10]/div[1]/div/div[2]/table/tbody/tr[2]/td[5]/a[1]/i");
	}
	public static By btluunhankhau() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/form/div[3]/a[2]");
	}
	public static By xoanhankhau() {
		return By.xpath(".//*[@id='hokhau_dialog']/div[10]/div[1]/div/div[2]/table/tbody/tr[2]/td[5]/a[2]/i");
	}
	public static By dongnhankhau() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[1]");
	}

	public static By messagexoanhankhau() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/p");
	}

}
