package TestRunner;

import java.time.Duration;

import test.ChromeDriver;

public class test2 {
	
	
	
	public static void main(String[] args)
	{

		ChromeDriver driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("flipkart.com");
	    driver.findElement(By.xpath("//div[@class='_1wE2Px']").click();
	    Actions act =new Actions(driver);
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Wired Headphones')]").click();
	    driver.findElement(By.xpath("//div[@class='slAVV4']//a[@class='wjcEIp' and@title='Microflash S7-Deep Bass, Clear Hi-Fi Sound, Headphones Wired Headset' ]").click();
	    
	    
	    
		
		
		
		
	}

}
