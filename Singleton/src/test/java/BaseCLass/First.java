package BaseCLass;

import org.junit.*;

import org.openqa.selenium.WebDriver;

public class First {
	WebDriver driver;
	
	@Before
	public void Setup() {
		BaseClass instanceDriver=BaseClass.getInstance();
		driver=instanceDriver.openBrowser();
	}
	@Test
	public void testMethod() {
		driver.get("https://www.jabong.com/");
		System.out.println(driver.getTitle());
	}
	@After
	public void quit() {
		driver.quit();
	}
	
}
