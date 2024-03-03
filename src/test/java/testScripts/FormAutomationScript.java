package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.DriversManager;

public class FormAutomationScript {
	
	DriversManager driversManager;
	
	@Test
	public void btestOne() {
		driversManager = new DriversManager();
		driversManager.setup();
		driversManager.navigateToUrl("https://www.techlistic.com/p/selenium-practice-form.html");
		driversManager.driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Rishi");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driversManager.tearDown();
	}
	
	@Test()
	public void atestTwo() {
		driversManager = new DriversManager();
		driversManager.setup();
		driversManager.navigateToUrl("https://www.techlistic.com/p/selenium-practice-form.html");
		driversManager.driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Kumar");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driversManager.tearDown();
	}
	
	
	@Test
	public void testThree() {
		driversManager = new DriversManager();
		driversManager.setup();
		driversManager.navigateToUrl("https://www.techlistic.com/p/selenium-practice-form.html");
		WebElement element = driversManager.driver.findElement(By.xpath("//input[@id='datepicker']"));
		((JavascriptExecutor) driversManager.driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.sendKeys("test");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		driversManager.tearDown();
	}
	

}
