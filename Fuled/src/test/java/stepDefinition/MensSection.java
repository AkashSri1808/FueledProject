package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MensSection extends BaseClass{
	
	/*
	 * public MensSection() { BaseClass.initialization();; }
	 */
	
	@Then("^user click on Polos and tees$")
	public void user_click_on_Polos_and_tees() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//*[@id='main']/section/article/div[1]/a/figure/img")).click();
		    Thread.sleep(2000);
	}

	@Then("^user select tshirt of M size$")
	public void user_select_tshirt_of_M_size() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		for(int i=1;i<5;i++) {System.out.println("Select tshirts");
    
		/*
		 * String polos="//*[@id=\"catalog-product\"]/section[2]/div["+i+"]"; WebElement
		 * PolosTees=driver.findElement(By.xpath(polos));
		 */
    	String polos="//*[@id='catalog-product']/section[2]/div["+i+"]";
    	driver.findElement(By.xpath(polos)).click();
    	Thread.sleep(1000);
    	List <WebElement> TshirtSize=driver.findElements(By.xpath("//*[@id='size-block']/div[2]/ul/li[2]/button"));
    	if(TshirtSize.size() >0) {
    		driver.findElement(By.xpath("//*[@id='size-block']/div[2]/ul/li[2]/button")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//button[@class='btn btn-payment add-to-cart']")).click();
    		Thread.sleep(1000);
    		driver.navigate().back();
    		Thread.sleep(1000);
    	}
    	else {
    		driver.navigate().back();
    		Thread.sleep(1000);
    	}
    
	}
	
}
}
