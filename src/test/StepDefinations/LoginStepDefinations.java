package StepDefinations;

import org.testng.Assert;
import com.montran.pages.Loginpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinations {
	
	Loginpage Page;
	
	@Given("^User is on login screen$")
	public void TakeUserOnLoginScreen()
	{
		Page=new Loginpage("CHROME");
		
	}
	
	@When("^User enters \"([^\"]*)\" in UserName field$")
	public void EnterUserName(String UserName)
	{
		Page.EnterUserName(UserName);
	}
	
	@When("^User enters \"([^\"]*)\" in Password field$")
	public void EnterPassword(String Password)
	{
		Page.EnterPassword(Password);
	}
	
	@When("^User clicks on SignIn button$")
	public void ClickSignInButton()
	{
		Page.ClickSignInBtn();
	}
	
	@Then("^User should be successfully logged in$")
	public void SuccessfullLoginConfirmation()
	{
		String PAGEURL=Page.GetCurrentPageURL();
		Assert.assertEquals(PAGEURL, "https://opensource-demo.orangehrmlive.com/index.php/dashboard","Login functionality not working with Valid Credentials");
	}
	


}

	
	