package pkgyt.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signin {

ChromeDriver driver;
Properties pr;	

public Signin(ChromeDriver driver, Properties pr)
{
this.driver = driver;
this.pr = pr;
}
	
public void login(String username, String password) throws InterruptedException
{
	WebElement Signin = driver.findElement(By.xpath(pr.getProperty("signin")));
	Signin.click();
	Thread.sleep(1000);
	WebElement Username = driver.findElementByXPath(pr.getProperty("username"));
	Username.sendKeys(username);
	WebElement Next = driver.findElementByXPath(pr.getProperty("nextbutton"));
	Next.click();
	Thread.sleep(2000);
	WebElement Password = driver.findElementByXPath(pr.getProperty("password"));
	Password.sendKeys(password);
	WebElement Next2 = driver.findElementByXPath(pr.getProperty("nextbutton"));
	Next2.click();
	Thread.sleep(4000);
}
	
}
