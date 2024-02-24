package testCases;

import org.testng.annotations.Test;

import pageObjects.GiftCards;

public class GiftCustomize extends BaseTest{
	public GiftCards cards;
	
	@Test(priority = 1)
	public void clickCards() throws InterruptedException {
		cards=new GiftCards(driver);
		
		cards.ClickBirthday();
	}
	
	@Test(priority = 2)
	public void CustomizeCards() throws InterruptedException {
		cards.Customize();
	}

}
