package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nctool {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\ishik\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.demo.guru99.com/test/social-icon.html");
	
	//Thread.sleep(50000);
	List<WebElement> toolTip = driver.findElements(By.xpath(".//*[@id='top-bar']/div/div/div/div/a"));
	
	for(WebElement we : toolTip)
	{
		System.out.println("Actual tool tip  " +we.getAttribute("title"));
	}
}

}


