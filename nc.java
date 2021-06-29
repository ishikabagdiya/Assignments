package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\ishik\\Desktop\\chromedriver_win32\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		      	      
		 driver.get("https://www.guru99.com/");
		 Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
	
		Thread.sleep(5000);
		driver.navigate().back();
		
		
		Thread.sleep(5000);
		driver.navigate().forward();
	}

}
