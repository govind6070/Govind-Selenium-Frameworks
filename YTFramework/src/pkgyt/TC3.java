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

public class TC3 extends Base{

@Test
public void library() throws InterruptedException, IOException
{
	String classname = this.getClass().getSimpleName();
    String path = "C:/Users/Govind/Desktop/Screenshots/"+DateCalculation.datecalculate()+"_"+classname+".png";
    LogsCapture.takelogs(classname, "TC3 Started");
    Signin si = new Signin(driver, pr);
	si.login("govind.selen@gmail.com", "john@12345");
	
	String expectedurl = "https://www.youtube.com/";
	String actualurl = driver.getCurrentUrl();
	System.out.println(actualurl);

	Assert.assertTrue(Assertion1.assert1(expectedurl, actualurl));
	
    WebElement Library = driver.findElementByXPath(pr.getProperty("library"));
    Library.click();
    ScreenshotCapture.snapshot(driver, path);
    Thread.sleep(3000);
    System.out.println("Clicked Library");
    LogsCapture.takelogs(classname, "Clicked Library");
    
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
    System.out.println("TC3 complete");
    LogsCapture.takelogs(classname, "TC3 Completed");
}

}
