package testCases;

import org.testng.annotations.Test;
import pageObjects.StudyChairs;

public class Chairs extends BaseTest {
	public StudyChairs stuchairs;
	
	@Test(priority = 1)
	public void clickChairs() throws InterruptedException {
		stuchairs = new StudyChairs (driver);
		
		stuchairs.ClickStudyChairs();
	}
	
	@Test(priority = 2, dependsOnMethods = {"clickChairs"})
	public void Displayprice() {
		stuchairs.getProductPrice();
	}
	
	@Test(priority=3)
	public void home() {
		stuchairs.Collections();
	}

}
