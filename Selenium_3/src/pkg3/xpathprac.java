package pkg3;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpathprac {	
static ChromeDriver driver;
Select s1;
Select s2;
Select s3;
@BeforeClass  //*************************Before ******************************************
public static void launch() 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Govind\\Desktop\\Chrome Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();	
}
@Before // *********Before Class for dropdown****************************
public void drop(){
	WebElement day = driver.findElementByXPath("//select[@*='birthday_day']");
	s1 = new Select(day);
	WebElement mon = driver.findElementByXPath("//select[contains(@title,'Mon')]");
	s2 = new Select(mon);
	WebElement year = driver.findElementByXPath("//select[contains(@title,'Year')]");
	s3 = new Select(year);	}
@Test    //  *************Test ****************************************
public void performxp(){
WebElement fname = driver.findElementByXPath("//input[@name='firstname']");
fname.sendKeys("Govind");
WebElement sname = driver.findElementByXPath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='lastname']");
sname.sendKeys("Verma");
WebElement email = driver.findElementByXPath("//input[@id='u_0_v'or @name='reg_email__']");
email.sendKeys("govind.607@gmail.com");
WebElement pswd = driver.findElementByXPath("//*[@name='reg_passwd__']");
pswd.sendKeys("01234");
s1.selectByVisibleText("14");
s2.selectByValue("12");
s3.selectByVisibleText("1986");	
WebElement gender = driver.findElementByXPath("//input[@class='_8esa' and @name='sex' and @value='2']");
gender.click();
WebElement signup = driver.findElementByXPath("//button[@name='websubmit']");
signup.click();}
@After // ******************* After *********************************************************
public void close()
{
System.out.println("Test complete");
}
			
}	

