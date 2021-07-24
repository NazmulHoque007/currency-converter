package com.paysera.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.paysera.qa.page.payseraOnlineCurrencyExchange;
import com.paysera.qa.testbase.TestBase;


public class payseraOnlineCurrencyExchangeTest extends TestBase {
	
	payseraOnlineCurrencyExchange PayseraOnlineCurrencyExchange;
	
	public payseraOnlineCurrencyExchangeTest() {
		
		super();
		
	}
	
	@BeforeMethod
	public void setUp(){
	      initialization();
		PayseraOnlineCurrencyExchange = new payseraOnlineCurrencyExchange();
	
	}
	
	@Test
	public void exchangepageTest(){
		String title = PayseraOnlineCurrencyExchange.validateCurrencyExchangePageTitle();
		Assert.assertEquals(title, "Online Currency Exchange");
	}
	
	@Test
	public void sellamountTest(){
		 PayseraOnlineCurrencyExchange.insert_sell_amount(prop.getProperty("SellAmount"));
	}
	
	@Test
	public void selectCurrency() {
		
		PayseraOnlineCurrencyExchange.select_currency("USD");
		
	}
	
	@Test
	public void clickFilterButton() {
		
		PayseraOnlineCurrencyExchange.click_fliter_button();
		
	}
	
	
	
	
		
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
		
	
	
	

}
