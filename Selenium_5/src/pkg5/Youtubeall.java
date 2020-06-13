package pkg5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Youtubeall {
	
public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Govind\\Desktop\\Chrome Driver\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();

List<WebElement> all= driver.findElements(By.id("video-title"));
System.out.println("Total videos are "+all.size());

Actions ac = new Actions(driver);
for(WebElement e:all)
{	
e.click();
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
}

}	

}
