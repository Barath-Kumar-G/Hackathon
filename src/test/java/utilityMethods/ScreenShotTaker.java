package utilityMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotTaker {
	
	public static void BookshelvesScreenshot(WebDriver driver) {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File trg = new File(System.getProperty("user.dir") + "//ScreenShots//BookShelves.png");
			try {
	
				FileUtils.copyFile(src, trg);
	
			} catch (IOException e) {
	
				e.printStackTrace();
			}
		}
	
	public static void StudyChairsScreenshot(WebDriver driver) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(System.getProperty("user.dir") + "//ScreenShots//Chairs.png");
		try {

			FileUtils.copyFile(src, trg);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
public static void AnniversaryScreenshot(WebDriver driver) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(System.getProperty("user.dir") + "//ScreenShots//DayOfAnniversary.png");
		try {

			FileUtils.copyFile(src, trg);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public static void ErrorScreenshot(WebDriver driver) {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File trg = new File(System.getProperty("user.dir") + "//ScreenShots//ErrorMsg.png");
			try {
	
				FileUtils.copyFile(src, trg);
	
			} catch (IOException e) {
	
				e.printStackTrace();
			}
		}

}
