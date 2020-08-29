package core;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import core.webdriverfactory.WebDriverFactory;
import org.junit.Assert;

public class Test_Base {
	protected WebDriver driver;
	protected final static String baseUrl = "https://amazon.in";
	
	private String getBrowserName() {
		String browserDefault = "chrome";
		String browserSentFromCmd = System.getProperty("browser");
		if (browserSentFromCmd == null) {
			return browserDefault;
		}
		else {
			return browserSentFromCmd;
		}
	}
	@Before
	public void setup() {
		String browser = getBrowserName();
		try {
			//driver = new ChromeDriver();
			driver = WebDriverFactory.getWebDriverForbrowser("browser");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Incorrect Browser Sent. Check the Stack Trace");
			
		}
		
			}
	
	@After
	public void cleanup() {
		driver.quit();
	}
}
