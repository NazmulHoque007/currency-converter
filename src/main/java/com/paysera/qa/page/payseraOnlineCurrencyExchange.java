package com.paysera.qa.page;

import java.awt.List;
import java.nio.channels.Selector;

import javax.xml.xpath.XPath;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.paysera.qa.testbase.TestBase;

public class payseraOnlineCurrencyExchange extends TestBase {
	
	//Page Factory - OR:
		@FindBy(xpath = "//input[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty']")
		WebElement sell_amount;
		
		@FindBy(xpath = "/html/body/main/article/section[3]/div/div[3]/div/div/div[2]/div[1]/form/div[1]/div/div[1]/span")
		WebElement select_currency1;
		
		@FindBy(xpath="//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']")
		WebElement buy_amount;
		
		@FindBy(xpath="/html/body/main/article/section[3]/div/div[3]/div/div/div[2]/div[1]/form/div[3]/div/div[1]")
		WebElement select_currency;
		
		@FindBy(xpath="//button[contains(text(),'Filter')]")
		WebElement filter_button;
		
		@FindBy(id="button#countries-dropdown")
		WebElement select_country;
		
		//Initializing the Page Objects:
		public payseraOnlineCurrencyExchange(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:

	  public String validateCurrencyExchangePageTitle(){
		  
		  
		  return driver.getTitle(); 
		  
	  }
	  
		/*
	 * public boolean validateCRMImage(){ return crmLogo.isDisplayed(); }
	 */
	/*
	 * public payseraOnlineCurrencyExchange start(){
	 * 
	 * 
	 * return new payseraOnlineCurrencyExchange(); }
	 */
	  public void insert_sell_amount (String amount)
	  {
		  sell_amount.sendKeys(String.valueOf(amount));
		  
	  }
	  public void select_currency(String currency) {
		  
		  driver.findElement(By.xpath("/html/body/main/article/section[3]/div/div[3]/div/div/div[2]/div[1]/form/div[1]/div/div[1]/span")).click();
		  
		  Select select = new Select(select_currency1);
		  select.selectByVisibleText(currency);
		  
		  
	  }
	  public void click_fliter_button()
	  {
		  filter_button.click();
	  }
	  
	  
	  
	  

}
