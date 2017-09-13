package object;

import org.openqa.selenium.By;

public class ThemKhamLapObject {
	public static By txtMYTCN(){
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[1]/div[1]/input");
		
	}
	public static By bttimkiem(){
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[2]/div/button");
		
	}
	public static By taomoihososuckhoe(){
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr/td[9]/a[1]/i");
		
	}
	public static By btluu(){
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[2]");
	}
	public static By message(){
		return By.xpath(".//*[@id='toast-container']/div/div/div/div");
		
	}
	public static By txtngaykham(){
		return By.xpath(".//*[@id='field_ngayKham']");
		                 
	}
	public static By txtbacsikham(){
		return By.xpath(".//*[@id='field_bacSiKham']");
		
	}
	public static By cosokham(){
		return By.xpath(".//*[@id='field_maCskcb']/div[1]/span/a/i");
		
	}
	public static By maucosokham(){
		return By.xpath(".//*[@id='field_maCskcb']/div[1]");
		
	}
	public static By bacsitheodoi(){
		return By.xpath(".//*[@id='field_maIcdTheoDoi']");
		
	}
	public static By btdong(){
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[1]");
		
	}
	public static By txtbenhsu(){
		return By.xpath(".//*[@id='field_benhSu']");
		
	}
	public static By txtngayhenkham(){
		return By.xpath(".//*[@id='field_henLichKham']");
		
	}
	public static By lichsukb() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr/td[9]/a[3]/i");

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
	public static By tungaydenngay() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr/td[2]");

	}

	public static By benhsu1() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr/td[3]");

	}

	public static By noikhambenh() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div/div/div[2]/ng-include/div/div[3]/div/div/table/tbody/tr/td[5]");

	}

	public static By bacsikhamenh() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr/td[6]");

	}

	

}
