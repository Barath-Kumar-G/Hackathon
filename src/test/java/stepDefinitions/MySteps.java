package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testCases.BaseTest;
import testCases.BookShelf;
import testCases.Chairs;
import testCases.GiftCustomize;

public class MySteps {
	
	BaseTest baseTest = new BaseTest();
	
	@Given("Launching urbanLadder website in chrome")
	public void Launching_urbanLadder_website_in_chrome() throws InterruptedException {
		baseTest.setup("chrome");
	}

	@Then("clicking the bookshelves and displaying the first three products")
	public void clicking_the_bookshelves_and_displaying_the_first_three_products() throws InterruptedException {
		BookShelf shelf = new BookShelf();
		shelf.clickProduct();
		shelf.DisplayProduct();
	}

	@Then("displaying the price of chairs that are recommended")
	public void displaying_the_price_of_chairs_that_are_recommended() throws InterruptedException {
	   Chairs furniture = new Chairs();
	   
	   furniture.clickChairs();
	   furniture.Displayprice();
	   furniture.home();
	
	}

	@Then("customising the giftcard and displaying the error message")
	public void customising_the_giftcard_and_displaying_the_error_message() throws InterruptedException {
		GiftCustomize gift = new GiftCustomize();
		gift.clickCards();
		gift.CustomizeCards();
	}

	@Then("Closing the browser")
	public void closing_the_browser() {
		baseTest.tearDown();
	}

}
