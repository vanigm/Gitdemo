package parent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/AMRESH/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("vmahant");
		driver.findElement(By.cssSelector("#password")).sendKeys("12345");
		driver.findElement(By.cssSelector("#Login")).click();
		
		/*driver.findElement(By.id("username")).sendKeys("vani");
		driver.findElement(By.name("pw")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());*/
		

	}

}
