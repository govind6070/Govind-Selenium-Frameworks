package pkg4;


import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;


public class Actiondrop
{

public static void main(String[] args) throws InterruptedException

{

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Govind\\Desktop\\Chrome Driver\\chromedriver.exe");

ChromeDriver driver = new ChromeDriver();

driver.get("https://www.makemytrip.com/");

driver.manage().window().maximize();

WebElement fromcity = driver.findElement(By.id("fromCity"));

Thread.sleep(2000);

fromcity.click();

Actions ac = new Actions(driver);

//ac.sendKeys(fromcity, "PUNE").perform();

for (int i = 1; i <= 5 ; i++)

{

ac.sendKeys(Keys.ARROW_DOWN).perform();

//Thread.sleep(2000);

}

ac.sendKeys(Keys.ENTER).perform();

WebElement tocity = driver.findElement(By.xpath("//input[@placeholder='To']"));

Actions ac2 = new Actions(driver);

for (int j = 1; j <= 3; j++)
{
System.out.println("j");
ac2.sendKeys(Keys.ARROW_DOWN).perform();
Thread.sleep(2000);
}

ac2.sendKeys(Keys.ENTER).perform();

Thread.sleep(2000);

}
}