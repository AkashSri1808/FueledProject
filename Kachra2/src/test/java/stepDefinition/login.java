package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	public static WebDriver driver;
	@When("^user navigate to Jabong page$")
	public void user_navigate_to_Jabong_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Akash\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.jabong.com/");
	}

	@When("^user clicks on SignIn link$")
	public void user_clicks_on_SignIn_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id(""));
	}

	@When("^user enter username$")
	public void user_enter_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user enter password$")
	public void user_enter_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^click on Login button$")
	public void click_on_Login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Home page should display$")
	public void home_page_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user click on Mens section$")
	public void user_click_on_Mens_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^user navigates to Mens section$")
	public void user_navigates_to_Mens_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user click on Polos and tees$")
	public void user_click_on_Polos_and_tees() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user select tshirt of M size$")
	public void user_select_tshirt_of_M_size() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user click on MyCart link$")
	public void user_click_on_MyCart_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user navigates to Mycart page$")
	public void user_navigates_to_Mycart_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user remove all tshirts from cart$")
	public void user_remove_all_tshirts_from_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user click on Logout link$")
	public void user_click_on_Logout_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
