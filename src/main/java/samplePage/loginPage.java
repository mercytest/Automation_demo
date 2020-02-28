package samplePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage extends pages {
static WebDriver driver;
static ExpectedConditions ec;
static WebDriverWait wait;

@FindBy(id= "identifierId") private static WebElement email;


	public static void checkArrival() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver , 2000) ;
		try {
			wait.until(ExpectedConditions.visibilityOf(email));
			
	    } catch(Exception e) {
	    	System.out.println("Page arrived on login page");
	    throw new Exception(e);
	    }
		
	}

}
