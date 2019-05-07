package parent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkvalidation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C://Users/AMRESH/Downloads/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://qaclickacademy.com");	
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		driver.close();
								
	}

}
