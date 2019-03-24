package CustomFunction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectAlldataFromDrpDwn {
	@SuppressWarnings("unused")
	private static WebElement element;
	
	public static void SelectAlldataDrpDownById(WebDriver driver, String day)
	{
	 Select dropdown1=new Select(driver.findElement(By.id(day)));
		
		List<WebElement> element=dropdown1.getOptions();
		element.size();
		 for (int j = 0; j < element.size(); j++) {
		        System.out.println(element.get(j).getText());

		    }
}
}
