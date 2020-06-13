package pkgyt.utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {	

	
public static void DropDownSelectionByVisibleText(WebElement element, String visibleText)
{

Select s = new Select(element);	
s.selectByVisibleText(visibleText);	
}

public static void DropDownSelectionByValue(WebElement element, String value)
{

Select s = new Select(element);	
s.selectByValue(value);
}

public static void DropDownSelectionByIndex(WebElement element, int indexno)
{

Select s = new Select(element);	
s.selectByIndex(indexno);	
}	

public static void DropDownSelectionByActionsArrowDown (ChromeDriver driver, int count)
{

	Actions ac = new Actions(driver);
	
	for (int i=0; i<count;i++)
	{
	ac.sendKeys(Keys.ARROW_DOWN).perform();			
	}	
ac.sendKeys(Keys.ENTER);

	
}


}
