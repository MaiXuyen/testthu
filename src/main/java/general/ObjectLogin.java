package general;

import org.openqa.selenium.By;

public class ObjectLogin {
	public static By Username() {
		return By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[3]/div/input");
	}

	public static By Password() {
		return By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[4]/div/input");
	}

	public static By btLogin() {
		return By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[5]/button");
	}


}
