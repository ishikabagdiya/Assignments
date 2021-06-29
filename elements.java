package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class elements
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ishik\\Desktop\\chromedriver_win32\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		      	      
		     driver.get("https://opensource-demo.orangehrmlive.com/");
		     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			    
		     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		     driver.findElement(By.id("btnLogin")).click();
		     System.out.println(driver.getCurrentUrl());
		     System.out.println( driver.getPageSource());
			    System.out.println( driver.getTitle());
			    driver.findElement(By.id("btnLogin")).click();
			     driver.findElement(By.partialLinkText("welcome"));
			    driver.close();
	}
}


