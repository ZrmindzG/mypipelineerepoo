package com.mystore.actiondriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.rules.Timeout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mystore.base.Baseclass;

import actioninterface.ActionInterface;

public class ActionClass extends Baseclass implements ActionInterface {

	public static void scrollbyvisibilityofElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoview();", ele);

	}

	public void click(WebDriver driver, WebElement locator) {
		Actions act = new Actions(driver);
		act.moveToElement(locator).click().build().perform();

	}

	
	@SuppressWarnings("deprecation")
	public void implicitWait(WebDriver driver, int timeOut) 
	{
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public static void Explicitwait(WebDriver driver,Duration timeout,WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	@SuppressWarnings("deprecation")
	public static void pageloadtime(WebDriver driver, int timeout)
	{
		driver.manage().timeouts().pageLoadTimeout(timeout,TimeUnit.SECONDS); 
	}

	public static void login(WebDriver driver, WebElement click) {
		Actions act = new Actions(driver);
		act.click().build().perform();
	}
	
	public  boolean isDisplayed(WebDriver driver, WebElement ele) {
		boolean flag = false;
		// flag = findElement(driver, ele);
		flag = ele.isDisplayed();
		if (flag) {
			System.out.println("the element is displayed");
		} else {
			System.out.println("the element is not displayed");
		}

		return flag;

	}

	public boolean isSelected(WebDriver driver, WebElement ele) {
		boolean flag = false;
		// flag = findElement(driver, ele);
		flag = ele.isSelected();

		if (flag) {
			System.out.println("WebElement is selected");
		} else {
			System.out.println("WebElement is not selected");
		}

		return flag;

	}

	public static boolean Isenabled(WebDriver driver, WebElement ele) {
		boolean flag = false;
		// flag = FindElement(driver,ele);
		flag = ele.isEnabled();
		if (flag) {
			System.out.println("WebElement is enabeled");
		} else {
			System.out.println("WebElement is not enabeled");
		}
		return flag;
	}

	public static boolean SelectBySendkeys(String value, WebElement ele) {
		boolean flag = false;
		try {
			ele.sendKeys(value);
			flag = true;
			return true;
		} catch (Exception e) {
			e.fillInStackTrace();

			return false;
		} finally {
			if (flag) {
				System.out.println("select value by sendkeys only");
			} else {
				System.out.println("value is not selected by sendkeys");
			}

		}
	}

	public static boolean SelectByIndex(WebElement ele, int index) {
		Boolean flag = false;
		try {
			Select sc = new Select(ele);
			sc.selectByIndex(index);
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("select by index is false");
			return false;
		} finally {
			if (flag) {
				System.out.println("select by index is true");
			} else {
				System.out.println("select by index is false");
			}

		}

	}

	public static boolean SelectByValue(WebElement ele, String value) {
		boolean flag = false;
		try {
			Select sc1 = new Select(ele);
			sc1.selectByValue(value);
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("select is not happen by selectbyvalemethod");

		} finally {
			if (flag) {
				System.out.println("select is done by selectbyvalemethod");
			} else {
				System.out.println("select is not happen by selectbyvalemethod");
			}
		}
		return flag;
	}

	public static boolean SelectByVisibletext(String visibletxt, WebElement ele) {
		boolean flag = false;
		try {
			Select sc2 = new Select(ele);
			sc2.selectByVisibleText(visibletxt);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;

		} finally {
			if (flag) {
				System.out.println("select value by visibletext");
			} else {
				System.out.println("value is not selected by visibletext");
			}
		}

	}

	public static boolean jsclick(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ele);
			flag = true;
			return true;
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
		} finally {
			if (flag) {
				System.out.println("jsclick using javascriptexecutor");

			} else {
				System.out.println("jsclick is not using javascriptexecutor");

			}
		}
		return flag;
	}

	public static boolean switchToframeid(WebDriver driver, String idvalue) {
		boolean flag = false;
		try {
			driver.switchTo().frame(idvalue);
			flag = true;
			return true;
		} catch (Exception e) {
			e.fillInStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println("driver switch to frame");
			} else {
				System.out.println("driver not switch to frame");
			}

		}
	}

	public static boolean switchframeByframe(WebDriver driver, String namevalue) {
		boolean flag = false;
		try {
			driver.switchTo().frame(namevalue);
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("switch to the framework");
			return false;

		} finally {
			if (flag) {
				System.out.println("switch to the framework using framename");
			} else {
				System.out.println("switch is not possible using framename");
			}
		}
	}

	public static boolean Switchtodefaultframe(WebDriver driver) {
		boolean flag = false;
		try {
			driver.switchTo().defaultContent();
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Switch to default frame");
			} else {
				System.out.println("Frame is not switch to default");
			}
		}
		return flag;

	}

	public void mouseOverElement(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			Actions act = new Actions(driver);
			act.moveToElement(ele).build().perform();
			flag = true;
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			if (flag) {
				System.out.println("mouseOverElememt is successfully");
			} else {
				System.out.println("mouseOverElememt is   not successfull");
			}
		}
	}

	public boolean movetoElement(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoview(true)", ele);
			Actions act = new Actions(driver);
			act.moveToElement(ele).build().perform();
			flag = true;
			return true;
		} catch (Exception e) {
			e.getStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println("Movetoelement is successful");
			} else {
				System.out.println("Movetoelement is not successful");
			}
		}

	}

	public boolean mouseover(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			Actions act = new Actions(driver);
			act.moveToElement(ele).build().perform();
			flag = true;
			return true;

		} catch (Exception e) {
			e.getStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println("mouseover the element using this method");

			} else {
				System.out.println("mouseover is failed using this method");
			}

		}
	}

	public boolean draggable(WebDriver driver, WebElement ele, int x, int y) {
		boolean flag = false;
		try {
			Actions act = new Actions(driver);
			act.dragAndDropBy(ele, x, y);
			flag = true;
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			flag = false;

		} finally {
			if (flag) {
				System.out.println("user can able to dragg the element");
			} else {
				System.out.println("user can unable to dragg the element");
			}
		}
		return flag;
	}

	public static boolean droppable(WebDriver driver, WebElement source,WebElement target)

	{
        boolean flag = false;
        try {
        	Actions act=new Actions(driver);
        	act.dragAndDrop(source, target);
        	flag =true;
        	return true;
        }
        catch(Exception e) {
        	e.getStackTrace();
        	flag=false;
        }
        finally {
        	if(flag) {
        		System.out.println("User can able to droappable using method");
        	}
        	else {
        		System.out.println("User unable to droappable using method");
        	}
        }
		return flag;
	}
	public boolean slider(WebDriver driver,WebElement ele, int x,int y)
	{
		boolean flag=false;
		try
		{
			Actions act=new Actions(driver);
			act.dragAndDropBy(ele, x, y);
			flag=true;
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		finally {
			if (flag)
			{
				System.out.println("Slider action is performed");
				
			}
			else {
				System.out.println("Slider action is not performed");
			}
			
		}
	}
	public static boolean rightclik(WebDriver driver,WebElement ele)
	{
		boolean flag= false;
		try {
			Actions act=new Actions(driver);
			act.contextClick(ele);
			flag=true;
			return true;
		}
		catch(Exception e)
		{
			e.getStackTrace();
			return false;
		}
		finally {
			if(flag) {
				System.out.println("rightclick action is performed");
			}
			else
			{
				System.out.println("rightclick action is unable to performed");
				
			}
		}
	}



        	
	public static boolean switchwindowBytitle(WebDriver driver,int count,String windowTitle)
	{
		boolean flag=false;
		try
		{
			Set<String> windows =driver.getWindowHandles();
			
			String[] array=windows.toArray(new String[0]);
			
			driver.switchTo().window(array[count-1]);
			
			if(driver.getTitle().contains(windowTitle))
			{
				flag=true;
				
			}
			else
			{
				
				flag=false;
			}
		}
			catch(Exception e)
			{			
				e.getStackTrace();
				flag=false;
				return false;
				
			}
		finally {
			if(flag) {
				System.out.println("switchwindowhandle by title is performed");
			}
			else
			{
				System.out.println("switchwindowhandle by title is performed not successful");	
			}
		}
		return flag;
	}

		public static boolean switchtonewwindow(WebDriver driver)
		{
		boolean flag=false;
		try
		{
			Set<String>windows=driver.getWindowHandles();
			Object popup[]=windows.toArray();
			driver.switchTo().window(popup[1].toString());
			flag=true;
			return true;
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
			return false;
		}
	    finally {
	    	if(flag)
	    	{
	    		System.out.println("Switch to new window function is performed");
	    	}
	    	else
	    	{
	    		System.out.println("Switch to new window function is unable to performed");
	    	}
	    }
	}
	
	public static boolean switcholdwindow(WebDriver driver)
	{
		boolean flag=false;
		try {
			Set<String> gw=driver.getWindowHandles();
			Object popup[]=gw.toArray();
			driver.switchTo().window(popup[0].toString());
			flag =true;
		
			}
		catch(Exception e)
		{
			e.getStackTrace();
			flag=false;
			return false;
		}
		finally {
			if(flag)
			{
				System.out.println("navigated to the old window");
			}
			else
			{
				System.out.println("navigated to the old window not successful");
			}
		}
		return flag;
	}
        	
        public static void columncount(WebElement row)
        {
        	
        	try {
        		List<WebElement> columns=row.findElements(By.tagName("td"));
        		int a=columns.size();
        		System.out.println(columns.size());
        		for(WebElement column:columns)
        		{
        			System.out.println(column.getText());
        			System.out.println("|");
        			
        		}
        	}
        		catch(Exception e)
        		{
        			e.getStackTrace();
        			
        		}
        	
        }
        

        public static int rowcount(WebElement table)
        {
           List<WebElement> rowcnt=table.findElements(By.tagName("tr"));
           int b=rowcnt.size()-1;
           System.out.println(rowcnt.size()-1);
           return b;
        }
        
          public static boolean alert(WebDriver driver) {
        	  boolean flag=false;
        	  try
        	  {
        		 Alert al= driver.switchTo().alert();
        		 al.accept();
        		 flag=true;
        	  }
        	  catch(Exception e)
        	  {
        		  e.getStackTrace();
        		  flag=false;
        	  }
        	  finally {
        		  if(flag)
        		  {
        			  System.out.println("alert function is successfuly used");
        		  }
        		  else
        		  {
        			  System.out.println("alert function is not successfully used");
        		  }
        		  }
			return flag;
        	  }
          public static boolean lunchURl(WebDriver driver,String URL)
          {
        	  boolean flag=false;
        	  
        	  try {
        		  driver.navigate().to(URL);
        		  flag =true;
        		  return true;
        	  }
        	  catch(Exception e)
        	  {
        		  e.getStackTrace();
        		  flag =false;
        	  }
        	  finally
        	  {
        		  if(flag)
        		  {
        			  System.out.println("navigateurl function is successful");
        		  }
        		  else
        		  {
        			  System.out.println("navigateurl function is not successful");
        		  }
        	  }
			return flag;
          }
        	  
          
          
	   public static boolean Isalertpresent(WebDriver driver)
	   {
		   boolean flag=false;
		   
		   try
		   {
			   driver.switchTo().alert();
			   return true;
		   }
		   catch(Exception e)
		   {
			   e.getStackTrace();
			   return false;
		   }
	   }
	   
	   public String getTitle(WebDriver driver)
	   {
		   Boolean flag=false;
		   try {
			  String text=driver.getTitle();
			  return text;
			  
		   }
		   catch(Exception e)
		   {
			   e.getStackTrace();
			   
		   }
		return null;
	   }
	   	public String getCurrentUrl(WebDriver driver)
		{
			boolean flag=false;
			
			String Curl=driver.getCurrentUrl();
			
			if(flag)
			{
				System.out.println("getcurrenturl function implementation is successful");
			}
			return Curl;
		}
		public static boolean locator(WebElement locator,String locatorname)
		{
			boolean flag= false;
			
			try {
				locator.click();
				flag= true;
				return true;
			}
			catch(Exception e)
			{
				e.getStackTrace();
				return false;
			}
			finally {
				if(flag)
				{
					System.out.println("locator function is successfully implemented");
				}
				else {
					System.out.println("locator function is not successfully implemented");
			}
			
			}
		}
		
			public static String screenshot(WebDriver driver, String filename)
			{
				String datename=new SimpleDateFormat("yyyyMMddhhmm").format(new Date());
				
				TakesScreenshot tk = (TakesScreenshot) driver;
				
				File scr=tk.getScreenshotAs(OutputType.FILE);
				
				String destination=System.getProperty("usr.dir")+"Screenshot\\"+filename+"_"+datename+".png";
				
				try {
					FileUtils.copyFile(scr, new File(destination));
				} catch (Exception e) {
					e.getMessage();
				}
				// This new path for jenkins
				String newImageString = "http://localhost:8082/job/MyStoreProject/ws/MyStoreProject/ScreenShots/" + filename + "_"
						+ datename + ".png";
				return newImageString;
			}
			
			public boolean type(WebElement ele,String str)
			{
				boolean flag=false;
				try {
					flag=ele.isDisplayed();
					ele.clear();
					ele.sendKeys(str);
					flag = true;
				}
				catch(Exception e)
				{
				System.out.println("location not found");
				flag=false;
				}
				finally {
					if(flag)
					{
						System.out.println("Successfuly enter value");
					}
					else {
						System.out.println("Unable to enter value");
					}
				}
				return flag;
			}

			@Override
			public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean findElement(WebDriver ldriver, WebElement ele) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isEnabled(WebDriver ldriver, WebElement ele) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean selectBySendkeys(String value, WebElement ele) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean selectByIndex(WebElement element, int index) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean selectByValue(WebElement element, String value) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean selectByVisibleText(String visibletext, WebElement ele) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean mouseHoverByJavaScript(WebElement locator) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean JSClick(WebDriver driver, WebElement ele) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean switchToFrameByIndex(WebDriver driver, int index) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean switchToFrameById(WebDriver driver, String idValue) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean switchToFrameByName(WebDriver driver, String nameValue) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean switchToDefaultFrame(WebDriver driver) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean moveToElement(WebDriver driver, WebElement ele) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean draganddrop(WebDriver driver, WebElement source, WebElement target) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean rightclick(WebDriver driver, WebElement ele) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean switchWindowByTitle(WebDriver driver, String windowTitle, int count) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean switchToNewWindow(WebDriver driver) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean switchToOldWindow(WebDriver driver) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public int getColumncount(WebElement row) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getRowCount(WebElement table) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean Alert(WebDriver driver) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean launchUrl(WebDriver driver, String url) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isAlertPresent(WebDriver driver) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public String getCurrentURL(WebDriver driver) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean click1(WebElement locator, String locatorName) {
				// TODO Auto-generated method stub
				return false;
			}
			

			@Override
			public void fluentWait(WebDriver driver, WebElement element, int timeOut) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void explicitWait(WebDriver driver, WebElement element, int timeOut) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void pageLoadTimeOut(WebDriver driver, int timeOut) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public String screenShot(WebDriver driver, String filename) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getCurrentTime() {
				// TODO Auto-generated method stub
				return null;
			}
				
				
}
	   
		
	

