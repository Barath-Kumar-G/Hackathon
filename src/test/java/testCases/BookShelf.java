package testCases;
import org.testng.annotations.Test;

import pageObjects.BookShelves;

public class BookShelf extends BaseTest {
	public BookShelves bookShelf;

	@Test(priority = 1)
	public void clickProduct() throws InterruptedException {
		bookShelf=new BookShelves(driver);
		bookShelf.ClickBookshelves();
	}
	
	@Test(priority = 2, dependsOnMethods = {"clickProduct"})
	public void DisplayProduct() throws InterruptedException {
		bookShelf.Filters();
		bookShelf.getProductNameAndPrice();
	}
		

}
