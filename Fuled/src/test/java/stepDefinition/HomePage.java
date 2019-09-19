package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage extends BaseClass{
	/*
	 * public HomePage() { BaseClass.initialization(); }
	 */
	
	@When("^user click on Mens section$")
	public void user_click_on_Mens_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id='main']/section/article/div[2]/a/figure/img")).click();
	    Thread.sleep(1000);
	}

	@Then("^user navigates to Mens section$")
	public void user_navigates_to_Mens_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("will write code for verifivation");
	}
}
