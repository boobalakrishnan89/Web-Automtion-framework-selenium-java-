package pages.selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import base_Components.BasePage;

public class SamplePage extends BasePage{

	public SamplePage(EventFiringWebDriver driver, ExtentTest test) {	
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver,this);
	}
	
	// google search 
	@FindBy(name = "q") 
	private WebElement  gSearch;
	
	@FindBy(css=".sbl1")
	private List<WebElement> allSearches;
	
	public SamplePage typeSearch(String data) {
		type(gSearch, data);
		 List<WebElement> searches =  allSearches;
		for (WebElement search : searches) {
			
			System.out.println(search.getText());
			if(search.getText().equalsIgnoreCase("selenium grid")) {
				verifyExactText(search, "selenium grid"); 
			}
		}
		return this;
	}
	
}
