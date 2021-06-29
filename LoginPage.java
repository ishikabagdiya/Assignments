package locators;

import org.testng.annotations.Test;
import locators.method.Method;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginPage {
	
	public static WebDriver driver;

@BeforeClass
		public void setUp() throws IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ishik\\Desktop\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
		 
		 }
		
		
@Test
		public void loginTest() throws IOException {
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");	
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String pageTitle = driver.getTitle();							 
		System.out.println("The title of this page is ===> " +pageTitle);
		
		driver.findElement(By.id("txtUsername")).clear();	
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");	
		
		Method.screenshotPath();
		NewMethod.screen();
		
		 System.out.println("the login page screenshot is taken");
		//enter the locator of login button and click
			driver.findElement(By.id("btnLogin")).click();
			
		}
		@Test
		public void search() throws IOException {
              //wait for the page to load
		        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
					
		        //search an employee by providing the name,role and status
		        driver.findElement(By.linkText("Admin")).click();
					
		        driver.findElement(By.xpath("//input[@id = 'searchSystemUser_userName']")).clear();
		         driver.findElement(By.xpath("//input[@id = 'searchSystemUser_userName']")).sendKeys("Chris Evans");
					
		        Select selectRole = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		        selectRole.selectByVisibleText("Admin");
		        driver.findElement(By.id("searchSystemUser_employeeName_empName")).clear();
		        driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Test 1");
					
		        Select selectStatus = new Select (driver.findElement(By.id("searchSystemUser_status")));
		        selectStatus.selectByVisibleText("Enabled");
		        driver.findElement(By.id("searchBtn")).click();
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        Method.screenshotPath();
				 NewMethod.screen();
		        
					System.out.println("the userStatus screenshot is taken");
		}
		@AfterClass
			public void tearDown() {
			driver.quit();
				}		
		}
		