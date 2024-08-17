package Stepdefenation;

import io.cucumber.java.en.When;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;




public class Background {
	static WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.saucedemo.com/");
	    //throw new io.cucumber.java.PendingException();
	}
	
	@When("User enters valid <username> and <password>")
	public void user_enters_valid_username_and_password() {
		driver.findElement(By.xpath("//input[@class='input_error form_input'  and @id='user-name']")).clear();
	    driver.findElement(By.xpath("//input[@class='input_error form_input'  and @id='user-name']")).sendKeys("standard_user");
	    driver.findElement(By.xpath("//input[@class='input_error form_input'  and @id='password']")).clear();
	    driver.findElement(By.xpath("//input[@class='input_error form_input'  and @id='password']")).sendKeys("secret_sauce");
	    
	}

	
//	@When("User enters valid username and password")
//	public void user_enters_valid_username_and_password() {
//	    driver.findElement(By.xpath("//input[@class='input_error form_input'  and @id='user-name']")).clear();
//	    driver.findElement(By.xpath("//input[@class='input_error form_input'  and @id='user-name']")).sendKeys("standard_user");
//	    driver.findElement(By.xpath("//input[@class='input_error form_input'  and @id='password']")).clear();
//	    driver.findElement(By.xpath("//input[@class='input_error form_input'  and @id='password']")).sendKeys("secret_sauce");
//	    
//	}

	@And("Clicks on login Button")
	public void clicks_on_login_button() {
	    driver.findElement(By.xpath("//input[@type='submit' and @class='submit-button btn_action']")).click();
	}

	@Then("User is navigate to Home page")
	public void user_is_navigate_to_home_page() {
	   driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ' and @id='add-to-cart-sauce-labs-backpack']")).click();
	   
	}

	@And("Close the browser")
	public void close_the_browser() {
	    driver.close();
	}




}
