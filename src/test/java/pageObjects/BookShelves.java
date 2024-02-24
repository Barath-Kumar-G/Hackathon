package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilityMethods.ScreenShotTaker;

public class BookShelves {
	
    public WebDriver driver;
	
	public BookShelves(WebDriver driver){
		this.driver = driver;
	}
	By storage= By.xpath("(//span[@class='topnav_itemname'])[6]");
	By bookshelf=By.xpath("(//span[text()='Bookshelves'])[2]");
	By price= By.xpath("(//div[@class='gname'])[1]");
	By radio= By.id("price_limit_9000-15999");
	By Storage=By.xpath("(//div[@class='gname'])[2]");
	By open=By.xpath("//input[@id='filters_storage_type_Open']");
	By out=By.id("filters_availability_In_Stock_Only");
	By firstpro=By.xpath("(//span[@class='name'])[1]");
	By secondpro=By.xpath("(//span[@class='name'])[2]");
	By thirdpro=By.xpath("(//span[@class='name'])[3]");
	By firstprice=By.xpath("(//div[@class='price-number']//span)[1]");
	By secondprice=By.xpath("(//div[@class='price-number']//span)[2]");
	By thirdprice=By.xpath("(//div[@class='price-number']//span)[3]");
	
	By close= By.xpath("//a[@class='close-reveal-modal hide-mobile']");
	
	public void ClickBookshelves() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement btn= wait1.until(ExpectedConditions.visibilityOfElementLocated(storage));
		Thread.sleep(5000);
		btn.click();
		WebElement btn1= wait1.until(ExpectedConditions.visibilityOfElementLocated(bookshelf));
		Thread.sleep(5000);
		//ScreenShotTaker.BookshelvesScreenshot(driver);
		btn1.click();
		ScreenShotTaker.BookshelvesScreenshot(driver);
		//driver.findElement(bookshelf).click();
		driver.findElement(close).click();
	}
	
	public void Filters() throws InterruptedException {
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement btn2= wait2.until(ExpectedConditions.visibilityOfElementLocated(price));
		Thread.sleep(5000);
		btn2.click();
		WebElement btn3= wait2.until(ExpectedConditions.visibilityOfElementLocated(Storage));
		btn3.click();
		WebElement btn4= wait2.until(ExpectedConditions.visibilityOfElementLocated(open));
		btn4.click();
		//driver.findElement(close).click();
		Thread.sleep(5000);
		WebElement btn5= wait2.until(ExpectedConditions.visibilityOfElementLocated(out));
		btn5.click();
		Thread.sleep(5000);
//		driver.findElement(price).click();
//		driver.findElement(Storage).click();
//		driver.findElement(open).click();
//		driver.findElement(out).click();
	}
	public void getProductNameAndPrice() {
		String pro1=driver.findElement(firstpro).getText();
		//System.out.println(pro1);
		String pro2=driver.findElement(secondpro).getText();
		//System.out.println(pro2);
		String pro3=driver.findElement(thirdpro).getText();
		//System.out.println(pro3);
		String price1=driver.findElement(firstprice).getText();
		//System.out.println(price1);
		String price2=driver.findElement(secondprice).getText();
		//System.out.println(price2);
		String price3=driver.findElement(thirdprice).getText();
		//System.out.println(price3);
		System.out.println("Name:"+pro1+",  price:"+price1);
		System.out.println("Name:"+pro2+",  price:"+price2);
		System.out.println("Name:"+pro3+",  price:"+price3);
	}
	

}
