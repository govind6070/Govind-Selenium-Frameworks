package pkgyt.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public ChromeDriver driver;
	public ChromeOptions options;
	public Properties pr;
	
	@BeforeMethod
	public void Browserlaunch() throws IOException
	{
	options= new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Govind\\Desktop\\Chrome Driver\\chromedriver.exe");
	File f= new File("../YTFramework/ObjectsRepository.properties");
	FileInputStream fi = new FileInputStream(f);
	pr = new Properties();
	pr.load(fi);
	driver = new ChromeDriver(options);
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();	
	}	
	
	@AfterMethod
	public void Browserclose()
	{
	driver.close();
	}

}
