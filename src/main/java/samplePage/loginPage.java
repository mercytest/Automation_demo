package samplePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage extends pages {
	static WebDriver driver;

	public static void launchBrowser() throws Exception {
//		try {
//			---------------Personal PC path------------------
//			 System.setProperty("webdriver.chrome.driver", "C:/Users/Yogin/Downloads/chromedriver_win32/chrome/chromedriver.exe"); 

			/* --------------------------Office PC path --------------------------- */
			System.setProperty("webdriver.chrome.driver", "C:/Users/mercy/Downloads/chromedriver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Chrome is launched");
			String url = "https://accounts.google.com/signin";
			driver.get(url);
			System.out.println("Gmail site is opened");

			WebDriverWait wait = new WebDriverWait(driver, 10);
			System.out.println("checkarrival method hits");
			WebElement email = driver.findElement(By.xpath("//input[@type='email']"));

			ExpectedConditions.elementToBeClickable(email);
			email.click();
			System.out.println("Email field is clicked");
			email.clear();
			System.out.println("Email field is cleared");
			Thread.sleep(100);
			email.sendKeys("propertydeal1730@gmail.com");
			System.out.println("Email is entered");

			WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
			wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
			nextBtn.click();
			System.out.println("Next Button is clicked");
			WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));

			wait.until(ExpectedConditions.visibilityOf(pswd));
			wait.until(ExpectedConditions.elementToBeClickable(pswd));
			if(pswd.isEnabled())
			{
			pswd.click();
			System.out.println("Password field is clicked");
			pswd.clear();
			System.out.println("Password field is cleared");
			Thread.sleep(100);
			pswd.sendKeys("Home@1730");
			} else {
			System.out.println("Issue in entering password");
			driver.quit();
			}

//		} catch (Exception e) {
//			System.out.println("Issue in entering email id");
//			e.printStackTrace();
//		}

	}
	

	public static void checkArrival() throws Exception {
//		try {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		System.out.println("checkarrival method hits");
//		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
//
//		ExpectedConditions.elementToBeClickable(email);
//		email.click();
//		System.out.println("Email field is clicked");
//		email.clear();
//		System.out.println("Email field is cleared");
//		Thread.sleep(100);
//		email.sendKeys("propertydeal1730@gmail.com");
//		System.out.println("Email is entered");
//
//		WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
//		wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
//		nextBtn.click();
//		Thread.sleep(10);
//		}catch(Exception e) {
//			System.out.println("Issue in entering email ID from seperate method");
//		}

	}

	public static void passwordEntry() {
//		try {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
//		wait.until(ExpectedConditions.elementToBeClickable(pswd));
//		pswd.click();
//		pswd.clear();
//		pswd.sendKeys("Home@1730");
//		}catch(Exception e) {
//			System.out.println("Issue in entering password");
//		}
	}


}