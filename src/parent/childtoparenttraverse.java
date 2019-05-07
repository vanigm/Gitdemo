package parent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childtoparenttraverse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users/AMRESH/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com");
		driver.findElement(By.linkText("Interview Guide")).click();
		System.out.println(driver.findElement(By.xpath("//*[contains(@id,'tablist1-tab2')]/parent::ul")).getTagName());

	}

}
