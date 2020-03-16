package flipbooking;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class bookingtest {
	
	@Given("^user able to login with username$")
	public void user_able_to_login_with_username()
	{
		System.out.println("Username");
		
	}
	
	@When("^user able to login with Password$")
	public void user_able_to_login_with_Password()
	{
		System.out.println("pwd");
		
	}
	
	@Then("^user able to login into application$")
	public void user_able_to_login_into_application()
	{
		System.out.println("login into application");
		
	}

}
