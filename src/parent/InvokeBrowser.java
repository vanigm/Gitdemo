package parent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class InvokeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users/AMRESH/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driverc = new ChromeDriver(); 
		
		//WebDriver Selenium = new InternetExplorerDriver();
		System.setProperty("webdriver.gecko.driver","C://Users/AMRESH/Downloads/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println("Invoked Firefox browser");

		
		

	}

}
