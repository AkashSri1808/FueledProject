package BaseCLass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
	private static BaseClass instanceDriver=null;
	private WebDriver driver;
	
	private BaseClass() {
		
	}
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Akash\\chrome\\chromedriver.exe");
	    ChromeOptions opt=new ChromeOptions();
	    opt.addArguments("--disable-notifications");
	    driver=new ChromeDriver(opt);
	    driver.manage().window().maximize();
		return driver;	
	}
	public static BaseClass getInstance() {
		if(instanceDriver==null)
			instanceDriver= new BaseClass();
		return instanceDriver;
	}
}
