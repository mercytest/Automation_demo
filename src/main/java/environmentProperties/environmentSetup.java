package environmentProperties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class environmentSetup {
	static WebDriver driver; 
	    public static void main() {
	    	 System.setProperty("webdriver.chrome.driver", "");
	            WebDriver driver = new ChromeDriver();
	           
	            driver.manage().window().maximize();

	            String url = "https://accounts.google.com/signin";

	            driver.get(url);
}
}