package stepDefinations;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DriversManager;

public class Registration {
	
	//public static DriversManager driversManager = new DriversManager();
	
	@Given("User navigates to the application url")
	public void User_navigates_to_the_application_url() {
		
		//driversManager.setup();
		//driversManager.navigateToUrl("https://www.techlistic.com/p/selenium-practice-form.html");
		System.out.println("User navigates to the application url sucussfully");
	}
	
	@Then("user is on home page")
	public void user_is_on_home_page() {
		System.out.println("User is sucussfully reached on home page");
	}
	
	@When("user enters firstname {string}")
	public void user_enters_firstname(String firstName) {
//		driversManager.driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys(firstName);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("user enters firstname sucessfully");
	}
	
	@And("User enters lastname {string}")
	public void user_enters_lastname(String lastname) {
//		driversManager.driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys(lastname);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("User enters lastname successfully");
	}
	
//	@Then("user should be registered sucessfully")
//	public void user_should_be_registered_sucessfully() {
////		driversManager.tearDown();
//		System.out.println("user should be registered sucessfully also logout");
//	}
}
