package stepdefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverfactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utilities.Helper;
import utilities.LoggerLoad;

public class Hooks {
	
	public static WebDriver driver;
	private static DriverFactory driverFactory;
	private static Properties properties;
	private final static String propertyFilePath = "./src/test/resources/config.properties";
	static Scenario scenario;
	


		@SuppressWarnings("static-access")
		@BeforeAll
	    public static void setUp() throws IOException{
	     
		//Get Browser from configuration file
			LoggerLoad.info("Loading Configuration File");
			FileInputStream stream = new FileInputStream (propertyFilePath);
			properties = new Properties();
			properties.load(stream);
			stream.close();
			
			String browser = properties.getProperty("browser");
			LoggerLoad.info("Get property BrowserType");
			
			//Initialize driver from driver factory
			driverFactory = new DriverFactory();
			driver = driverFactory.initializeDrivers(browser);
			LoggerLoad.info("Initializing driver for : "+browser);
			
			
			
	     //Helper.setUpDriver();
	    }
		
		@Before
			public void scenario(Scenario scenario) {
				LoggerLoad.info("===============================================================================================");
				LoggerLoad.info(scenario.getSourceTagNames() +" : "+scenario.getName());
				LoggerLoad.info("-----------------------------------------------------------------------------------------------");
			
			}
		
		 @After
	    	public static void tearDown(Scenario scenario) {
	 
	    		if(scenario.isFailed()) {
	    			final byte[] screenshot = ((TakesScreenshot) Helper.getDriver()).getScreenshotAs(OutputType.BYTES);
	    			scenario.attach(screenshot, "image/png", scenario.getName()); 
	    		}  		        
	    }
	        
	    @AfterStep
	    	public void afterstep(Scenario scenario) {
	    		if (scenario.isFailed()) {
	    			LoggerLoad.error("Steps Failed , Taking Screenshot");
	    			final byte[] screenshot = ((TakesScreenshot) Helper.getDriver()).getScreenshotAs(OutputType.BYTES);
	    			scenario.attach(screenshot, "image/png", scenario.getName()); 
	    			Allure.addAttachment("Myscreenshot",
	    					new String(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
	    		
	    		}
	    	}
	    @AfterAll
	    	public static void after() {
	    		LoggerLoad.info("Closing Driver");
	    		Helper.tearDown();
	    	}
	         
}
