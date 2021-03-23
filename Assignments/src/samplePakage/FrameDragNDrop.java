package samplePakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class FrameDragNDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "G:\\Workspace\\learnSelenium1\\lib\\Gikodriver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		// navigate to the testing website

		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(2000);
				
		WebElement FrameId = driver.findElement(By.cssSelector("iframe.demo-frame"));
				
		//shift to Frame
		
		driver.switchTo().frame(FrameId);
		
		// Drag and Drop the operation
		
		Actions Drag = new Actions(driver);
		
		WebElement DragId = driver.findElement(By.id("draggable"));
		
		WebElement DropId = driver.findElement(By.id("droppable"));
		
		
		Drag.dragAndDrop(DragId, DropId).build().perform();
		
		// check if the object has been dragged and dropped successfully
		
		Thread.sleep(2000);
		
		WebElement newDroppedId = driver.findElement(By.xpath("//div[@class ='ui-widget-header ui-droppable ui-state-highlight']"));
		
		boolean status = newDroppedId.isDisplayed();
		
		if (status = true)
		{
			System.out.println("Object has been dropped !");
			
		}
			
		else
		{
			System.out.println("Please try Again ");
		}
		
		
				
	}

}
