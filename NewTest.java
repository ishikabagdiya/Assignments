package locators;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
  @Test(dataProvider = "getData")
  public void Login(String un, String pwd) throws InterruptedException {
	  
	  driver.manage().timeouts().implicitlyWait(300,  TimeUnit.SECONDS);
		CharSequence n = null;
		driver.findElement(By.id("txtUsername")).sendKeys(un);
		CharSequence s = null;
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.partialLinkText("Welcome")).click();
			driver.findElement(By.linkText("Logout")).click();
		
        
  }

  @DataProvider
  public Object[][] getData()
  {
	  
     Object[][] data = new Object[4][2];
    		 
      data[0][0] = "Admin";
      data[0][1] = "admin123";
      
      data[1][0] = "Admin";
      data[1][1] = "admin123";
      
      data[2][0] = "Admin";
      data[2][1] = "admin123";
      
      data[3][0] = "Admin";
      data[3][1] = "admin123";
      
      return data;
      }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ishik\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	 driver.get("https://opensource-demo.orangehrmlive.com/");
  }

  @AfterTest
  public void afterTest() 
  {
	driver.close();
  }

}
