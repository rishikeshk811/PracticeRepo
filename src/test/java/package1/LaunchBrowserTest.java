package package1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LaunchBrowserTest {

	@Test
	public void launch() throws MalformedURLException {
	
		
		
	     
		
		
		URL url=new URL("http://192.168.43.238:4444/wd/hub");
	         
	         
	         
	         DesiredCapabilities cap =new DesiredCapabilities();
	         cap.setBrowserName("chrome");
	         cap.setPlatform(Platform.WINDOWS);
	         RemoteWebDriver driver=new RemoteWebDriver(url,cap);
	         driver.get("https://www.amazon.in");
	         
	}
}
