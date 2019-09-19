package Repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginRepo {

	@FindBy(id="signin-model-wishlist") WebElement LoginLink;
	@FindBy(id="login-email") WebElement Username;
	@FindBy(id="login-pwd") WebElement Password;
	
	
}
