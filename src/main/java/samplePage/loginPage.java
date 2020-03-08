package samplePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage extends pages {
static WebDriver driver;
static ExpectedConditions ec;
static WebDriverWait wait;

@FindBy(xpath="//input[@type='email']") public static WebElement email;

public static void setUp() throws Exception {
	try {
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Yogin/Downloads/chromedriver_win32/chrome/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
        
         driver.manage().window().maximize();

         String url = "https://accounts.google.com/signin";

         driver.get(url);
	} catch (Exception e) {
		System.out.println("Chrome is launched");
	    throw new Exception(e);
	}
	
}

	public static void checkArrival() throws Exception {
			wait.until(ec.visibilityOf(email));
			email.click();
			email.clear();
			email.sendKeys("mercydianaj@gmail.com");
			System.out.println("Page arrived on login page");
			driver.quit();
	        
	    }
		
	}

