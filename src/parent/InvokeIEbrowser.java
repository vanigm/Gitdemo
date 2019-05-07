package parent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokeIEbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver","C://Users/AMRESH/Downloads/IEDriverServer_x64_3.8.0/IEDriverServer.exe");
		 WebDriver driver=new InternetExplorerDriver();
		 driver.get("https://amazon.in");
		 //driver.close();
	}

}
