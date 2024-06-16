package base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;

import constants.Contants;
import io.cucumber.core.options.Constants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import page_Objects.Login_PageObjects;

public class CommonFunctions {
	public static WebDriver driver;
	public static Properties pro ;
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger();
	
	@Before
	public void beforescenario() {
		try {
			log.info("Execution Started");
			launchBroswer();
			log.info(Contants.broswerinput+" "+"Browser Launched Successfully");
			pagefactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void launchBroswer() {
		try {
			load();
			switch (Contants.broswerinput) {
			case "Chrome":
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				break;
			case "Firefox":
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				break;
			default :
				System.out.println("Please provide broswer");
				break;
			}
		} catch (Exception e) {
			
		}
		
	
	
}
	public static Properties load() throws IOException {
		    String fileName = "config.properties"; // Replace "config.properties" with your actual filename
		    InputStream inputStream = CommonFunctions.class.getClassLoader().getResourceAsStream(fileName);
		    if (inputStream == null) {
		      throw new IOException("Failed to find config.properties file");
		    }
		    pro = new Properties();
		    pro.load(inputStream);
		    inputStream.close();
		    return pro;		
	}
	
	public static void pagefactory() {
		PageFactory.initElements(driver, Login_PageObjects.logindetails());
	}
@After
public void teardown() {
	driver.close();
	
}
}
