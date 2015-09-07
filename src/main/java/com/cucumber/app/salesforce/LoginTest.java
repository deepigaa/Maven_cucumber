package com.cucumber.app.salesforce;



import org.junit.Assert;

import com.cucumber.app.salesforce.util.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginTest {
	
	WebConnector selenium = new WebConnector();
	@Given("^I go to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_goto_Salesforce(String url,String browser){
		System.out.println("I am going to "+url+" on "+browser);
		selenium.openBrowser(browser);
		selenium.navigate(url);
	}
	
	@And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void I_enter(String object,String text){
		System.out.println("Entering "+object+ " as "+text);
		selenium.type(object, text);
	}
	
	@And("^I click on \"([^\"]*)\"$")
	public void I_click(String object){
		System.out.println("I am clicking on "+object);
		selenium.click(object);
	}
	
	@Then("^login should be \"([^\"]*)\"$")
	public void login_should_be(String expectedResult){
		
		String actualResult=null;
		boolean result = selenium.isElementPresent("searchText");
		if(result){
			actualResult = "success";
		}else{
			actualResult = "failure";
		}
		Assert.assertEquals(expectedResult, actualResult);
		System.out.println("login- "+expectedResult);
	}

}
