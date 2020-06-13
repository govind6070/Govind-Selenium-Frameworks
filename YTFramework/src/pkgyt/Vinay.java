package pkgyt;



import java.io.IOException;
//import java.util.Date;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import pkgyt.Assertion.Assertion1;
import pkgyt.Base.Base;
import pkgyt.Pages.Signin;
import pkgyt.Pages.SignOut;
import pkgyt.utilities.DateCalculation;
import pkgyt.utilities.LogsCapture;
import pkgyt.utilities.ScreenshotCapture;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Vinay extends Base {


		
		@Test
		public void Trending() throws InterruptedException, IOException
		{
		

		
		Signin s = new  Signin(driver,pr);
		s.login("govind.selen@gmail.com", "john@12345");
		LogsCapture.takelogs("TC1", "Sign in"); //log
		Thread.sleep(10000);
		
		//--------------------------------------------------Assertions
		
		String exp_url = "https://www.youtube.com/";
		String actual_url= driver.getCurrentUrl();
		Assert.assertEquals(actual_url, exp_url);//hard assertion
		
		System.out.println("hard assertion passed");
		
		String exp_email= "govind.selen@gmail.com";
		
		WebElement imageClk = driver.findElementByXPath(pr.getProperty("account"));
		imageClk.click();
		
		Thread.sleep(5000);
		
		WebElement email= driver.findElementByXPath("//yt-formatted-string[@id='email']");
		String actual_mail= email.getText();
		
		System.out.println(actual_mail);
		
		
		
		Assert.assertTrue(Assertion1.assert1(exp_email, actual_mail));
		System.out.println("Soft assertion passed");
		
		//-----------------------------------------------------Assertions
		
		imageClk.click();
		WebElement Trending = driver.findElementByXPath(pr.getProperty("trending"));
		Trending.click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		System.out.println("trending videos");
		
		Thread.sleep(3000);
		
		SignOut s1 = new SignOut(driver,pr);
		s1.logout();
		Thread.sleep(5000);
		
		LogsCapture.takelogs("TC1", "Sign Out"); //log
		
		String classname= this.getClass().getSimpleName();
		String path= "C:/Users/Govind/Desktop/Screenshots/"+ DateCalculation.datecalculate()+"_"+ classname+ ".png" ;
		ScreenshotCapture.snapshot(driver, path);
		
	}

		
		}	
	

