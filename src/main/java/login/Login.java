package login;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import general.ExeclUnitl;
import object.LoginObject;

public class Login {
	public void botrong(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(LoginObject.BTLogin()).click();
		Thread.sleep(3000);
		WebElement Thieutaikhoandangnhap = driver.findElement(LoginObject.Thieutaikhoandangnhap());
		String getThieutaikhoandangnhap = Thieutaikhoandangnhap.getText();
		String Thieutaikhoandangnhap1 = ExeclUnitl.getData(2, 4);
		System.out.println("Bỏ trống tên và mật khẩu đăng nhập: " + getThieutaikhoandangnhap);

		Assert.assertEquals(Thieutaikhoandangnhap1, getThieutaikhoandangnhap);
	}

	public void botrongMK(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(LoginObject.UserName()).sendKeys(ExeclUnitl.getData(3, 2));
		driver.findElement(LoginObject.BTLogin()).click();

		Thread.sleep(3000);
		WebElement bottrongMK = driver.findElement(LoginObject.Thieumatkhaudangnhap());
		String getbottrongMK = bottrongMK.getText();
		String bottrongMK1 = "Thiếu mật khẩu đăng nhập! Đề nghị kiểm tra lại.";
		System.out.println("Bỏ trống mật khẩu đăng nhập: " + getbottrongMK);

		Assert.assertEquals(bottrongMK1, getbottrongMK);
	}

	public void botrongtenDN(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(LoginObject.UserName()).clear();
		driver.findElement(LoginObject.Pass()).sendKeys(ExeclUnitl.getData(4, 3));
		driver.findElement(LoginObject.BTLogin()).click();
		//commet login
		Thread.sleep(3000);
		WebElement botrongTDN = driver.findElement(LoginObject.Thieutaikhoandangnhap1());
		String getbotrongTDN = botrongTDN.getText();
		String botrongTDN1 = "Thiếu tài khoản đăng nhập! Đề nghị kiểm tra lại.";
		System.out.println("Bỏ trống tên đăng nhập: " + getbotrongTDN);

		Assert.assertEquals(botrongTDN1, getbotrongTDN);

	}

	public void nhapsaiMK(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(LoginObject.UserName()).clear();
		driver.findElement(LoginObject.UserName()).sendKeys(ExeclUnitl.getData(5, 2));
		driver.findElement(LoginObject.Pass()).clear();
		driver.findElement(LoginObject.Pass()).sendKeys(ExeclUnitl.getData(5, 3));
		driver.findElement(LoginObject.BTLogin()).click();

		Thread.sleep(3000);
		WebElement nhapsaiMK = driver.findElement(LoginObject.dangnhapthatbai());
		String getnhapsaiMK = nhapsaiMK.getText();
		String nhapsaiMK1 = "Đăng nhập thất bại! Bạn vui lòng kiểm tra thông tin đăng nhập và thử lại.";
		System.out.println("Nhập sai mật khẩu đăng nhập: " + getnhapsaiMK);

		Assert.assertEquals(nhapsaiMK1, getnhapsaiMK);

	}

	public void loginthanhcong(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(LoginObject.UserName()).clear();
		driver.findElement(LoginObject.UserName()).sendKeys(ExeclUnitl.getData(6, 2));
		driver.findElement(LoginObject.Pass()).clear();
		driver.findElement(LoginObject.Pass()).sendKeys(ExeclUnitl.getData(6, 3));
		driver.findElement(LoginObject.BTLogin()).click();

		Thread.sleep(3000);
		WebElement trangchu = driver.findElement(LoginObject.dangnhapthanhcong());
		String gettrangchu = trangchu.getText();
		String trangchu1 = "Trang chủ";
		System.out.println("Đăng nhập thàn công: " + gettrangchu);

		Assert.assertEquals(trangchu1, gettrangchu);

	}

}
