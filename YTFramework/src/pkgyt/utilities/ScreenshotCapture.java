package pkgyt.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapture {

public static void snapshot(ChromeDriver driver, String path) throws IOException, InterruptedException
{
File f = driver.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(f, new File(path));
Thread.sleep(2000);	

}
	
}
