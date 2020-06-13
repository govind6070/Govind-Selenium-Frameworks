package pkg4;

import java.util.Set;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowmanage {

public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Govind\\Desktop\\Chrome Driver\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();
Actions ac = new Actions(driver);

WebElement search = driver.findElementByXPath("//input[@name='search_query']");
search.click();
search.sendKeys("Khairiyat");
search.sendKeys(Keys.ENTER);

Thread.sleep(5000);

WebElement video= driver.findElementByXPath("//yt-formatted-string[text()='Full Song: KHAIRIYAT (BONUS TRACK) | CHHICHHORE | Sushant, Shraddha | Pritam, Amitabh B|Arijit Singh']");

ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
String currentwindow = driver.getWindowHandle();
Set<String> allwindow= driver.getWindowHandles();
int i=0;

for(String s:allwindow)
{
i=i+1;
if(i==1)
{	
driver.switchTo().window(s);
break;
}
}	

Thread.sleep(5000);

WebElement video1= driver.findElementByXPath("//yt-formatted-string[text()='Full Song: KHAIRIYAT (BONUS TRACK) | CHHICHHORE | Sushant, Shraddha | Pritam, Amitabh B|Arijit Singh']");
ac.contextClick(video1).perform();
Thread.sleep(2000);
ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();


}	
	
}
