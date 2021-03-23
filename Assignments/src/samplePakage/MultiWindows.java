package samplePakage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "G:\\Workspace\\learnSelenium1\\lib\\Gikodriver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		// navigate to the testing website

		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		
		String parentWindowId = driver.getWindowHandle();
		
		System.out.println("Parent Window Id :" + parentWindowId);
		
		System.out.println("Parent Window Title: " +driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText()); // Opening New Window
				
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();  // navigate to the Child Window
		
		Thread.sleep(2000);
			
		//Switch to new Window
		
		Set<String>Ids = driver.getWindowHandles();
		
		int allWindows = Ids.size();
		
		System.out.println("Number of Windows open : " +allWindows);
		
		for (String Child:Ids)
		{
			if(!parentWindowId.equalsIgnoreCase(Child))
				
			{
				driver.switchTo().window(Child);
				
				System.out.println("After Switching Child Title: " +driver.findElement(By.xpath("//div/h3")).getText());  // new window
				
				System.out.println("Child id print :" +Child);
				
				Thread.sleep(2000);
				
				driver.close();
			}
		}
				
		//Giving  control BACK
		
		driver.switchTo().window(parentWindowId);
				
		System.out.println("After Giving control back Title: "+driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText()); // opening new window
		
		

	}

}
