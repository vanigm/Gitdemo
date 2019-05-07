package parent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users/AMRESH/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("abcd");
		driver.findElement(By.cssSelector("[name='pw']")).sendKeys("newpass");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();

	}

}
