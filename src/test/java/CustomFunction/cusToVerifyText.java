package CustomFunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cusToVerifyText {
	private static WebElement element;
	public static void cusToVerifyTextp(WebDriver driver, String xpath, String disclaimer,String text) 
	{
		
		try{
			
	
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 element=driver.findElement(By.xpath(xpath));
		 Thread.sleep(2000);
		 String str=element.getText();
		 System.out.println(str);
		 if(disclaimer.equals(str))
		 {
			 System.out.println(text+" "+"verfied successfully"); 
		 }
		 else
		 {
			 System.out.println(text+" "+"not verfied successfully");  
		 }
		 
		 
		 
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}
