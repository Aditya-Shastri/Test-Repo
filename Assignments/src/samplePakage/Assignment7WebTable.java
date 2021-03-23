package samplePakage;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment7WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.gecko.driver","G:\\Workspace\\learnSelenium1\\lib\\Gikodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
        
		driver.manage().window().maximize();
			
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");  //navigate to the practice page
		
		Thread.sleep(2000);
		
		// 1.Print Number of rows present in the table include header
		
		WebElement Table = driver.findElement(By.xpath("//table[@id='product']"));
		
	    int CountHeader = Table.findElements(By.xpath("//table[@id='product']/tbody/tr/th[1]")).size();
	    
		int CountRows = Table.findElements(By.xpath("//table[@id='product']/tbody/tr/td[1][\"Rahul Shetty\"]")).size();
		
		int TotalRows = CountHeader + CountRows;
		
		System.out.println("Number of Rows present :" +TotalRows);
				
		//2. Print No column present in the table 
	    
	    int CountCol =  Table.findElements(By.xpath("//table[@id='product']/tbody/tr/th[\"Instructor\"][\"Course\"][\"Price\"]")).size();
		
        System.out.println("Number of Columns :" +CountCol);
        
		//3.2nd row content should be print
		
		WebElement Table_Element = Table.findElement(By.xpath("//table[@id='product']/tbody/tr[3]"));
		
		System.out.println("Row 2 Data :" + Table_Element.getText());	
		
		//3. print data of 2nd coloumn and 2 row
		
		List<WebElement> CourseData = Table.findElements(By.xpath("//table[@id='product']/tbody/tr/td[2]"));
		
		int CourseNumber = CourseData.size();
		
		for (int i = 0; i < CourseNumber; i++)
			
		{
			
			
			System.out.println("Course Available " +CourseData.get(i).getText());
			
			
		}
		
		
	}

}
