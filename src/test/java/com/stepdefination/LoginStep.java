package com.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {
	WebDriver driver=null;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Step1:user is on login page");
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	}

	@When("user enter the username and password")
	public void user_enter_the_username_and_password() {
		System.out.println("Step2:user enter username and password");
		WebElement email=driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("vinayit49@gmail.com");
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.clear();
		pass.sendKeys("8500736074");
	    
	}

	@And("user click the login button")
	public void user_click_the_login_button() {
		System.out.println("Step3:user click on login button");
		
		driver.findElement(By.name("login")).click();
	    
	}

	@Then("user getting error message")
	public void user_getting_error_message() {
		
		System.out.println("Step4:user is on  getting error msg");
		
		driver.close();
	    
	}




}
