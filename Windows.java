package locators;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows
{

	
	public static void main(String[] args) throws InterruptedException
			{ 
				// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ishik\\Desktop\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver =new ChromeDriver();
			
				//specify the LambdaTest URL
				//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
				
				driver.manage().window().maximize();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				System.out.println(driver.getCurrentUrl());
			     System.out.println( driver.getPageSource());
				    System.out.println( driver.getTitle());
				driver.findElement(By.id("btnLogin")).click();
				
				System.out.println("WindowHandle : " +driver.getWindowHandle());
				
				driver.findElement(By.xpath(".//*[@id='branding']/a[1]/img")).click();
				
				Set<String> winhld = driver.getWindowHandles();
				Iterator<String> itr = winhld.iterator();
			
				System.out.println("Window handles of main window : " +itr.next());
				
				System.out.println("Window hansdle of new main window : " +itr.next());
				
				itr = winhld.iterator();
				
				String mainWindow = itr.next();
				String newWindow = itr.next();
				
				
				System.out.println("Window hansdle of new main window : " +itr.next());
				
				itr = winhld.iterator();
				
				String mainWindow1 = itr.next();
				String newWindow1 = itr.next();
				
				driver.switchTo().window(newWindow1);
				
				System.out.println("Title is : " + driver.getTitle());
				
				driver.switchTo().window(mainWindow1);
				
				driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
				
				
				driver.findElement(By.id("welcome")).click();
				
				driver.findElement(By.linkText("Logout")).click();

	}

}
