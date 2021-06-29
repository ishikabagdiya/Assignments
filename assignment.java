package locators;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class assignment {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.id("\"chkLogin\"")).click();
		
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.name("personal[chkSmokeFlag")).click(); 
		
		
		
		
		
		
		
		
		
		
		
		driver.findElement(By.linkText("Odis")).click();
		
		List<WebElement> genderLabel = driver.findElements(By.xpath(".//ul[@class='radio_list']/li/label"));
		
		for(WebElement web1 : genderLabel)
		{
			System.out.println(web1.getText());
		}
		System.out.println("Status befor clciking on edit buttons : ");
		
		
List<WebElement> gender = driver.findElements(By.xpath(".//ul[@class='radio_list']/li/input")); 
		
		for(WebElement web1 : gender)
		{
			System.out.println(web1.isEnabled());
		}
		
		
			
		driver.findElement(By.xpath(".//*[@id='btnSave']")).click();
		
		System.out.println("Status after clicking on save button ");
		
		for(WebElement web1 :gender)
		{
			System.out.println(web1.isEnabled());
		}
		
		
		WebElement web1 = driver.findElement(By.id("personal_optGender_2"));
		web1.click();	
		

	}

}
