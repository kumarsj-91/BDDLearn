package learning.learnBDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static WebDriver driver;
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.setProperty("webdriver.chrome.driver", "G:\\Programming Files\\Selenium\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
    }
}
