package pkgyt;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pkgyt.Assertion.Assertion1;
import pkgyt.Base.Base;
import pkgyt.Pages.SignOut;
import pkgyt.Pages.Signin;
import pkgyt.Pages.VideoPlay;
import pkgyt.utilities.DateCalculation;
import pkgyt.utilities.LogsCapture;
import pkgyt.utilities.ScreenshotCapture;

public class TC6 extends Base{

@Test
public void subscribechannel() throws InterruptedException, IOException
{   
	String classname = this.getClass().getSimpleName();
	String path = "C:/Users/Govind/Desktop/Chrome Driver/"+DateCalculation.datecalculate()+"_"+classname+".png";
	LogsCapture.takelogs(classname, "TC6 Started");
	Signin si = new Signin(driver, pr);
	si.login("govind.selen@gmail.com", "john@12345");
	
	String expectedurl = "https://www.youtube.com/";
	String actualurl = driver.getCurrentUrl();
	System.out.println(actualurl);

	Assert.assertTrue(Assertion1.assert1(expectedurl, actualurl));
	
	VideoPlay vp = new VideoPlay(driver, pr);
	vp.searchvideotitleandplay("Taarak Mehta Ka Ooltah Chashmah");
	ScreenshotCapture.snapshot(driver, path);

System.out.println("Searched for specific video and playing for TC6");    
Thread.sleep(6000);

try
{
WebElement Subscribe = driver.findElementByXPath(pr.getProperty("subscribe"));
Subscribe.click();
LogsCapture.takelogs(classname, "Subscribed Video");
}
catch (Exception e) {
System.out.println("Already Subscribed this channel");
LogsCapture.takelogs(classname, "Video Already subscribed");
}

System.out.println("Subscribed Video");

ScreenshotCapture.snapshot(driver, path);

Thread.sleep(5000);

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
System.out.println("TC6 complete");
LogsCapture.takelogs(classname, "TC6 complete");
}


}
