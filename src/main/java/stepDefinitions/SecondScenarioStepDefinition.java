package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MyRunner.Hooks;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SecondScenarioStepDefinition {

	 WebDriver driver;
	
	
	 @Given("^user login$")
	 public void user_login(){
	       System.out.println(" user login page .........................");
	 }
	
	
	 @When("^title of the page$")
	 public void title_of_the_page(){
	
	   System.out.println("title of the page....................");
	 }
	
	 //Reg Exp:
	 //1. \"([^\"]*)\"
	 //2. \"(.*)\"
	
	
	
	 @Then("^enter credentials$")
	 public void enter_credentials() {
	 System.out.println("enter credentials ................ ");
	 }
	
	
	 @Then("^verifyAll Details$")
	 public void verifyAll_Details(){
	 
	 System.out.println("verifyAll Details..................");
	 
	 }
	

	
	
	

}
