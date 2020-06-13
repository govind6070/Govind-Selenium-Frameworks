package pkg2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbdropdown {
public void dropdown(String visibletext,WebElement element)
{
Select s = new Select(element);	
s.selectByVisibleText(visibletext);
}
public void dropdown(WebElement element,String value)
{
Select s = new Select(element);	
s.selectByValue(value);
}
public void dropdown(int index,WebElement element)
{
Select s = new Select(element);	
s.selectByIndex(index);
}
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Govind\\Desktop\\Chrome Driver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();	
WebElement Firstnm= driver.findElement( By.cssSelector("input#u_0_m"));
Firstnm.sendKeys("Govind");
WebElement Surname = driver.findElement( By.cssSelector("input[id='u_0_o']"));
Surname.sendKeys("Verma");
WebElement mobile = driver.findElement( By.cssSelector("input#u_0_r"));
mobile.sendKeys("1234567890");
WebElement pswd = driver.findElement( By.cssSelector("input.inputtext._58mg._5dba._2ph-[name='reg_passwd__']"));
pswd.sendKeys("1234567890");
fbdropdown ob = new fbdropdown();
WebElement drop1 = driver.findElement( By.cssSelector("select#day"));
WebElement drop2 = driver.findElement( By.cssSelector("select#month"));
WebElement drop3 = driver.findElement( By.cssSelector("select[title='Year']"));
ob.dropdown(14,drop1);
ob.dropdown(drop2,"12");
ob.dropdown("1986", drop3);
WebElement gender = driver.findElement( By.cssSelector("input._8esa[value='2']"));
gender.click();
WebElement signup = driver.findElement(By.name("websubmit"));
signup.click();
}
}