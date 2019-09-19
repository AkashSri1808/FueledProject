package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Login extends BaseClass {
	/*
	 * public Login() { BaseClass.initialization();; }
	 */
	@When("^user clicks on SignIn link$")
	public void user_clicks_on_SignIn_link() throws Throwable {
		driver.findElement(By.id("signin-model-wishlist")).click();
	    Thread.sleep(2000);
	}
	@When("^user enter username$")
	public void user_enter_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  driver.findElement(By.xpath("//*[@id='login-email']")).sendKeys("akashsrivastava.0101@gmail.com");
		    Thread.sleep(1000);
		  
	}

	@When("^user enter password$")
	public void user_enter_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id='login-pwd']")).sendKeys("akash1808");
	    Thread.sleep(1000);
	
	}
	@And("^click on Login button$")
	public void click_Login_button() throws Throwable{
		driver.findElement(By.id("btn-login")).click();
	    Thread.sleep(2000);
	}
	@Then("^Home page should display$")
	public void home_page_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("will write a code");
	}
}
