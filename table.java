package locators;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class table {

	public static void main(String[] args) {
		By driver;
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElements(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		List<WebElement> columns = driver.findElements(By.xpath(".//*[@id='resultTable']/thead/tr/th"));
		System.out.println("No of columns : "+columns.size());
		
		List<WebElement> colHeadings = driver.findElements(By.xpath(".//*[@id='resultTable']/thead/tr/th/a"));
		for(WebElement we : colHeadings)
		{
			System.out.println("Column names are  : " + we.getText());
		}

	}

}
