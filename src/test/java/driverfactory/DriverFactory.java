package driverfactory;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.LoggerLoad;

public class DriverFactory {
	
	 public	static WebDriver driver;
		public static WebDriver initializeDrivers(String browser){
			ChromeOptions chromeoptions = new ChromeOptions();
			chromeoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			chromeoptions.setAcceptInsecureCerts(true);
			chromeoptions.setScriptTimeout(Duration.ofSeconds(30));
			chromeoptions.setPageLoadTimeout(Duration.ofMillis(30000));
			chromeoptions.setImplicitWaitTimeout(Duration.ofSeconds(20));
			chromeoptions.addArguments("--remote-allow-origins=*");
		
	
		if (browser.equalsIgnoreCase("chrome")) {
			
			LoggerLoad.info("Testing on Chrome");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chromeoptions);

		}
		else if (browser.equalsIgnoreCase("firefox")) {
			LoggerLoad.info("Testing on firefox");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		//else if (browser.equalsIgnoreCase("safari")) {
			//LoggerLoad.info("Testing on Edge");
			//WebDriverManager.safaridriver().setup();
			//driver = new SafariDriver();

		//}
		else if (browser.equalsIgnoreCase("edge")) {
			LoggerLoad.info("Testing on Edge");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		
		//Set Page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));

		driver.manage().window().maximize();
		
		return driver;
	}
		
		
	
		public static WebDriver getdriver() {
			if (driver==null) {
				driver = new ChromeDriver();
				
				return driver;
			}
			else {
				
				return driver;
			}
		}	
		
	
					
	public void closeallDriver() {
		driver.close();	
	}

}
