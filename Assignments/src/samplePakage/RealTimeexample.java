package samplePakage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

 

public class RealTimeexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver","G:\\Workspace\\learnSelenium1\\lib\\Gikodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
        
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");  //navigate to the practise page
		
		Thread.sleep(1000);
		
	    WebElement Input =  driver.findElement(By.xpath("//div[@id ='checkbox-example']/fieldset/label[2]/input"));
	    
	    Input.click();
	    
	    Thread.sleep(3000);
	    
	  //Get text from the checked box
	    
	   String Option = Input.getAttribute("Value");
	   
		Thread.sleep(3000);
	   
	  //Select the drop down option same
	   
	   driver.findElement(By.cssSelector("#dropdown-class-example")).click();

	  // to select the type from the drop down option

	    Select Dropdown = new Select(driver.findElement(By.cssSelector("#dropdown-class-example")));

		Dropdown.selectByValue(Option);
		
	   // Enter the same Text at the Text box
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(Option);
		
		//Click on Alert button
		
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		// Check the Alert message get text
		
		Alert alt =driver.switchTo().alert();
		
		String AlertMessage = alt.getText();
		
		System.out.println(AlertMessage);
		
		Thread.sleep(3000);
		
		 alt.accept();
		
		 if(AlertMessage.contains(Option))

	     {

	    System.out.println("Alert message success");

	     }

	     else

	    System.out.println("Something wrong with execution");

	}
		
		
	}
