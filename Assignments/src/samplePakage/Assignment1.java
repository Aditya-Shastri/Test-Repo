package samplePakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver","G:\\Workspace\\learnSelenium1\\lib\\Gikodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
        
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
	
		driver.get("https://cleartrip.com");
		
		driver.findElement(By.id("DepartDate")).click();
		
			
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[6]")).click(); //select today date
		
		//click on njmber of paassanger 2 adults and 1 child
		
		Select drop = new Select(driver.findElement(By.id("Adults")));
		
		drop.selectByValue("2");
		
		//System.out.println("Adults selected:"+driver.findElement(By.id("Adults")).getText());
		
		
		Select drop1 =new Select(driver.findElement(By.id("Childrens")));
		
		drop1.selectByVisibleText("1");
		
		//System.out.println("Childrens selected:"+driver.findElement(By.id("Childrens")).getText());
		
		
		//clikc on more option navigation screen
		
		driver.findElement(By.cssSelector("#MoreOptionsDiv")).click();
		
		driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("IndiGo (6E)");
		
		//click on search button
		
		driver.findElement(By.cssSelector("#SearchBtn")).click();
		
		//print the error message
		
		System.out.println("Error is:"+driver.findElement(By.cssSelector("#homeErrorMessage")).getText());
		
	
		

	}

}
