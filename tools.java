package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class tools {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ishik\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
	
		//specify the LambdaTest URL
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
				
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		
		driver.switchTo().alert().accept();
driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		
		driver.findElement(By.linkText(
	
}

	
	}


	
	
