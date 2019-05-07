package parent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/AMRESH/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("vani_gm@yahoo.com");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("vanigengam");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		driver.navigate().back();
		driver.navigate().forward();
		
		/*driver.findElement(By.cssSelector("input#email.inputtext")).sendKeys("vani_gm@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("vanigengam");
		driver.findElement(By.id("u_0_a")).click();*/
		
		/*driver.findElement(By.className("inputtext")).sendKeys("vani");
		driver.findElement(By.className("inputtext")).sendKeys("pass123");*/
		//driver.findElement(By.id("email")).sendKeys("vani_gm@yahoo.com");
		//driver.findElement(By.name("pass")).sendKeys("vanigengam");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.xpath("//*[@id=\'u_0_a\']")).click();//
		
		/*driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("vani");
		driver.findElement(By.name("pw")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());*/
		

		
	}

}
