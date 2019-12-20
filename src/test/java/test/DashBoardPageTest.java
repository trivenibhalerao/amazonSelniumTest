package test;



import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import lib.TakeScreenshot;
import pages.DashBoardPage;


public class DashBoardPageTest extends BaseClass
{

	DashBoardPage Dash;

	public DashBoardPageTest()
	{
		super();
	}

	@BeforeTest 
	public void DashBoardIntialize()
	{
		Dash=new DashBoardPage();
	}

	@Test(priority=1, description="Search and get")
	public void AmazonSearchPage() throws Exception 
	{
		logger1 = extent.createTest("Mobile Serach on Amzaon Page");
		Thread.sleep(2000);
		Dash.MobileSearch();
		TakeScreenshot.captuerScreenshot(driver, "MobileSearch");

	}

	@Test(priority=2,description="Search and get the list of all mobile")
	public void ClickonContactPage() throws Exception 
	{
		logger1 = extent.createTest("Search for mobiles");
		Dash.ClickonSorting();
		String Tittle=Dash.mobilesSearchValidation();
		Assert.assertEquals(Tittle, "Amazon.in: mobile: Galaxy M10s | AMS");
		Dash.clickOnFirstProduct();
		logger.info("Moved to m4o mobile");
		TakeScreenshot.captuerScreenshot(driver, "myMobile");

	}
	
	


}
