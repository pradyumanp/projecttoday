package com.redbus.testpages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.redbus.base.BaseTest;
import com.redbus.pages.HomePage;

public class HomePageTest extends BaseTest {

	
	@BeforeTest
	public void test() {

		openBrowser("Firefox");

	}
	
	@Test
	public void Home_Page_Test() throws InterruptedException {

		HomePage homepg=new HomePage(driver);
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
		homepg.gettitle(driver);
		homepg.fromLocation("Pune");
		homepg.toLocation("Bangalore");
		homepg.selectDate();
		homepg.search();
	}
}
