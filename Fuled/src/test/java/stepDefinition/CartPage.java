package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartPage extends BaseClass{
	
	
	@When("^user click on MyCart link$")
	public void user_click_on_MyCart_link() throws Throwable {
		driver.findElement(By.xpath("//*[@class='goto-link ']")).click();
	    Thread.sleep(2000);
	}

	@Then("^user navigates to Mycart page$")
	public void user_navigates_to_Mycart_page() throws Throwable {
	   System.out.println("Write code for verification");
	}

	@Then("^user remove all tshirts from cart$")
	public void user_remove_all_tshirts_from_cart() throws Throwable {
		for(int i=0;i<4;i++) {
	    	List <WebElement> RemoveAll=driver.findElements(By.xpath("//*[@class='remove']"));
	    	driver.findElement(By.xpath("//*[@class='remove']")).click();
	    	driver.navigate().refresh();
	    	Thread.sleep(2000);
	    	
	    	
	    }	 
	}
}
