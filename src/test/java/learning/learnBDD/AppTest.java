package learning.learnBDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {

	public static WebDriver driver;

	public static void testMethod() {

		System.out.println("Hello World!");

		System.setProperty("webdriver.chrome.driver", "G:\\Programming Files\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("URL launched");
		driver.quit();
		
	}

}
