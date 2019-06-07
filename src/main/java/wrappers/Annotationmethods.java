package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.sun.javafx.PlatformUtil;

public class Annotationmethods {
	protected static WebDriver driver;
	public String sUrl;
	public Annotationmethods(){
		try {
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File("./config.properties")));
		sUrl = prop.getProperty("URL");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@BeforeTest
	public void beforeTest(){
		if (PlatformUtil.isMac()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
        }
        if (PlatformUtil.isWindows()) {
        	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        	Map<String, Object> prefs = new HashMap<String, Object>();
        	prefs.put("profile.default_content_setting_values.notifications", 2);
        	ChromeOptions options = new ChromeOptions();
        	options.setExperimentalOption("prefs", prefs);
        	 driver = new ChromeDriver(options);
        }
        if (PlatformUtil.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
        }
			}	
	@BeforeMethod
	public void beforeMethod(){
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(sUrl);
			}		
	
	@AfterTest
	public void afterTest(){
		driver.quit();
		}	
	@AfterMethod
	public void afterMethod(){
				
	}	
}
