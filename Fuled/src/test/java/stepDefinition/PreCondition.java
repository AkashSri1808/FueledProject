package stepDefinition;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;

public class PreCondition extends BaseClass{

	/*
	 * public PreCondition() { BaseClass.initialization(); }
	 */
	

@Given("^user navigate to Jabong page$")
	public void user_navigate_to_Jabong_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
    String start=formatter.format(date);
    long startTime = System.nanoTime();
    System.out.println("Start testing at : "+formatter.format(date));
    BaseClass.initialization();
    Thread.sleep(2000);
	}
}
