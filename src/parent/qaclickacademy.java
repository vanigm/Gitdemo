package parent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qaclickacademy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/AMRESH/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/interview.php");
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/div[1]/div[1]/div[1]/div[1]/ul[1]")).getText());
		driver.findElement(By.xpath("//*[text()=' Appium ']")).click();
		System.out.println(driver.findElement(By.xpath("//*[text()=' Appium ']")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-panel1']")).getText());
		driver.findElement(By.xpath("//*[text()=' Appium ']/following-sibling::li[1]")).click();
		System.out.println(driver.findElement(By.xpath("//*[text()=' Appium ']/following-sibling::li[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-panel2']")).getText());
		driver.findElement(By.xpath("//*[text()=' Appium ']/following-sibling::li[2]")).click();
		System.out.println(driver.findElement(By.xpath("//*[text()=' Appium ']/following-sibling::li[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-panel3']")).getText());
		driver.findElement(By.xpath("//*[text()=' Appium ']/following-sibling::li[3]")).click();
		System.out.println(driver.findElement(By.xpath("//*[text()=' Appium ']/following-sibling::li[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-panel4']")).getText());

	}

}
