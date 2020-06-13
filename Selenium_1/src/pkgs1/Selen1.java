package pkgs1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class Selen1 {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "../Selenium_1/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();

driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
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

WebElement brthday = driver.findElement( By.cssSelector("select#day"));
brthday.sendKeys("14");

WebElement brthmon = driver.findElement( By.cssSelector("select#month"));
brthmon.sendKeys("Dec");

WebElement brthyear = driver.findElement( By.cssSelector("select[title='Year']"));
brthyear.sendKeys("1986");

WebElement gender = driver.findElement( By.cssSelector("input._8esa[value='2']"));
gender.click();

WebElement signup = driver.findElement(By.name("websubmit"));
signup.click();
}
}