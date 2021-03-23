package samplePakage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.gecko.driver","G:\\Workspace\\learnSelenium1\\lib\\Gikodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
        
		driver.manage().window().maximize();
			
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");  //navigate to the practice page
		
		//Thread.sleep(2000);
		
		WebElement AutoDrop = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		
		AutoDrop.sendKeys("Ind");
		
		Thread.sleep(2000);
		
		for ( int i = 0 ; i <3 ; i ++)
		
		{
		
		  AutoDrop.sendKeys(Keys.ARROW_DOWN);
		
		}
		
		//String ActualOutput = AutoDrop.getText(); //will not work here use JavaScript
		
		AutoDrop.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String Script = "return document.getElementById(\"autocomplete\").value;";
		
		String ActualOutput = (String) js.executeScript( Script);
		
		String ExpectedOutput = "Indonesia";
		
		//System.out.println("Your Output is :" +ActualOutput);
		
		while (ActualOutput.equalsIgnoreCase("Indonesia"))
				{
			
			System.out.println("Test Pass");
			
			System.out.println("Your Output is :" +ActualOutput);	
			
			 break;
			
				}
		
		
		
		
	

}
}
