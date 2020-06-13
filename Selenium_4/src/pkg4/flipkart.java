package pkg4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Govind\\Desktop\\Chrome Driver\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();

WebElement close = driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']");
close.click();

Thread.sleep(2000);

WebElement electronics = driver.findElementByXPath("//span[text()='Electronics']");
electronics.click();
	
}	
	
}
