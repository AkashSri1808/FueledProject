package stepDefinition;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;

public class LogOut extends BaseClass{
	/*
	 * public LogOut() { BaseClass.initialization();; }
	 */
	
	
	@When("^user click on Logout link$")
	public void user_click_on_Logout_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    String start=formatter.format(date);
	    long startTime = System.nanoTime();
		driver.findElement(By.xpath("//*[@class='moengage-logout']")).click();
	    driver.close();
	    System.out.println("Testing End at : "+formatter.format(date));
	    String end=formatter.format(date);
	    long endTime = System.nanoTime();
	    long timeElapsed = endTime - startTime;
	    System.out.println("Execution time in milliseconds : " + timeElapsed / 1000000);
	    System.out.println("Execution time in seconds : " + timeElapsed / 1000000000);
	}
}
