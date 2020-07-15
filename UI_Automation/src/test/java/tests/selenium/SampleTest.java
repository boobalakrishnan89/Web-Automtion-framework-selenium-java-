package tests.selenium;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base_Components.BasePage;
import pages.selenium.SamplePage;

public class SampleTest extends BasePage {
	
	
	@BeforeTest
	public void setValues() {

		testCaseName = "TC001 ";
		testDescription = "sample";
		nodes = "sample";
		authors = "user";
		category = "UI";
		dataSheetName = "";
	}

	@Test
	public void gsearch() {
		new SamplePage(driver,test)
		.typeSearch("selenium");
	}
	
}

