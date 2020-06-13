package pkgyt.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlay {
	
ChromeDriver driver;	
Properties pr;

public VideoPlay(ChromeDriver driver, Properties pr)
{
this.driver = driver;
this.pr = pr;
}

public void searchvideotitleandplay(String videotitle ) throws InterruptedException
{
List <WebElement> all= driver.findElements(By.id(pr.getProperty("allvideos")));
  
for(int i=0; i< all.size(); i++) 
     {
      String s = all.get(i).getText();
      System.out.println(s);
      if(s.contains(videotitle))
      {
       all.get(i).click();
       break;
      }

     }
Thread.sleep(6000);	
}

public void playspecificnumbervideo(int n) throws InterruptedException
{
	 List <WebElement> all= driver.findElements(By.id(pr.getProperty("allvideos")));
	    all.get(n-1).click();
	    Thread.sleep(6000);	
}

}
