package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook {
	static WebDriver d;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Bhaskar\\A QT Mar17\\SeleniumDrivers\\geckodriver.exe");
		 d = new FirefoxDriver();
		 d.get("https://www.facebook.com/");
	     d.findElement(By.id("email")).sendKeys("vvhjvhjvhjv");
		 d.findElement(By.id("pass")).sendKeys("asdf");

		
		
		
		
	}

}
