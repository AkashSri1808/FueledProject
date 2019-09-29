package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
	
	public static WebDriver driver;
	public static void initialization() {
		
	    System.setProperty("webdriver.chrome.driver","C:\\Akash\\chrome\\chromedriver.exe");
	    ChromeOptions opt=new ChromeOptions();
	    opt.addArguments("--disable-notifications");
	    driver=new ChromeDriver(opt);
	    driver.manage().window().maximize();
	    driver.get("https://www.jabong.com/");
	}
		
	}
	
	



