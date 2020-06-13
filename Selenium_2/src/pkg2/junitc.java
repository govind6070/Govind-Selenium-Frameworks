package pkg2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class junitc {
ChromeDriver driver;
@Before
public void launch()
{
	System.setProperty("webdriver.chrome.driver", "../Selenium_1/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
}

@Test
public void perform() 
{
	WebElement Firstnm= driver.findElement( By.cssSelector("input#u_0_m"));
	Firstnm.sendKeys("Govind");
	WebElement Surname = driver.findElement( By.cssSelector("input[id='u_0_o']"));
	Surname.sendKeys("Verma");
	WebElement mobile = driver.findElement( By.cssSelector("input#u_0_r"));
	mobile.sendKeys("1234567890");
	WebElement pswd = driver.findElement( By.cssSelector("input.inputtext._58mg._5dba._2ph-[name='reg_passwd__']"));
	pswd.sendKeys("1234567890");
	WebElement brthday = driver.findElement( By.cssSelector("select#day"));
	WebElement brthmon = driver.findElement( By.cssSelector("select#month"));
	WebElement brthyear = driver.findElement( By.cssSelector("select[title='Year']"));
	Select s = new Select(brthday);
	Select s1 = new Select(brthmon);
	Select s2 = new Select(brthyear);	
    s.selectByVisibleText("14");
    s1.selectByVisibleText("Dec");
    s2.selectByVisibleText("1986");
	WebElement gender = driver.findElement( By.cssSelector("input._8esa[value='2']"));
	gender.click();
	WebElement signup = driver.findElement(By.name("websubmit"));
	signup.click();
}

@After
public void close()
{
driver.close();	
}

}