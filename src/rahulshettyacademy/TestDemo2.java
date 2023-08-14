package rahulshettyacademy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo2 {

	@Test
	public void titleCheckGoogle() throws MalformedURLException {
		
		MutableCapabilities caps = new MutableCapabilities();
		
		//testcase
		WebDriver driver = new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"), caps);
		driver.get("https://google.com");
		Assert.assertTrue(driver.getTitle().matches("Google"));
		
		
		
	}
	
	
	
	
	
	
}