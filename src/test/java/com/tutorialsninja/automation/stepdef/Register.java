package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register {
	
	@Given("^I lauch the application$")
	public void i_lauch_the_application() {
		
	    Base.driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	    
	}

	@And("^I navigate to Refgister page$")
	public void i_navigate_to_Refgister_page()  {
	    
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable dataTable)  {
	    
	}

	@And("^i Select the privacy policy$")
	public void i_Select_the_privacy_policy() {
	    
	}

	@And("^I Click on continue button$")
	public void i_Click_on_continue_button(){
	   
	}

	@Then("^I should see does the use account has been created successfully$")
	public void i_should_see_does_the_use_account_has_been_created_successfully() throws Throwable {
	   
	}

}
