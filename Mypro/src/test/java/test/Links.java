package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	
	public static void main(String[] args) throws InterruptedException
	{       WebDriver driver
		    ChromeDriver driver= new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get("https://www.saucedemo.com/");
		    driver.findElement(By.xpath("//input[@class='input_error form_input' and @id='user-name']")).sendKeys("standard_user");
		    driver.findElement(By.xpath("//input[@class='input_error form_input' and @id='password']")).sendKeys("secret_sauce");
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
		    Thread.sleep(1000);
		    List<WebElement> links =driver.findElements(By.tagName("a"));
		    
		    System.out.println(links.size());
		    
		    for(WebElement LINK:links)
		    {
		    	String LINKtext=LINK.getText();
		    	String LINKattribute=LINK.getAttribute("href");
		    	System.out.println(LINKtext+"-"+LINKattribute);
		    }
	}

}
