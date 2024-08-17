package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listofdd {
	
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://toolsqa.com/");
//	    driver.findElement(By.xpath("//input[@class='input_error form_input' and @id='user-name']")).sendKeys("standard_user");
//	    driver.findElement(By.xpath("//input[@class='input_error form_input' and @id='password']")).sendKeys("secret_sauce");
//	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    driver.findElement(By.xpath("//ul[@class='navbar__links d-none d-lg-flex']//li[2]")).click();
	    driver.findElement(By.xpath("//a[@href='#enroll-form' and @class='btn btn-primary-shadow btn-block']")).click();
	    
	    Thread.sleep(1000);
	    
	    //driver.findElement(By.xpath("//Select[@class='upcoming__registration--input' and @name='country']")).click();
	    
	    Select sc=new Select(driver.findElement(By.xpath("//Select[@class='upcoming__registration--input' and @name='country']")));
	    List<WebElement> OPTIONS=sc.getOptions();
	    System.out.println("all the options in the dd:"+ OPTIONS.size());
	    for(WebElement ele1:OPTIONS)
	    {
	    	System.out.println(ele1.getText());
	    }
	    
	    		
	}

}
