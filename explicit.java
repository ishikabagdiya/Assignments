package locators;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\ishik\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//ExplicitWait until()
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout"))).click();
		
		driver.close();
	}

}
