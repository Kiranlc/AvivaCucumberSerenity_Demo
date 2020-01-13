package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Utility {
	
	public static void waitPageLoad(WebDriver driver)
	{
	     ExpectedCondition<Boolean>condition = new ExpectedCondition<Boolean>()
	    		 {
					public Boolean apply(WebDriver driver) {
						// TODO Auto-generated method stub
						return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
					}
	    		 };
	    	 
	    		 WebDriverWait wait = new WebDriverWait(driver,5);
	    		 wait.until(condition);
	    		 
	}
}
