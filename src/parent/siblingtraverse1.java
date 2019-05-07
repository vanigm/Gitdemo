package parent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class siblingtraverse1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/AMRESH/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com");
		driver.findElement(By.linkText("Interview Guide")).click();
		//driver.findElement(By.xpath("id(\"tablist1-tab1\")/following-sibling::li[2]")).click();
		driver.findElement(By.xpath("//li[contains(@id,'tablist1-tab1')]/following-sibling::li[3]")).click();
		driver.findElement(By.xpath("//*[text()=' Selenium ']")).click();
		System.out.println(driver.findElement(By.xpath("id(\"tablist1-panel2\")/ul[1]/li[1]/div[1]/h3[1]")).getText());
		System.out.println(driver.findElement(By.xpath("id(\"tablist1-panel2\")/ul[1]/li[1]/div[1]/h3[2]")).getText());

	}

}
