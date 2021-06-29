package locators;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class assigndrop
{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ishik\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
	
		//specify the LambdaTest URL
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.get("file:///C:/Users/ishik/Desktop/multiple.html");
		
		WebElement lb = driver.findElement(By.name("cars"));
		
		Select cars= new Select(lb);
		
		if(cars.isMultiple())
		{
			cars.selectByIndex(0);
			cars.selectByIndex(2);
			cars.selectByVisibleText("Audi");
		}
		
		List<WebElement> selCars = cars.getAllSelectedOptions();
 		
		System.out.println("Selected cars ");
		
		for(WebElement we : selCars)
		{
			
			System.out.println(we.getText());
		}
			
			
		driver.close();
	}

}









WebElement opti = driver.findElement(By.xpath("//select[@id='first']"));
Select Products = new Select(opti);

System.out.println("default option is " + Products.getFirstSelectedOption().getText());

List<WebElement> Brand = Products.getOptions();

System.out.println("Number of countires " +Brand.size());

Products.selectByVisibleText("Google");

//Products.selectByValue("82");

//	nations.selectByIndex(82);

System.out.println("Choosen value is : " + Products.getFirstSelectedOption().getText());
//----------------------------------------------------------------------------------------------
WebElement opt = driver.findElement(By.id("animals"));
Select Animals = new Select(opt);

System.out.println("default option is " + Animals.getFirstSelectedOption().getText());

List<WebElement> Braand = Animals.getOptions();
System.out.println("Number of countires " +Braand.size());
Animals.selectByVisibleText("Avatar");
System.out.println("Choosen value is : " + Animals.getFirstSelectedOption().getText());
--------------------------------------------------------------------------------------------------------
<sourceDirectory>src</sourceDirectory>

C:\Users\ishik\eclipse-workspace\Framework\src\a\src\main\java\ExtentReport
C:\\Users\\ishik\\Desktop\\chromedriver_win32\\chromedriver.exe