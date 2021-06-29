package locators;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class method {

	public static class Method extends LoginPage{
			
			public static String screenshotPath() throws IOException 
			{
				SimpleDateFormat sdf = new SimpleDateFormat("hh-mm-ss");
				String timeStamp = sdf.format(new Date());
				File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				File dest = new File("C:\\screenShot\\ss"+timeStamp+".png");
				FileUtils.copyFile(src,dest);
				String path = dest.getAbsolutePath();
				return path;
			}

		}
}
