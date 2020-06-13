package pkgyt;

import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
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

public class TC7 extends Base {

@Test
public void comment() throws InterruptedException, IOException
{
	String classname = this.getClass().getSimpleName();
	String path = "C:/Users/Govind/Desktop/Chrome Driver/"+DateCalculation.datecalculate()+"_"+classname+".png";
	LogsCapture.takelogs(classname, "TC7 Started");
	Signin si = new Signin(driver, pr);
	si.login("govind.selen@gmail.com", "john@12345");
	
	String expectedurl = "https://www.youtube.com/";
	String actualurl = driver.getCurrentUrl();
	System.out.println(actualurl);

	Assert.assertTrue(Assertion1.assert1(expectedurl, actualurl));
	
	VideoPlay vp = new VideoPlay(driver, pr);
	vp.searchvideotitleandplay("Taarak Mehta Ka Ooltah Chashmah");
    
System.out.println("Searched for specific video for TC7");

Actions ac = new Actions(driver);
ac.sendKeys(Keys.PAGE_DOWN).perform();
Thread.sleep(9000);
WebElement icon = driver.findElementByXPath(pr.getProperty("accounticon"));
icon.click();
ac.sendKeys(Keys.TAB).perform();
Thread.sleep(3000);
ac.sendKeys("Nice Show").perform();
Thread.sleep(5000);
ScreenshotCapture.snapshot(driver, path);
WebElement Post = driver.findElementByXPath(pr.getProperty("post"));
Post.click();
LogsCapture.takelogs(classname, "Posted Comments");
System.out.println("Posted comments for TC7");
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
System.out.println("Test Case 7 complete");
LogsCapture.takelogs(classname, "TC7 Complete");
}


}
