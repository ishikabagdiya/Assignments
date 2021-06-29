package locators;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class dropdown
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
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.xpath(".//*[@id='menu_pim_addEmployee']")).click();
		driver.findElement(By.id("firstName")).sendKeys("Ishika");
		driver.findElement(By.id("lastName")).sendKeys("Bagdiya");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("personal_optGender_2")).click();
		//driver.findElement(By.id("btnSave")).click();
		
		
		
		WebElement opti = driver.findElement(By.id("personal_cmbNation"));
		
		Select nations = new Select(opti);
		
		System.out.println("default option is " + nations.getFirstSelectedOption().getText());
		
		
		
		List<WebElement> countries = nations.getOptions();
		
		System.out.println("Number of countires " +countries.size());
		
		

		nations.selectByVisibleText("Indian");
		
//		nations.selectByValue("82");
		
		//nations.selectByIndex(82);
		
		System.out.println("Choosen value is : " + nations.getFirstSelectedOption().getText());
		
	
		//driver.close();
		
		
			
		
			
	}
}


