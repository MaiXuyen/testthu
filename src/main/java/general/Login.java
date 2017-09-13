package general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	public void Login (WebDriver driver) throws InterruptedException{
		Thread.sleep(5000);
		WebElement element = driver.findElement(ObjectLogin.Username());
		if (element.isEnabled()) {
			element.sendKeys("tandd");
			System.out.println("written");
		}
		driver.findElement(ObjectLogin.Password()).sendKeys("123456aA@");
		element.click();
		driver.findElement(ObjectLogin.btLogin()).click();

	}
	}
	

