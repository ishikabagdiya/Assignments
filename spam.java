package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class spam {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ishik\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com//");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("btnLogin")).click();
    
	List<WebElement> spans = driver.findElements(By.tagName("span"));
	
	System.out.println("Span message is " +spans.size());
	
	for(WebElement w : spans)
	{
		System.out.println(w.getText());
	}
	driver.close();
    
	    System.out.println( driver.getTitle());
	   
}

}
