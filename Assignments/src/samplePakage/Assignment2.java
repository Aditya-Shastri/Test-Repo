package samplePakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","G:\\Workspace\\learnSelenium1\\lib\\Gikodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://login.salesforce.com");
		
			driver.manage().window().maximize();
			
			//Test Case 1 : Enter incorrect user name and click login
			
			driver.findElement(By.id("username")).sendKeys("Aditya");
			
			driver.findElement(By.id("Login")).click();  //click to login
			
			WebElement element= driver.findElement(By.id("error"));
			
			boolean status =element.isDisplayed();
			
			if (status = true ) 
			{
				System.out.println("Elemnet found Test Case 1 Executed! ");
			}
			
			else
			{
				System.out.println(" Element not found! Test Case 1 Failed ");
			}
			
			//driver.navigate().refresh();
			
			//System.out.println(" Test Case 1 Executed ");
			
			//Test Case 2 : Enter incorrect password


			driver.findElement(By.id("password")).sendKeys("Password1");
			
										
			driver.findElement(By.id("Login")).click();  //click to login
			
			
			//driver.navigate().refresh();
			
			System.out.println(" Test Case 2 Executed ");
			
			driver.get("https://login.salesforce.com");
			
			//driver.navigate().refresh();

			//Test Case 3 :Enter username and password :
			
			driver.findElement(By.id("username")).sendKeys("Aditya");  //enter username
			
			driver.findElement(By.id("password")).sendKeys("Password1"); //enter password
			
			driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
						
			driver.findElement(By.id("Login")).click();  //click to login
				
			
			//driver.findElement(By.className("loginError")).getAttribute(null);
			
			//driver.findElement(By.xpath("//*[@id='error']"));
			
            WebElement element1= driver.findElement(By.className("loginError"));
			
			boolean status1 =element1.isDisplayed();
			
			if (status1 = true ) 
			{
				System.out.println("Elemnet found Test Case 3 Executed! ");
			}
			
			else
			{
				System.out.println(" Element not found! Test Case 3 Failed ");
			}
			
			
		//check if Sales force logo is available on the home screen
			
			WebElement element2= driver.findElement(By.xpath("//*[@id='logo']"));
			
			boolean status3 =element2.isDisplayed();
			
			if (status3 = true ) 
			{
				System.out.println("Sales Force logo Found ");
			}
			
			else
			{
				System.out.println(" Element not found! it is a defect ");
			}
			
			
	}

}
