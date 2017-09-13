package object;

import org.openqa.selenium.By;

public class LoginObject {
	public static By UserName(){
		return By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[3]/div/input");
		
	}
	public static By Pass(){
		return By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[4]/div/input");
		
	}
	public static By BTLogin(){
		return By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[5]/button");
		
	}
	public static By Thieutaikhoandangnhap(){
		return By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[2]/span[2]");
		
	}
	public static By Thieumatkhaudangnhap(){
		return By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[2]/span[3]");
		
	}
	public static By Thieutaikhoandangnhap1(){
		return By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[2]/span[2]");
		
	}
	public static By dangnhapthatbai(){
		return By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[2]/span[1]");
		
	}
	public static By dangnhapthanhcong(){
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div/h2");
		
	}
	
	

}
