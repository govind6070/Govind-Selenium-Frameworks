package pkgyt;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pkgyt.Assertion.Assertion1;
import pkgyt.Base.Base;
import pkgyt.Pages.SignOut;
import pkgyt.Pages.Signin;
import pkgyt.utilities.DateCalculation;
import pkgyt.utilities.LogsCapture;
import pkgyt.utilities.ScreenshotCapture;

public class TC2 extends Base {

@Test
public void subscription() throws InterruptedException, IOException
{    
	
	String classname = this.getClass().getSimpleName();
	String path = "C:/Users/Govind/Desktop/Screenshots/"+DateCalculation.datecalculate()+"_"+classname+".png";
	LogsCapture.takelogs(classname, "TC2 started");
	Signin si = new Signin(driver, pr);
	si.login("govind.selen@gmail.com", "john@12345");
	
	String expectedurl = "https://www.youtube.com/";
	String actualurl = driver.getCurrentUrl();
	System.out.println(actualurl);

	Assert.assertTrue(Assertion1.assert1(expectedurl, actualurl));
	
    WebElement Subscription = driver.findElementByXPath(pr.getProperty("subscription"));
    Subscription.click();
    ScreenshotCapture.snapshot(driver, path);
    Thread.sleep(3000);
    LogsCapture.takelogs(classname, "Clicked Subscription");
    System.out.println("Clicked Subscription");
    
    WebElement acnt = driver.findElementByXPath(pr.getProperty("account"));
    acnt.click();
    Thread.sleep(2000);
    WebElement emailid = driver.findElementByXPath(pr.getProperty("emid"));
    String actualid=emailid.getText();
    System.out.println(actualid);
    String expectid = "govind.selen@gmail.com";

    Assert.assertTrue(Assertion1.assert1(expectid, actualid));
    acnt.click();
    
    SignOut so = new SignOut(driver,pr);
    so.logout();
    System.out.println("TC2 complete");
    LogsCapture.takelogs(classname, "TC2 completed");
}


}
