package object;

import org.openqa.selenium.By;

public class LichSuKhamChuaBenhObject {
	public static By txtMYTCN(){
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[1]/div[1]/input");
	}
	public static By bttimkiemlichsu(){
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[2]/div/button");
	}
	public static By lichsukhamchubenh(){
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr/td[9]/a[3]/i");
	}
	public static By btthemmoils(){
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[2]/div/button");
	}
	public static By txtngaykham(){
		return By.xpath(".//*[@id='field_ngayKham']");
	}
	public static By botrongngaykham(){
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div[1]/div[2]/div");
	}
	public static By ngaybatdau(){
		return By.xpath(".//*[@id='field_ngayBatDau']");
	}
	public static By botronggaybatdau(){
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div[2]/div[2]/div");
	}
	public static By ngayketthuc(){
		return By.xpath(".//*[@id='field_ngayKetThuc']");
	}
	public static By botrongngayngayketthuc(){
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div[3]/div[2]/div");
	}
	public static By txttendichvu(){
		return By.xpath(".//*[@id='tenDichVu']");
	}
	public static By txtketqua(){
		return By.xpath(".//*[@id='ketQua']");
	}
	public static By manhom(){
		return By.xpath(".//*[@id='nhomDichVu']/div[1]/span");
	}
	public static By chonmanhom(){
		return By.xpath(".//*[@id='ui-select-choices-row-50-3']/span/div");
	}
	public static By btcanlamsnag(){
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[38]/div/table/tbody/tr/td[6]/a/i");
	}
	public static By message(){
		return By.xpath(".//*[@id='toast-container']/div/div/div/div[1]");
	}
	public static By txttenthuoc(){
		return By.xpath(".//*[@id='tenThuoc']");
	}
	public static By txtsoluong(){
		return By.xpath(".//*[@id='field_soLuong']");
	}
	public static By btdonthuoc(){
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[39]/div/table/tbody/tr/td[6]/a/i");
	}
	public static By soluongnhapdangso(){
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[39]/div/table/tbody/tr/td[4]/div/div");
	}
	public static By btluu(){
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/button[2]");
	}
	public static By txtngayhenkham(){
		return By.xpath(".//*[@id='field_henLichKham']");
	}
	public static By xoa1kl() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr[1]/td[7]/a[2]/i");
		
	}           

	public static By xoa2kl() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[2]");
		               
	}
	public static By xoakl() {
		return By.xpath(" .//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr[2]/td[7]/a[2]/i");
		
	}
	public static By dongls() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/button[1]");

	}
	public static By benhsuls() {
		return By.xpath(".//*[@id='field_benhSu']");

	}
	public static By bacsinkhamls() {
		return By.xpath(".//*[@id='field_bacSiKham']");

	}
	public static By ngayhenkhamls() {
		return By.xpath(".//*[@id='field_henLichKham']");

	}
	public static By tungaydenngayls() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr[2]/td[2]");

	}

	public static By benhsu1ls() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr[2]/td[3]");

	}

	public static By noikhamls() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div/div/div[2]/ng-include/div/div[3]/div/div/table/tbody/tr[2]/td[5]");

	}

	public static By bacsils() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr[2]/td[6]");

	}
}
