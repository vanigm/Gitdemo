package parent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlexpathvalidation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/AMRESH/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.co.in");
		driver.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input")).sendKeys("online selenium tutorial");
		driver.findElement(By.xpath("//div[@class='tsf-p']/div[3]/center/input")).click();
	}

}
