package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alert {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ishik\\Desktop\\chromedriver_win32\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

try {
    Thread.sleep(3000);
} catch(InterruptedException e) {
    System.out.println("got interrupted!");
}
    
		
		
        String expMsg = "I am JavaScript Alert", actMsg=null;
        
		driver.get("file:///C:/Users/ishik/Desktop/Alert.html");
		driver.findElement(By.xpath(".//*[@id='btnAlert']")).click();
		
		
	 driver.switchTo().alert().dismiss();
		
		//a.accept();
		//a.dismiss();
		
		driver.switchTo().defaultContent();
		      	      
		     driver.get("https://opensource-demo.orangehrmlive.com/");
		     driver.findElement(By.xpath(".//*[@id='btnAlert']")).click();
				
				org.openqa.selenium.Alert a = driver.switchTo().alert();
				
				actMsg = a.getText();
				
				if(actMsg.equals(expMsg))
				{
					System.out.println("Correct message \n " +actMsg);
				}
				else
					{ System.out.println("Wrong message \n " +actMsg);
					}
				//a.accept();
				 a.dismiss();
				
				driver.switchTo().defaultContent();
				driver.close();

	}

}
