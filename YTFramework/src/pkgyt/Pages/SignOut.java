package pkgyt.Pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignOut {

ChromeDriver driver;
Properties pr;

public SignOut(ChromeDriver driver, Properties pr)
{
this.driver = driver;
this.pr= pr;
}

	
public void logout() throws InterruptedException
{
	WebElement Account = driver.findElementByXPath(pr.getProperty("account")); 
    Account.click();
    Thread.sleep(3000);
	WebElement Signout = driver.findElementByXPath(pr.getProperty("signout"));
	Signout.click();
	Thread.sleep(2000);

}
	
	
}
