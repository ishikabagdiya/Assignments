package locators;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class assignment_Test 
{
	WebDriver driver;
	
  @Test(dataProvider = "getData")
  
  public void add(String name, String last) throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(300,  TimeUnit.SECONDS);
	  
	  driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.xpath(".//*[@id='menu_pim_addEmployee']")).click();
		CharSequence n = null;
		driver.findElement(By.id("firstName")).sendKeys(name);
		CharSequence s = null;
		driver.findElement(By.id("lastName")).sendKeys(last);
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("personal_optGender_2")).click();
		driver.findElement(By.id("btnSave")).click();
	  
  }

  @DataProvider
  public Object[][] getData()
  {
	  
     Object[][] data = new Object[4][2];
    		 
      data[0][0] = "Ishika";
      data[0][1] = "Bagdiya";
      
      data[1][0] = "Ishita";
      data[1][1] = "Bagdiya";
      
      return data;
    }
  
  @BeforeTest
  
	  public void beforeTest() {
		   
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ishik\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	 
  }
	
	
  @AfterTest
  public void afterTest()
  {
	  driver.findElement(By.partialLinkText("Welcome")).click();
	  driver.findElement(By.linkText("Logout")).click();
	   driver.close();
  }

}
