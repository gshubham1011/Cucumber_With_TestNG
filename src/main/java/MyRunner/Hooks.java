package MyRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	

	@BeforeTest
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    }	
	
	@AfterTest
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
}
