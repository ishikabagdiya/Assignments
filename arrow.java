package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class arrow 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\ishik\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
	
	
	
	
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement we = driver.findElement(By.linkText("Gmail"));
	
	Actions a = new Actions(driver);
	
	a.contextClick(we).perform();
	//a.contextClick(we).perform();
	
	a.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	a.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	a.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(2000);
	a.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	driver.close();

}
}
