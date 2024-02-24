package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilityMethods.ScreenShotTaker;

public class StudyChairs {
	
    public WebDriver driver;
	
	public StudyChairs(WebDriver driver){
		this.driver = driver;
	}
	By study= By.xpath("(//span[@class='topnav_itemname'])[7]");
	By studychair=By.xpath("//a[@class='inverted']//span[text()='Study Chairs']");
	By firstprice=By.xpath("(//div[@class='price-number']//span)[1]");
	By secondprice=By.xpath("(//div[@class='price-number']//span)[2]");
	By thirdprice=By.xpath("(//div[@class='price-number']//span)[3]");
	static By menu=By.xpath("//li[@class='_1KFQA']");
	public void ClickStudyChairs() throws InterruptedException {
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement btn6= wait3.until(ExpectedConditions.visibilityOfElementLocated(study));
		btn6.click();
		//driver.findElement(study).click();
		WebElement btn7= wait3.until(ExpectedConditions.visibilityOfElementLocated(studychair));
		//ScreenShotTaker.StudyChairsScreenshot(driver);
		btn7.click();
		ScreenShotTaker.StudyChairsScreenshot(driver);
		Thread.sleep(3000);
		//driver.findElement(studychair).click();
	}
	public void getProductPrice() {
		String chair1=driver.findElement(firstprice).getText();
		System.out.println("First Product: "+chair1);
		String chair2=driver.findElement(secondprice).getText();
		System.out.println("Second Product: "+chair2);
		String chair3=driver.findElement(thirdprice).getText();
		System.out.println("Third Product: "+chair3);
	}
	
	public void Collections() {
		//List<WebElement> subMenuItems = driver.findElements(menu);
		List<WebElement> subMenuItems = driver.findElements(By.xpath("//li[@class='_1KFQA']"));
		for (WebElement item : subMenuItems) {
        System.out.println("Sub-menu items under Being-At-Home: "+item.getText());
        }		
	}
	
}
