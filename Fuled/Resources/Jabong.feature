Feature: Automate Jabong End 2 End
Description: Fueled Interview Question

Scenario:Automate end to end scenario given by Fueled
	When user navigate to Jabong page
	When user clicks on SignIn link
	When user enter username
	When user enter password
	And click on Login button
	Then Home page should display
	When user click on Mens section
	Then user navigates to Mens section
	Then user click on Polos and tees
	Then user select tshirt of M size
	When user click on MyCart link
	Then user navigates to Mycart page
	Then user remove all tshirts from cart
	When user click on Logout link