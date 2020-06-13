package pkg4;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class google {
public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Govind\\Desktop\\Chrome Driver\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();

WebElement srch = driver.findElementByXPath("//input[@class='gLFyf gsfi']");
srch.click();

Actions a = new Actions(driver);
srch.sendKeys("a");
Thread.sleep(2000);

for (int i=0; i<3; i++)
{
a.sendKeys(Keys.ARROW_DOWN);
Thread.sleep(2000);
}	
//a.sendKeys(Keys.ENTER);

}
}
