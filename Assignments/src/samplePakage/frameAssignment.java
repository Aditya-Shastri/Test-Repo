package samplePakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class frameAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "G:\\Workspace\\learnSelenium1\\lib\\Gikodriver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		// navigate to the testing website

		driver.manage().window().maximize();
	
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')] ")).click();
		
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-middle");
		
		WebElement Title = driver.findElement(By.xpath("//div[@id='content']"));
		
		System.out.println("Middle Frame Title :" +Title.getText());
		

	}

	
}
