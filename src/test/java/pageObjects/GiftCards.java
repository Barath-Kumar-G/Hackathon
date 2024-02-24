package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilityMethods.ScreenShotTaker;

public class GiftCards {
    public WebDriver driver;
	
	public GiftCards(WebDriver driver){
		this.driver = driver;
	}
	
	By gift=By.xpath("//a[text()=' Gift Cards ']");
	By choose=By.xpath("(//h2[@class='_FCNL'])[1]");
	By birthday=By.xpath("//h3[text()='Birthday/Anniversary']");
	By rupees=By.xpath("(//button[@class='HuPJS'])[1]");
	By next=By.xpath("//button[text()='Next']");
	By recipientName=By.name("recipient_name");
	By recipientMobile=By.name("recipient_mobile_number");
	By yourName=By.name("customer_name");
	By yourMobile=By.name("customer_mobile_number");
	By address=By.name("customer_address");
	By pincode=By.name("zip");
	By text=By.xpath("//div[@class='_1HVuH']");
	By confirm=By.xpath("//button[text()='Confirm']");
	
	public void ClickBirthday() throws InterruptedException {
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement btn8= wait4.until(ExpectedConditions.visibilityOfElementLocated(gift));
		btn8.click();
		//driver.findElement(gift).click();
		
		WebElement birth = driver.findElement(choose);
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("arguments[0].scrollIntoView(true);", birth);
		WebElement ann=driver.findElement(birthday);
		ann.click();
		ScreenShotTaker.AnniversaryScreenshot(driver);
		Thread.sleep(5000);
	}
	public void Customize() throws InterruptedException {
		driver.findElement(rupees).click();
		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement btn9= wait5.until(ExpectedConditions.visibilityOfElementLocated(next));
		btn9.click();
		//driver.findElement(next).click();
		driver.findElement(recipientName).sendKeys("lav");
		driver.findElement(recipientMobile).sendKeys("12345678");
		driver.findElement(yourName).sendKeys("bar");
		driver.findElement(yourMobile).sendKeys("9876543210");
		driver.findElement(address).sendKeys("india");
		driver.findElement(pincode).sendKeys("6000");
		Thread.sleep(4000);
		ScreenShotTaker.ErrorScreenshot(driver);
		String msg=driver.findElement(text).getText();
		System.out.println(msg);
		WebElement btn0= wait5.until(ExpectedConditions.visibilityOfElementLocated(confirm));
		btn0.click();
		//ScreenShotTaker.ErrorScreenshot(driver);
		//driver.findElement(confirm).click();
	}
}
