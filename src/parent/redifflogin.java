package parent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redifflogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users/AMRESH/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://rediff.com");
		driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.cssSelector("[title*='Sign in']")).click();
		driver.findElement(By.xpath("//*[@name='login']")).sendKeys("hellorediff");
		driver.findElement(By.xpath("//*[contains(@id,'pass')]")).sendKeys("newpass");
		driver.findElement(By.cssSelector("[name*='proc']")).click();
		
	}
}