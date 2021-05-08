package com.novFirst.stepDefinitions;

import java.io.FileOutputStream;
import java.io.PrintStream;

import com.novFirst.pages.NovemberFirstLoginPage;

import commonUtils.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @authorkumar -Step definition class for cucumber feature file
 *
 */
public class NovemberFirstLoginSteps {
	NovemberFirstLoginPage novemberFirstLoginPage;
	
	@Given("^Load the browser and Navigate to URL$")
	public void load_the_browser_and_Navigate_to_URL() throws Throwable {
		PrintStream logs = new PrintStream(new FileOutputStream("AllLogs.txt"));
		System.setOut(logs);
		BaseTest.initialization();
	}

	@When("^Click on country dropdown$")
	public void click_on_country_dropdown() throws Throwable {
		novemberFirstLoginPage= new NovemberFirstLoginPage();
		novemberFirstLoginPage.countryDropdown();
	}

	@When("^Verify  on Loginpage SignUp link is displaying$")
	public void verify_on_Loginpage_SignUp_link_is_displaying() throws Throwable {
		novemberFirstLoginPage.signUPLink();
	  
	}

	@When("^Verify  on Loginpage ForgotPassword link is displaying$")
	public void verify_on_Loginpage_ForgotPassword_link_is_displaying() throws Throwable {
		novemberFirstLoginPage.forgotpasswordLink();
	 }
	
	@When("^Click on signup link$")
	public void click_on_signup_link() throws Throwable {
	    novemberFirstLoginPage.clicksignUpLink();
	}

	@When("^Enter \"([^\"]*)\" and  \"([^\"]*)\"  and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and  \"([^\"]*)\" details$")
	public void enter_and_and_and_and_and_details(String cvr, String FirstName, String LastName,String Email,String ConfirmEmail,String PhoneNumber) throws Throwable {
	    novemberFirstLoginPage.enterallDetails(cvr, FirstName, LastName, Email, ConfirmEmail, PhoneNumber);
	}

	@When("^Click on checkbox & click on create acount$")
	public void click_on_checkbox_click_on_create_acount() throws Throwable {
		novemberFirstLoginPage.clickCheckboxCreateAcount();
		
	}

	@Then("^Validate you navigate to email confirm screen$")
	public void validate_you_navigate_to_email_confirm_screen() throws Throwable {
	    novemberFirstLoginPage.sucessfullPageMessageValidation();
	}
	
	@When("^Enter \"([^\"]*)\" and  \"([^\"]*)\"  and \"([^\"]*)\"  details$")
	public void enter_and_and_details(String CustomerNumber, String Email, String Password) throws Throwable {
	    novemberFirstLoginPage.enterallLoginDetails(CustomerNumber, Email, Password);
	}

	@When("^Verify checkbox is selected & clcik on LoginButton$")
	public void verify_checkbox_is_selected_clcik_on_LoginButton() throws Throwable {
	   novemberFirstLoginPage.loginButtonClick();
	}
	@Then("^Verify error message on the screen$")
	public void verify_error_message_on_the_screen() throws Throwable {
	    novemberFirstLoginPage.errorMessage();
	}

}
